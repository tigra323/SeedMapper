package dev.xpple.seedmapper.command.commands;

import com.github.cubiomes.CubiomesHeaders;
import com.github.cubiomes.Generator;
import com.github.cubiomes.Pos;
import com.github.cubiomes.StructureConfig;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.xpple.seedmapper.command.CommandExceptions;
import dev.xpple.seedmapper.command.CustomClientCommandSource;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.WorldgenRandom;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.function.Supplier;

import static dev.xpple.seedmapper.command.arguments.BiomeArgument.*;
import static dev.xpple.seedmapper.command.arguments.StructureArgument.*;
import static dev.xpple.seedmapper.util.ChatBuilder.*;
import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.*;

public class LocateCommand {

    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        dispatcher.register(literal("sm:locate")
            .then(literal("biome")
                .then(argument("biome", biome())
                    .executes(ctx -> locateBiome(CustomClientCommandSource.of(ctx.getSource()), getBiome(ctx, "biome")))))
            .then(literal("feature")
                .then(literal("structure")
                    .then(argument("structure", structure())
                        .executes(ctx -> locateStructure(CustomClientCommandSource.of(ctx.getSource()), getStructure(ctx, "structure")))))
                .then(literal("slimechunk")
                    .executes(ctx -> locateSlimeChunk(CustomClientCommandSource.of(ctx.getSource()))))));
    }

    private static int locateBiome(CustomClientCommandSource source, int biome) throws CommandSyntaxException {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment generator = Generator.allocate(arena);
            CubiomesHeaders.setupGenerator(generator, source.getVersion(), 0);
            CubiomesHeaders.applySeed(generator, source.getDimension(), source.getSeed().getSecond());

            BlockPos center = BlockPos.containing(source.getPosition());

            spiral(center.getX(), center.getZ(), 6400, 32, (x, z) -> {
                if (CubiomesHeaders.getBiomeAt(generator, 1, x, 63, z) != biome) {
                    return false;
                }
                source.sendFeedback(chain(
                    highlight(Component.translatable("command.locate.biome.foundAt")),
                    highlight(" "),
                    copy(
                        hover(
                            accent("x: %d, z: %d".formatted(x, z)),
                            base(Component.translatable("chat.copy.click"))
                        ),
                        "%d ~ %d".formatted(x, z)
                    ),
                    highlight(".")
                ));
                return true;
            }, CommandExceptions.NO_BIOME_FOUND_EXCEPTION::create);
            return Command.SINGLE_SUCCESS;
        }
    }

    private static int locateStructure(CustomClientCommandSource source, int structure) throws CommandSyntaxException {
        try (Arena arena = Arena.ofConfined()) {
            int version = source.getVersion();
            MemorySegment structureConfig = StructureConfig.allocate(arena);
            int config = CubiomesHeaders.getStructureConfig(structure, version, structureConfig);
            if (config == 0) {
                throw CommandExceptions.INCOMPATIBLE_PARAMETERS_EXCEPTION.create();
            }
            long seed = source.getSeed().getSecond();

            MemorySegment generator = Generator.allocate(arena);
            CubiomesHeaders.setupGenerator(generator, version, 0);
            CubiomesHeaders.applySeed(generator, source.getDimension(), seed);

            BlockPos center = BlockPos.containing(source.getPosition());
            int regionSize = StructureConfig.regionSize(structureConfig) << 4;
            spiral(center.getX() / regionSize, center.getZ() / regionSize, Level.MAX_LEVEL_SIZE / regionSize, (x, z) -> {
                MemorySegment structurePos = Pos.allocate(arena);
                int valid = CubiomesHeaders.getStructurePos(structure, version, seed, x, z, structurePos);
                if (valid == 0) {
                    return false;
                }
                if (CubiomesHeaders.isViableStructurePos(structure, generator, Pos.x(structurePos), Pos.z(structurePos), 0) == 0) {
                    return false;
                }
                source.sendFeedback(chain(
                    highlight(Component.translatable("command.locate.feature.structure.foundAt")),
                    highlight(" "),
                    copy(
                        hover(
                            accent("x: %d, z: %d".formatted(Pos.x(structurePos), Pos.z(structurePos))),
                            base(Component.translatable("chat.copy.click"))
                        ),
                        "%d ~ %d".formatted(Pos.x(structurePos), Pos.z(structurePos))
                    ),
                    highlight(".")
                ));
                return true;
            }, () -> CommandExceptions.NO_STRUCTURE_FOUND_EXCEPTION.create(Level.MAX_LEVEL_SIZE));
            return Command.SINGLE_SUCCESS;
        }
    }

    private static int locateSlimeChunk(CustomClientCommandSource source) throws CommandSyntaxException {
        if (source.getDimension() != CubiomesHeaders.DIM_OVERWORLD()) {
            throw CommandExceptions.INVALID_DIMENSION_EXCEPTION.create();
        }
        long seed = source.getSeed().getSecond();
        ChunkPos center = new ChunkPos(BlockPos.containing(source.getPosition()));
        spiral(center.x, center.z, 6400, (x, z) -> {
            RandomSource random = WorldgenRandom.seedSlimeChunk(x, z, seed, 987234911L);
            if (random.nextInt(10) == 0) {
                int blockPosX = (x << 4) + 9;
                int blockPosZ = (z << 4) + 9;
                source.sendFeedback(chain(
                    highlight(Component.translatable("command.locate.feature.slimeChunk.foundAt")),
                    highlight(" "),
                    copy(
                        hover(
                            accent("x: %d, z: %d".formatted(blockPosX, blockPosZ)),
                            base(Component.translatable("command.locate.feature.slimeChunk.copy"))
                        ),
                        "%d ~ %d".formatted(blockPosX, blockPosZ)
                    ),
                    highlight(" ("),
                    highlight(Component.translatable("command.locate.feature.slimeChunk.chunk")),
                    highlight(" "),
                    copy(
                        hover(
                            accent(x + " " + z),
                            base(Component.translatable("command.locate.feature.slimeChunk.copyChunk"))
                        ),
                        "%d %d".formatted(x, z)
                    ),
                    highlight(").")
                ));
                return true;
            }
            return false;
        }, CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand()::create);
        return Command.SINGLE_SUCCESS;
    }

    private static void spiral(final int centerX, final int centerZ, final int radius, CoordinateCallback callback, Supplier<? extends CommandSyntaxException> failure) throws CommandSyntaxException {
        spiral(centerX, centerZ, radius, 1, callback, failure);
    }

    private static void spiral(final int centerX, final int centerZ, final int radius, final int step, CoordinateCallback callback, Supplier<? extends CommandSyntaxException> failure) throws CommandSyntaxException {
        int x = centerX, dx = 0, z = centerZ, dz = -step;
        final int leftBoundX = centerX - radius, rightBoundX = centerX + radius;
        final int bottomBoundZ = centerZ - radius, topBoundZ = centerZ + radius;
        final int max = (2 * radius) * (2 * radius);
        for (int i = 0; i < max ; i++) {
            if (leftBoundX <= x && x <= rightBoundX && bottomBoundZ <= z && z <= topBoundZ) {
                if (callback.consume(x, z)) {
                    return;
                }
            }
            if (x - centerX == z - centerZ || (x < centerX && x - centerX == centerZ - z) || (x > centerX && x - centerX == centerZ + step - z)) {
                final int temp = dx;
                dx = -dz;
                dz = temp;
            }
            x += dx;
            z += dz;
        }
        throw failure.get();
    }

    @FunctionalInterface
    private interface CoordinateCallback {
        boolean consume(int x, int z);
    }
}

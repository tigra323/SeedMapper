package dev.xpple.seedmapper.command.arguments;

import com.github.cubiomes.CubiomesHeaders;
import com.google.common.collect.ImmutableMap;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.xpple.seedmapper.command.CommandExceptions;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.commands.SharedSuggestionProvider;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class VersionArgument implements ArgumentType<Integer> {

    private static final Collection<String> EXAMPLES = Arrays.asList("1.21.1", "1.17.1", "1.15");

    //<editor-fold defaultstate="collapsed" desc="VERSIONS">
    private static final Map<String, Integer> VERSIONS = ImmutableMap.<String, Integer>builder()
        .put("b1.7", CubiomesHeaders.MC_B1_7())
        .put("b1.8", CubiomesHeaders.MC_B1_8())
        .put("1.0", CubiomesHeaders.MC_1_0())
        .put("1.1", CubiomesHeaders.MC_1_1())
        .put("1.2", CubiomesHeaders.MC_1_2())
        .put("1.3", CubiomesHeaders.MC_1_3())
        .put("1.4", CubiomesHeaders.MC_1_4())
        .put("1.5", CubiomesHeaders.MC_1_5())
        .put("1.6", CubiomesHeaders.MC_1_6())
        .put("1.7", CubiomesHeaders.MC_1_7())
        .put("1.8", CubiomesHeaders.MC_1_8())
        .put("1.9", CubiomesHeaders.MC_1_9())
        .put("1.10", CubiomesHeaders.MC_1_10())
        .put("1.11", CubiomesHeaders.MC_1_11())
        .put("1.12", CubiomesHeaders.MC_1_12())
        .put("1.13", CubiomesHeaders.MC_1_13())
        .put("1.14", CubiomesHeaders.MC_1_14())
        .put("1.15", CubiomesHeaders.MC_1_15())
        .put("1.16.1", CubiomesHeaders.MC_1_16_1())
        .put("1.16", CubiomesHeaders.MC_1_16())
        .put("1.17", CubiomesHeaders.MC_1_17())
        .put("1.18", CubiomesHeaders.MC_1_18())
        .put("1.19.2", CubiomesHeaders.MC_1_19_2())
        .put("1.19", CubiomesHeaders.MC_1_19())
        .put("1.20", CubiomesHeaders.MC_1_20())
        .put("1.21.2", CubiomesHeaders.MC_1_21_2())
        .put("1.21.3", CubiomesHeaders.MC_1_21_3())
        .put("1.21", CubiomesHeaders.MC_1_21())
        .put("1.21.1", CubiomesHeaders.MC_1_21())
        .build();
    //</editor-fold>

    public static VersionArgument version() {
        return new VersionArgument();
    }

    public static int getVersion(CommandContext<FabricClientCommandSource> context, String name) {
        return context.getArgument(name, Integer.class);
    }

    @Override
    public Integer parse(StringReader reader) throws CommandSyntaxException {
        int cursor = reader.getCursor();
        String versionString = reader.readUnquotedString();
        Integer version = VERSIONS.get(versionString);
        if (version == null) {
            reader.setCursor(cursor);
            throw CommandExceptions.UNKNOWN_VERSION_EXCEPTION.create(versionString);

        }
        return version;
    }

    @Override
    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return SharedSuggestionProvider.suggest(VERSIONS.keySet(), builder);
    }

    @Override
    public Collection<String> getExamples() {
        return EXAMPLES;
    }
}

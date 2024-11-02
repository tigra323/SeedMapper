// Generated by jextract

package com.github.cubiomes;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.*;
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang=c :
 * struct OctaveNoise {
 *     int octcnt;
 *     PerlinNoise *octaves;
 * }
 * }
 */
public class OctaveNoise {

    OctaveNoise() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CubiomesHeaders.C_INT.withName("octcnt"),
        MemoryLayout.paddingLayout(4),
        CubiomesHeaders.C_POINTER.withName("octaves")
    ).withName("OctaveNoise");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt octcnt$LAYOUT = (OfInt)$LAYOUT.select(groupElement("octcnt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int octcnt
     * }
     */
    public static final OfInt octcnt$layout() {
        return octcnt$LAYOUT;
    }

    private static final long octcnt$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int octcnt
     * }
     */
    public static final long octcnt$offset() {
        return octcnt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int octcnt
     * }
     */
    public static int octcnt(MemorySegment struct) {
        return struct.get(octcnt$LAYOUT, octcnt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int octcnt
     * }
     */
    public static void octcnt(MemorySegment struct, int fieldValue) {
        struct.set(octcnt$LAYOUT, octcnt$OFFSET, fieldValue);
    }

    private static final AddressLayout octaves$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("octaves"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PerlinNoise *octaves
     * }
     */
    public static final AddressLayout octaves$layout() {
        return octaves$LAYOUT;
    }

    private static final long octaves$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PerlinNoise *octaves
     * }
     */
    public static final long octaves$offset() {
        return octaves$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PerlinNoise *octaves
     * }
     */
    public static MemorySegment octaves(MemorySegment struct) {
        return struct.get(octaves$LAYOUT, octaves$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PerlinNoise *octaves
     * }
     */
    public static void octaves(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(octaves$LAYOUT, octaves$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

// Generated by jextract

package com.github.cubiomes;

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
 * struct Xoroshiro {
 *     uint64_t lo;
 *     uint64_t hi;
 * }
 * }
 */
public class Xoroshiro {

    Xoroshiro() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CubiomesHeaders.C_LONG_LONG.withName("lo"),
        CubiomesHeaders.C_LONG_LONG.withName("hi")
    ).withName("Xoroshiro");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong lo$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t lo
     * }
     */
    public static final OfLong lo$layout() {
        return lo$LAYOUT;
    }

    private static final long lo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t lo
     * }
     */
    public static final long lo$offset() {
        return lo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t lo
     * }
     */
    public static long lo(MemorySegment struct) {
        return struct.get(lo$LAYOUT, lo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t lo
     * }
     */
    public static void lo(MemorySegment struct, long fieldValue) {
        struct.set(lo$LAYOUT, lo$OFFSET, fieldValue);
    }

    private static final OfLong hi$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t hi
     * }
     */
    public static final OfLong hi$layout() {
        return hi$LAYOUT;
    }

    private static final long hi$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t hi
     * }
     */
    public static final long hi$offset() {
        return hi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t hi
     * }
     */
    public static long hi(MemorySegment struct) {
        return struct.get(hi$LAYOUT, hi$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t hi
     * }
     */
    public static void hi(MemorySegment struct, long fieldValue) {
        struct.set(hi$LAYOUT, hi$OFFSET, fieldValue);
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

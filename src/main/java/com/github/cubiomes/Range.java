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
 * struct Range {
 *     int scale;
 *     int x;
 *     int z;
 *     int sx;
 *     int sz;
 *     int y;
 *     int sy;
 * }
 * }
 */
public class Range {

    Range() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CubiomesHeaders.C_INT.withName("scale"),
        CubiomesHeaders.C_INT.withName("x"),
        CubiomesHeaders.C_INT.withName("z"),
        CubiomesHeaders.C_INT.withName("sx"),
        CubiomesHeaders.C_INT.withName("sz"),
        CubiomesHeaders.C_INT.withName("y"),
        CubiomesHeaders.C_INT.withName("sy")
    ).withName("Range");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt scale$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int scale
     * }
     */
    public static final OfInt scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int scale
     * }
     */
    public static final long scale$offset() {
        return scale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int scale
     * }
     */
    public static int scale(MemorySegment struct) {
        return struct.get(scale$LAYOUT, scale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int scale
     * }
     */
    public static void scale(MemorySegment struct, int fieldValue) {
        struct.set(scale$LAYOUT, scale$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt z$LAYOUT = (OfInt)$LAYOUT.select(groupElement("z"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int z
     * }
     */
    public static final OfInt z$layout() {
        return z$LAYOUT;
    }

    private static final long z$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int z
     * }
     */
    public static final long z$offset() {
        return z$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int z
     * }
     */
    public static int z(MemorySegment struct) {
        return struct.get(z$LAYOUT, z$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int z
     * }
     */
    public static void z(MemorySegment struct, int fieldValue) {
        struct.set(z$LAYOUT, z$OFFSET, fieldValue);
    }

    private static final OfInt sx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sx
     * }
     */
    public static final OfInt sx$layout() {
        return sx$LAYOUT;
    }

    private static final long sx$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sx
     * }
     */
    public static final long sx$offset() {
        return sx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sx
     * }
     */
    public static int sx(MemorySegment struct) {
        return struct.get(sx$LAYOUT, sx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sx
     * }
     */
    public static void sx(MemorySegment struct, int fieldValue) {
        struct.set(sx$LAYOUT, sx$OFFSET, fieldValue);
    }

    private static final OfInt sz$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sz
     * }
     */
    public static final OfInt sz$layout() {
        return sz$LAYOUT;
    }

    private static final long sz$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sz
     * }
     */
    public static final long sz$offset() {
        return sz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sz
     * }
     */
    public static int sz(MemorySegment struct) {
        return struct.get(sz$LAYOUT, sz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sz
     * }
     */
    public static void sz(MemorySegment struct, int fieldValue) {
        struct.set(sz$LAYOUT, sz$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt sy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sy
     * }
     */
    public static final OfInt sy$layout() {
        return sy$LAYOUT;
    }

    private static final long sy$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sy
     * }
     */
    public static final long sy$offset() {
        return sy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sy
     * }
     */
    public static int sy(MemorySegment struct) {
        return struct.get(sy$LAYOUT, sy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sy
     * }
     */
    public static void sy(MemorySegment struct, int fieldValue) {
        struct.set(sy$LAYOUT, sy$OFFSET, fieldValue);
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

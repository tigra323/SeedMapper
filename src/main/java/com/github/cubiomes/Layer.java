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
 * struct Layer {
 *     mapfunc_t *getMap;
 *     int8_t mc;
 *     int8_t zoom;
 *     int8_t edge;
 *     int scale;
 *     uint64_t layerSalt;
 *     uint64_t startSalt;
 *     uint64_t startSeed;
 *     void *noise;
 *     void *data;
 *     Layer *p;
 *     Layer *p2;
 * }
 * }
 */
public class Layer {

    Layer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CubiomesHeaders.C_POINTER.withName("getMap"),
        CubiomesHeaders.C_CHAR.withName("mc"),
        CubiomesHeaders.C_CHAR.withName("zoom"),
        CubiomesHeaders.C_CHAR.withName("edge"),
        MemoryLayout.paddingLayout(1),
        CubiomesHeaders.C_INT.withName("scale"),
        CubiomesHeaders.C_LONG_LONG.withName("layerSalt"),
        CubiomesHeaders.C_LONG_LONG.withName("startSalt"),
        CubiomesHeaders.C_LONG_LONG.withName("startSeed"),
        CubiomesHeaders.C_POINTER.withName("noise"),
        CubiomesHeaders.C_POINTER.withName("data"),
        CubiomesHeaders.C_POINTER.withName("p"),
        CubiomesHeaders.C_POINTER.withName("p2")
    ).withName("Layer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout getMap$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("getMap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * mapfunc_t *getMap
     * }
     */
    public static final AddressLayout getMap$layout() {
        return getMap$LAYOUT;
    }

    private static final long getMap$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * mapfunc_t *getMap
     * }
     */
    public static final long getMap$offset() {
        return getMap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * mapfunc_t *getMap
     * }
     */
    public static MemorySegment getMap(MemorySegment struct) {
        return struct.get(getMap$LAYOUT, getMap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * mapfunc_t *getMap
     * }
     */
    public static void getMap(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(getMap$LAYOUT, getMap$OFFSET, fieldValue);
    }

    private static final OfByte mc$LAYOUT = (OfByte)$LAYOUT.select(groupElement("mc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t mc
     * }
     */
    public static final OfByte mc$layout() {
        return mc$LAYOUT;
    }

    private static final long mc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t mc
     * }
     */
    public static final long mc$offset() {
        return mc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t mc
     * }
     */
    public static byte mc(MemorySegment struct) {
        return struct.get(mc$LAYOUT, mc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t mc
     * }
     */
    public static void mc(MemorySegment struct, byte fieldValue) {
        struct.set(mc$LAYOUT, mc$OFFSET, fieldValue);
    }

    private static final OfByte zoom$LAYOUT = (OfByte)$LAYOUT.select(groupElement("zoom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t zoom
     * }
     */
    public static final OfByte zoom$layout() {
        return zoom$LAYOUT;
    }

    private static final long zoom$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t zoom
     * }
     */
    public static final long zoom$offset() {
        return zoom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t zoom
     * }
     */
    public static byte zoom(MemorySegment struct) {
        return struct.get(zoom$LAYOUT, zoom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t zoom
     * }
     */
    public static void zoom(MemorySegment struct, byte fieldValue) {
        struct.set(zoom$LAYOUT, zoom$OFFSET, fieldValue);
    }

    private static final OfByte edge$LAYOUT = (OfByte)$LAYOUT.select(groupElement("edge"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int8_t edge
     * }
     */
    public static final OfByte edge$layout() {
        return edge$LAYOUT;
    }

    private static final long edge$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int8_t edge
     * }
     */
    public static final long edge$offset() {
        return edge$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int8_t edge
     * }
     */
    public static byte edge(MemorySegment struct) {
        return struct.get(edge$LAYOUT, edge$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int8_t edge
     * }
     */
    public static void edge(MemorySegment struct, byte fieldValue) {
        struct.set(edge$LAYOUT, edge$OFFSET, fieldValue);
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

    private static final long scale$OFFSET = 12;

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

    private static final OfLong layerSalt$LAYOUT = (OfLong)$LAYOUT.select(groupElement("layerSalt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t layerSalt
     * }
     */
    public static final OfLong layerSalt$layout() {
        return layerSalt$LAYOUT;
    }

    private static final long layerSalt$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t layerSalt
     * }
     */
    public static final long layerSalt$offset() {
        return layerSalt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t layerSalt
     * }
     */
    public static long layerSalt(MemorySegment struct) {
        return struct.get(layerSalt$LAYOUT, layerSalt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t layerSalt
     * }
     */
    public static void layerSalt(MemorySegment struct, long fieldValue) {
        struct.set(layerSalt$LAYOUT, layerSalt$OFFSET, fieldValue);
    }

    private static final OfLong startSalt$LAYOUT = (OfLong)$LAYOUT.select(groupElement("startSalt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t startSalt
     * }
     */
    public static final OfLong startSalt$layout() {
        return startSalt$LAYOUT;
    }

    private static final long startSalt$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t startSalt
     * }
     */
    public static final long startSalt$offset() {
        return startSalt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t startSalt
     * }
     */
    public static long startSalt(MemorySegment struct) {
        return struct.get(startSalt$LAYOUT, startSalt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t startSalt
     * }
     */
    public static void startSalt(MemorySegment struct, long fieldValue) {
        struct.set(startSalt$LAYOUT, startSalt$OFFSET, fieldValue);
    }

    private static final OfLong startSeed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("startSeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t startSeed
     * }
     */
    public static final OfLong startSeed$layout() {
        return startSeed$LAYOUT;
    }

    private static final long startSeed$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t startSeed
     * }
     */
    public static final long startSeed$offset() {
        return startSeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t startSeed
     * }
     */
    public static long startSeed(MemorySegment struct) {
        return struct.get(startSeed$LAYOUT, startSeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t startSeed
     * }
     */
    public static void startSeed(MemorySegment struct, long fieldValue) {
        struct.set(startSeed$LAYOUT, startSeed$OFFSET, fieldValue);
    }

    private static final AddressLayout noise$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("noise"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *noise
     * }
     */
    public static final AddressLayout noise$layout() {
        return noise$LAYOUT;
    }

    private static final long noise$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *noise
     * }
     */
    public static final long noise$offset() {
        return noise$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *noise
     * }
     */
    public static MemorySegment noise(MemorySegment struct) {
        return struct.get(noise$LAYOUT, noise$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *noise
     * }
     */
    public static void noise(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(noise$LAYOUT, noise$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout p$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("p"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Layer *p
     * }
     */
    public static final AddressLayout p$layout() {
        return p$LAYOUT;
    }

    private static final long p$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Layer *p
     * }
     */
    public static final long p$offset() {
        return p$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Layer *p
     * }
     */
    public static MemorySegment p(MemorySegment struct) {
        return struct.get(p$LAYOUT, p$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Layer *p
     * }
     */
    public static void p(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(p$LAYOUT, p$OFFSET, fieldValue);
    }

    private static final AddressLayout p2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("p2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Layer *p2
     * }
     */
    public static final AddressLayout p2$layout() {
        return p2$LAYOUT;
    }

    private static final long p2$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Layer *p2
     * }
     */
    public static final long p2$offset() {
        return p2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Layer *p2
     * }
     */
    public static MemorySegment p2(MemorySegment struct) {
        return struct.get(p2$LAYOUT, p2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Layer *p2
     * }
     */
    public static void p2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(p2$LAYOUT, p2$OFFSET, fieldValue);
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

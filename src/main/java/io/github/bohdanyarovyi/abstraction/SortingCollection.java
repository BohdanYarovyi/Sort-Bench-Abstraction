package io.github.bohdanyarovyi.abstraction;

/**
 * Represents an abstract indexed collection that sorting algorithms operate on.
 *
 * <p>Implementations provide the actual data storage and rendering logic,
 * while algorithms interact exclusively through this contract.
 */
public interface SortingCollection {
    /**
     * Compares elements at two positions.
     *
     * @param index1 index of the first element
     * @param index2 index of the second element
     * @return negative if element at index1 is less than at index2,
     *         zero if equal, positive if greater
     */
    int compare(int index1, int index2);

    /**
     * Returns the value at the given index without modifying the collection.
     *
     * @param index position to read
     * @return the value, or {@code null} if index is out of bounds
     */
    Integer peek(int index);

    /**
     * Swaps elements at two positions in-place.
     *
     * @param index1 index of the first element
     * @param index2 index of the second element
     */
    void swap(int index1, int index2);

    /**
     * Overwrites the element at the given index with a new value.
     *
     * @param index position to overwrite
     * @param value new value to set
     */
    void set(int index, int value);

    /**
     * Returns the total number of elements in the collection.
     *
     * @return collection size
     */
    int getSize();

}
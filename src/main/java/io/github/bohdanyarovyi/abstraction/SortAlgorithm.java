package io.github.bohdanyarovyi.abstraction;

import java.util.Objects;

/**
 * Base class for all sorting algorithm implementations.
 *
 * <p>Subclasses define their sorting logic in {@link #sort(SortingCollection)}
 * and provide a display name via {@link #getName()}.
 *
 * <p>Equality is name-based — two instances with the same name are considered equal.
 */
public abstract class SortAlgorithm {

    /**
     * Default constructor
     */
    public SortAlgorithm() {
    }

    /**
     * Performs in-place sorting on the given collection.
     *
     * @param collection the target collection to sort
     */
    public abstract void sort(SortingCollection collection);

    /**
     * Returns the display name of this algorithm (e.g. {@code "Bubble Sort"}).
     * Also used for {@link #equals} and {@link #hashCode}.
     *
     * @return algorithm name
     */
    public abstract String getName();

    /**
     * Sets the display name of this algorithm instance.
     *
     * @param name new display name
     */
    public abstract void setName(String name);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SortAlgorithm that = (SortAlgorithm) o;

        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    @Override
    public String toString() {
        return getName();
    }

}

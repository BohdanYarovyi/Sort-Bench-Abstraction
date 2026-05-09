package com.maybyes.sortbench.abstraction;

public interface SortingCollection {

    int compare(int index1, int index2);

    Integer peek(int index);

    void swap(int index1, int index2);

    void set(int index, int value);

    int getSize();

}
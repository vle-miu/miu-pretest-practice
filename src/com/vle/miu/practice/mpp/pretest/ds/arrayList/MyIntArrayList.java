package com.vle.miu.practice.mpp.pretest.ds.arrayList;

public class MyIntArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    int size;

    int capacity = DEFAULT_CAPACITY;

    Integer[] data = new Integer[capacity];

    public MyIntArrayList() {
        this.data = new Integer[capacity];
    }

    int getSize() {
        return this.size;
    }

    void add(Integer e, int index) {
        ensureCapacity();

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    void add(Integer e) {
        add(e, size);
    }

    Integer get(int index) {
        checkIndex(index);
        return data[index];
    }

    void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        data[size] = null;
        size--;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    void ensureCapacity() {
        if (size >= data.length) {
            int newlength = data.length * 2;
            Integer[] tempData = new Integer[newlength];

            for (int i = 0; i < data.length; i++) {
                tempData[i] = data[i];
            }

            data = tempData;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(data[i] + ", ");
        }
        return result.toString();
    }
}

package com.vle.miu.practice.mpp.pretest.ds.stack;

public class MyIntStack {

    private static final int DEFAULT_CAPACITY = 10;

    private Integer[] data = new Integer[DEFAULT_CAPACITY];

    private int size;

    public MyIntStack(int size) {
        data = new Integer[size];
    }

    public void push(Integer value) /* throws StackException */ {
//		if (value == null) {
//			throw new StackException("Null value is not allowed");
//		}

        if (size == data.length) {
            resize();
        }

        data[size] = value;
        size++;
    }

    public Integer pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        int result = data[size - 1];
        data[size - 1] = null;
        size--;
        return result;
    }

    public Integer peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        // TODO
        return false;
    }

    public void resize() {
        int length = data.length;
        int newLength = length * 2;

        Integer[] tempData = data;
        data = new Integer[newLength];

        for (int i = 0; i < length; i++) {
            data[i] = tempData[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(data[i] + ",");
        }
        return str.toString();
    }

}

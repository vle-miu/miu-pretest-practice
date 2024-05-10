package com.vle.miu.practice.mpp.pretest.ds.queue;

public class MyIntQueue {

    private static final int DEFAULT_CAPACITY = 3;

    int size = DEFAULT_CAPACITY;

    int[] data = new int[size];

    int head = -1;

    int tail = -1;

    public MyIntQueue(int size) {
        this.size = size;
        data = new int[this.size];
    }

    boolean isFull() {
        if (tail == size - 1) {
            return true;
        }

        return false;
    }

    boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    void enqueue(int value) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full");
        }

        if (isEmpty()) {
            head = 0;
            tail = 0;
            data[tail] = value;
        } else {
            tail++;
            data[tail] = value;
        }
    }

    int dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        int value = 0;
        if (head == tail) {
            value = data[head];
            head = -1;
            tail = -1;
        } else {
            value = data[head];
            head++;
        }

        return value;
    }

    int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        return data[head];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = head; i <= tail; i++) {
            result.append(data[i] + ",");
        }

        return result.toString();
    }

}

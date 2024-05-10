package com.vle.miu.practice.mpp.pretest.ds.stack;

public class MyIntStackWithNode {

    private Node head = null;

    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public void push(Integer value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        size++;
    }

    public Integer pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }

        Node currentNode = head;
        head = currentNode.nextNode;
        currentNode.nextNode = null;
        size--;
        return currentNode.data;
    }

    public Integer peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }

        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node iterator = head;
        while (iterator != null) {
            result.append(iterator.data + ",");
            iterator = iterator.nextNode;
        }
        return result.toString();
    }
}

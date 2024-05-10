package com.vle.miu.practice.mpp.pretest.ds.queue;

public class MyIntQueueWithNode<E> {

    Node<E> head;

    Node<E> tail;

    int size = 0;

    public MyIntQueueWithNode() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    int getSize() {
        return this.size;
    }

    void enqueue(E value) {
        Node<E> newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }

        size++;
    }

    E dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        Node<E> currentNode = head;
        head = currentNode.nextNode;
        currentNode.nextNode = null;

        if (head == null) {
            tail = null;
        }

        size--;
        return currentNode.data;

    }

    E peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }

        return head.data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        Node<E> currentNode = head;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(currentNode.data + ", ");
            currentNode = currentNode.nextNode;
        }
        return result.toString();
    }

}

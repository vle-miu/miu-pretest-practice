package com.vle.miu.practice.mpp.pretest.ds.linkedList;

public class MyIntLinkedList {

    Node head;

    Node tail;

    int size;

    public int getSize() {
        return this.size;
    }

    public void addElement(Integer value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean removeElement(Integer value) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == value) {
            head = temp.nextNode;
            size++;
            return true;
        }

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.nextNode;
        }

        if (temp == null) {
            return false;
        }

        prev.nextNode = temp.nextNode;
        size++;
        return true;
    }

    public void addFirst(Integer value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void addLast(Integer value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFist() {
        if (head == null) {
            return;
        }

        head = head.nextNode;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.nextNode != null) {
            prev = temp;
            temp = temp.nextNode;
        }

        prev.nextNode = null;
        tail = prev;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node iterator = head;
        while (iterator != null) {
            result.append(iterator.data + ", ");
            iterator = iterator.nextNode;
        }

        return result.toString();
    }
}

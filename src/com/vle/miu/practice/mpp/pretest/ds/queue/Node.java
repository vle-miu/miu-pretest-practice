package com.vle.miu.practice.mpp.pretest.ds.queue;

public class Node<E> {

    E data;

    Node<E> nextNode;

    public Node(E e) {
        this.data = e;
        this.nextNode = null;
    }
}

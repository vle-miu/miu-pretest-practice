package com.vle.miu.practice.mpp.pretest.ds.queue;

public class Main {

    public static void main(String[] args) throws QueueException {
        MyIntQueue myIntQueue = new MyIntQueue(5);

        myIntQueue.enqueue(2);
        myIntQueue.enqueue(4);
        myIntQueue.enqueue(6);

        System.out.println("Original queue with array structure: ");
        System.out.println(myIntQueue.toString());

        int dequeueValue = myIntQueue.dequeue();
        System.out.println("Dequeue Value: " + dequeueValue);
        System.out.println(myIntQueue.toString());

        int peekValue = myIntQueue.peek();
        System.out.println("Peek value: " + peekValue);
        System.out.println(myIntQueue.toString());

        System.out.println("=====================================");

        MyIntQueueWithNode<Integer> myIntQueueWithNode = new MyIntQueueWithNode<Integer>();
        myIntQueueWithNode.enqueue(2);
        myIntQueueWithNode.enqueue(4);
        myIntQueueWithNode.enqueue(6);

        System.out.println("Original queue with node structure: ");
        System.out.println(myIntQueueWithNode.toString());

        Integer dequeueValue1 = myIntQueueWithNode.dequeue();
        System.out.println("Dequeue value: " + dequeueValue1);
        System.out.println(myIntQueueWithNode.toString());

        Integer peekValue1 = myIntQueueWithNode.peek();
        System.out.println("Peek value: " + peekValue1);
        System.out.println(myIntQueueWithNode.toString());

        Integer dequeueValue2 = myIntQueueWithNode.dequeue();
        System.out.println("Dequeue value: " + dequeueValue2);
        System.out.println(myIntQueueWithNode.toString());

        Integer dequeueValue3 = myIntQueueWithNode.dequeue();
        System.out.println("Dequeue value: " + dequeueValue3);
        System.out.println(myIntQueueWithNode.toString());

        Integer dequeueValue4 = myIntQueueWithNode.dequeue();
        System.out.println("Dequeue value: " + dequeueValue4);
        System.out.println(myIntQueueWithNode.toString());
    }
}

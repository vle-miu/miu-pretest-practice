package com.vle.miu.practice.mpp.pretest.ds.linkedList;

public class Main {

    public static void main(String[] args) {
        MyIntLinkedList myIntLinkedList = new MyIntLinkedList();
        myIntLinkedList.addElement(2);
        myIntLinkedList.addElement(4);
        myIntLinkedList.addElement(6);

        System.out.println("Original List: ");
        System.out.println(myIntLinkedList);

        myIntLinkedList.addFirst(10);
        System.out.println("List after add new element: ");
        System.out.println(myIntLinkedList);

        myIntLinkedList.addLast(12);
        System.out.println("List after add last element: ");
        System.out.println(myIntLinkedList);

        myIntLinkedList.removeElement(4);
        System.out.println("List after remove element 4: ");
        System.out.println(myIntLinkedList);

        myIntLinkedList.removeFist();
        System.out.println("List after remove first element: ");
        System.out.println(myIntLinkedList);

        myIntLinkedList.removeLast();
        System.out.println("List after remove last element: ");
        System.out.println(myIntLinkedList);
    }
}

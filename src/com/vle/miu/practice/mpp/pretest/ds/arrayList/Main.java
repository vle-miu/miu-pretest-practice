package com.vle.miu.practice.mpp.pretest.ds.arrayList;

public class Main {

    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(2);
        myIntArrayList.add(4);
        myIntArrayList.add(6);
        myIntArrayList.add(8);

        System.out.print("Original List: ");
        System.out.println(myIntArrayList.toString());

        myIntArrayList.add(10, 1);
        System.out.println("List after add new element: ");
        System.out.println(myIntArrayList.toString());

        myIntArrayList.remove(3);
        System.out.println("List after remove element: ");
        System.out.println(myIntArrayList.toString());

        Integer value = myIntArrayList.get(2);
        System.out.println("Element 2: " + value);
    }
}

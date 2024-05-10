package com.vle.miu.practice.mpp.pretest.ds.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        // Implement stack with array
        MyIntStack myIntStack = new MyIntStack(6);
        myIntStack.push(4);
        myIntStack.push(6);
        myIntStack.push(8);

        System.out.println("Original stack with array structure: ");
        System.out.println(myIntStack.toString());

        Integer popValue = myIntStack.pop();
        System.out.println("Pop value: " + popValue);

        Integer peekValue = myIntStack.peek();
        System.out.println("Peek value: " + peekValue);
        System.out.println(myIntStack.toString());

        // Implement stack with node
        System.out.println("===============================================");
        MyIntStackWithNode myIntStackWithNode = new MyIntStackWithNode();
        myIntStackWithNode.push(4);
        myIntStackWithNode.push(6);
        myIntStackWithNode.push(8);

        System.out.println("Original stack with node structure: ");
        System.out.println(myIntStackWithNode.toString());

        Integer popValue1 = myIntStackWithNode.pop();
        System.out.println("Pop value: " + popValue1);

        Integer peekValue1 = myIntStackWithNode.peek();
        System.out.println("Peek value: " + peekValue1);
        System.out.println(myIntStackWithNode.toString());
    }

}

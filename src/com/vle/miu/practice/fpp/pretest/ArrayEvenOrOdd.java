package com.vle.miu.practice.fpp.pretest;

public class ArrayEvenOrOdd {

    public static void main(String[] args) {
        System.out.println(isArrayEvenOrOdd(new int[]{1, 4, 7}));
        System.out.println(isArrayEvenOrOdd(new int[]{2, 4, 7}));
    }

    // Q1. An array is called paired if all even indices have odd values and all odd
    // indices has even value.
    // For example {1, 4, 7} is paired because a[0] and a[2] have odd values, and
    // a[1] has even value.
    // The method should return 1 if the paired, 0 otherwise.
    static int isArrayEvenOrOdd(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if ((i % 2 == 0 && input[i] % 2 == 0) || (i % 2 == 1 && input[i] % 2 == 1)) {
                return 0;
            }
        }
        return 1;
    }

}

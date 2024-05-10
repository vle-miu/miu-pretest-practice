package com.vle.leetcode.easylvl;

public class FindMinOfArrays {

    public static void main(String[] args) {
        System.out.println(findMinOfArrays(new int[]{3, 4, 9, 8, 1}));
    }

    static int findMinOfArrays(int[] inputs) {
        int min = inputs[0];

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] < min) {
                min = inputs[i];
            }
        }

        return min;
    }

}

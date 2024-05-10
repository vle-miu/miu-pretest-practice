package com.vle.leetcode.easylvl;

public class FindPOE {

    public static void main(String[] args) {
        System.out.println(findPOE(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(findPOE(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(findPOE(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(findPOE(new int[]{1, 2, 3}));
        System.out.println(findPOE(new int[]{3, 4, 5, 10}));
        System.out.println(findPOE(new int[]{1, 2, 10, 3, 4}));

    }

    static int findPOE(int[] inputArray) {
        if (inputArray == null || inputArray.length < 3) {
            return -1;
        }

        int idx = 1;
        int i = 0;
        int leftSum = inputArray[i];

        int j = inputArray.length - 1;
        int rightSum = inputArray[j];

        for (int k = 1; k < inputArray.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += inputArray[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += inputArray[j];
                idx = j - 1;
            }
        }

        if (leftSum == rightSum) {
            return idx;
        }

        return -1;
    }

}

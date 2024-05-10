package com.vle.leetcode.easylvl;

public class SubtractiveOddSumAndEvenSum {

    public static void main(String[] args) {
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{1}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{1, 2}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{1, 2, 3}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{1, 2, 3, 4}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{3, 3, 4, 4}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{3, 2, 3, 4}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{4, 1, 2, 3}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{1, 1}));
        System.out.println(subtractiveOddSumAndEvenSum(new int[]{}));

    }

    static int subtractiveOddSumAndEvenSum(int[] inputArrays) {
        if (inputArrays == null || inputArrays.length == 0) {
            return 0;
        }

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < inputArrays.length; i++) {
            if (inputArrays[i] % 2 == 0) {
                evenSum += inputArrays[i];
            } else {
                oddSum += inputArrays[i];
            }
        }

        return oddSum - evenSum;
    }

}

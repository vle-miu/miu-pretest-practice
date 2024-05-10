package com.vle.leetcode.easylvl;

import java.util.Arrays;

public class FindCommonElement {

    public static void main(String[] args) {
        System.out.println(printResult(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}));
        System.out.println(printResult(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1}));
        System.out.println(printResult(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}));
        System.out.println(printResult(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(printResult(new int[]{}, new int[]{1, 2, 3}));
        System.out.println(printResult(new int[]{1, 2}, new int[]{}));
        System.out.println(printResult(new int[]{1, 2}, null));
        System.out.println(printResult(null, new int[]{}));
        System.out.println(printResult(null, null));
    }

    static String printResult(int[] firstArray, int[] secondArray) {
        if (findCommonElement(firstArray, secondArray) == null) {
            return "null";
        }

        return Arrays.toString(findCommonElement(firstArray, secondArray));
    }

    static int[] findCommonElement(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) {
            return null;
        }

        if (firstArray.length == 0 || secondArray.length == 0) {
            return new int[]{};
        }

        int minlength = firstArray.length < secondArray.length ? firstArray.length : secondArray.length;

        int[] a, b;

        if (minlength == firstArray.length) {
            a = firstArray;
            b = secondArray;
        } else {
            a = secondArray;
            b = firstArray;
        }

        int[] commonArray = new int[minlength];
        int idx = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonArray[idx] = a[i];
                    idx++;
                }
            }
        }

        int[] result = new int[idx];
        for (int i = 0; i < result.length; i++) {
            result[i] = commonArray[i];
        }

        return result;
    }

}

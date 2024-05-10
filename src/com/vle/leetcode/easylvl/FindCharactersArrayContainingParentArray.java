package com.vle.leetcode.easylvl;

import java.util.Arrays;

public class FindCharactersArrayContainingParentArray {

    public static void main(String[] args) {
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 0, 4));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 0, 3));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 0, 2));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 0, 1));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 1, 3));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 1, 2));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 1, 1));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 2, 2));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 2, 1));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 3, 1));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, 1, 0));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, -1, 2));
        System.out.println(printResult(new char[]{'a', 'b', 'c'}, -1, -2));
        System.out.println(printResult(new char[]{}, 0, 1));
    }

    static String printResult(char[] inputArray, int start, int len) {
        if (findCharacterArrayContaining(inputArray, start, len) == null) {
            return "null";
        }

        return Arrays.toString(findCharacterArrayContaining(inputArray, start, len));
    }

    static char[] findCharacterArrayContaining(char[] inputArray, int start, int len) {
        if (inputArray == null || start < 0 || len < 0 || (start + len > inputArray.length)) {
            return null;
        }

        char[] result = new char[len];
        int idx = 0;

        for (int i = start; i < inputArray.length; i++) {
            if (idx < len) {
                result[idx] = inputArray[i];
                idx++;
            }
        }

        return result;
    }

}

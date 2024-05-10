package com.vle.miu.practice.fpp.pretest;

public class ArrayMadhav {

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    static int isMadhavArray(int[] input) {
        int len = input.length;
        int n = (int) Math.sqrt(len * 2);

        if (len != (n * (n + 1) / 2)) {
            return 0;
        }

        int firstElmValue = input[0];
        int sizeOfChildren = 2;
        int endIndex = sizeOfChildren;
        for (int i = 0; i < (len - sizeOfChildren); ) {
            int sumOfChildrenArray = 0;
            for (int j = i + 1; j <= endIndex && j < len; j++) {
                sumOfChildrenArray += input[j];
            }

            if (firstElmValue != sumOfChildrenArray) {
                return 0;
            }

            sizeOfChildren++;
            i = endIndex;
            endIndex = i + sizeOfChildren;
        }

        return 1;
    }

}

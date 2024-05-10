package com.vle.leetcode.easylvl;

public class FindCenteredElement {

    public static void main(String[] args) {
        System.out.println(findMiddleElement(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findMiddleElement(new int[]{3, 2, 1, 4, 5}));
        System.out.println(findMiddleElement(new int[]{3, 2, 1, 4, 1}));
        System.out.println(findMiddleElement(new int[]{1, 2, 3, 4}));
        System.out.println(findMiddleElement(new int[]{}));
        System.out.println(findMiddleElement(new int[]{10}));
    }

    static int findMiddleElement(int[] inputArrays) {
        if (inputArrays == null || inputArrays.length == 0 || inputArrays.length % 2 == 0) {
            return 0;
        }

        int middleElementIdx = inputArrays.length / 2;
        int middleElement = inputArrays[middleElementIdx];
        for (int i = 0; i < inputArrays.length; i++) {
            if (i != middleElementIdx && middleElement >= inputArrays[i]) {
                return 0;
            }
        }

        return 1;
    }

}

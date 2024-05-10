package com.vle.miu.practice.fpp.pretest;

public class ArrayStantonMeasure {

    public static void main(String[] args) {
        System.out.println(isStantonMeasure(new int[]{1}));
        System.out.println(isStantonMeasure(new int[]{0}));
        System.out.println(isStantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(isStantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(isStantonMeasure(new int[]{}));
    }

    static int isStantonMeasure(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int maxNumberOfOccurs = 0;
        int index = 0;
        while (index <= max) {
            int numberOfOccurs = 0;
            for (int i = 0; i < a.length; i++) {
                if (index == a[i]) {
                    numberOfOccurs++;
                }
            }

            if (numberOfOccurs > maxNumberOfOccurs) {
                maxNumberOfOccurs = numberOfOccurs;
            }

            index++;
        }

        return maxNumberOfOccurs;
    }

}

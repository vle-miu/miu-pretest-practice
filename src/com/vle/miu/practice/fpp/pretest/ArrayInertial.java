package com.vle.miu.practice.fpp.pretest;

public class ArrayInertial {

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }

    static int isInertial(int[] a) {
        int max = a[0];
        int numberOfOddValue = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] % 2 == 1) {
                numberOfOddValue++;
            }
        }

        if (max % 2 == 1) {
            return 0;
        }

        if (numberOfOddValue <= 0) {
            return 0;
        }

        int maxOfEvenValueExceptMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > maxOfEvenValueExceptMax && a[i] != max) {
                maxOfEvenValueExceptMax = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && a[i] <= maxOfEvenValueExceptMax) {
                return 0;
            }
        }

        return 1;
    }

}

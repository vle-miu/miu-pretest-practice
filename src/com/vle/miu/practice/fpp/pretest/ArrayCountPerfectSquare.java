package com.vle.miu.practice.fpp.pretest;

public class ArrayCountPerfectSquare {

    public static void main(String[] args) {
        System.out.println(countPerfectSquare(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countPerfectSquare(new int[]{9}));
    }

    static int countPerfectSquare(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int numberOfPerfectSquare = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] != a[j] && a[i] > 0 && a[j] > 0 && a[i] < a[j] && isPerfectSquare(a[i] + a[j])) {
                    numberOfPerfectSquare++;
                }
            }
        }

        return numberOfPerfectSquare;
    }

    static boolean isPerfectSquare(int a) {
        for (int i = 1; i < a; i++) {
            if (i * i == a) {
                return true;
            }
        }

        return false;
    }

}

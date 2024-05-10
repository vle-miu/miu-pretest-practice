package com.vle.miu.practice.entry.test;

public class Example2 {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1}));

    }

    private static int is121Array(int[] a) {
        if (a == null || a.length < 3) {
            return 0;
        }

        if (a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }

        int middleIdx = a.length / 2;
        if (a[middleIdx] != 2) {
            return 0;
        }

        int leftIdx = 0;
        int rightIdx = a.length - 1;
        for (int i = 1; i < a.length - 2; i++) {
            if (leftIdx <= middleIdx && rightIdx >= middleIdx) {
                leftIdx++;
                rightIdx--;

                if (a[leftIdx] != a[rightIdx] || (a[leftIdx] != 1 && a[leftIdx] != 2)
                        || (a[rightIdx] != 1 && a[rightIdx] != 2)) {
                    return 0;
                }
            }
        }

        return 1;
    }

}

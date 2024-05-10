package com.vle.miu.practice.fpp.pretest;

public class ArrayMaxDistance {

    public static void main(String[] args) {
        System.out.println(maxDistance(12));
        System.out.println(maxDistance(13));
        System.out.println(maxDistance(49));
    }

    // Q2. Write a function called maxDistance that find the max distance between
    // non-trivial factors of a number. Non-trivial means, neither 1 nor the number
    // it self.
    // For example: 12 has factors: 2, 3, 4, 6 -> max distance is 6-2 = 4. If the
    // number has only one factor (e.g. 49 has only one factor which 7) the method
    // should return 0. If the number has no factors (e.g. 13), the method should
    // return -1
    static int maxDistance(int input) {
        int minFactor = 0;
        int maxFactor = 0;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {

                if (minFactor == 0) {
                    minFactor = i;
                }

                if (i > maxFactor) {
                    maxFactor = i;
                }
            }
        }

        if (minFactor == 0) {
            return -1;
        }

        if (maxFactor == 0) {
            return 0;
        }

        return maxFactor - minFactor;
    }

}

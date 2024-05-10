package com.vle.miu.practice.fpp.pretest;

public class ArrayRepsEqual {

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }

    static int repsEqual(int[] input, int n) {
        int number = 0;
        for (int i = 0; i < input.length; i++) {
            int result = 1;
            for (int j = 1; j < input.length - i; j++) {
                result *= 10;
            }

            number += (input[i] * result);
        }

        if (number == n) {
            return 1;
        }

        return 0;
    }

}

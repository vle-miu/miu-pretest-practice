package com.vle.miu.practice.fpp.pretest;

public class ArrayGuthrieSequence {

    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
    }

    static int isGuthrieSequence(int[] input) {
        if (input[0] < 0 || input[input.length - 1] != 1) {
            return 0;
        }

        for (int i = 0; i < input.length; i++) {
            if (i + 1 >= input.length) {
                break;
            }

            if ((input[i] % 2 == 0 && input[i + 1] != input[i] / 2)
                    || (input[i] % 2 == 1 && input[i + 1] != input[i] * 3 + 1)) {
                return 0;
            }
        }

        return 1;
    }

}

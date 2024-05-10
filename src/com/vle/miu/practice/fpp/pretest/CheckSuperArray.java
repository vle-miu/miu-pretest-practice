package com.vle.miu.practice.fpp.pretest;

public class CheckSuperArray {

    public static void main(String[] args) {
        System.out.println(checkSuperArray(new int[]{1, 2, 4, 12}));
        System.out.println(checkSuperArray(new int[]{1, 2, 4, 8, 12}));
    }

    // 2: Check super array (Tổng các phần tử trước phần tử i phải nhỏ hơn i,
    // [1,2,4,12] -> 1<2; 1+2<4; 1+2+4<12
    static int checkSuperArray(int[] input) {
        int sumOfBeforeIndex = 0;
        for (int i = 1; i < input.length; i++) {
            sumOfBeforeIndex += input[i - 1];
            if (sumOfBeforeIndex >= input[i]) {
                return 0;
            }
        }
        return 1;
    }

}

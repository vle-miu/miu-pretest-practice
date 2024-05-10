package com.vle.leetcode.easylvl;

public class ReverseIntegerNumber {

    public static void main(String[] args) {
        System.out.println(reverseIntegerNumber(1234));
        System.out.println(reverseIntegerNumber(12005));
        System.out.println(reverseIntegerNumber(1));
        System.out.println(reverseIntegerNumber(1000));
        System.out.println(reverseIntegerNumber(0));
        System.out.println(reverseIntegerNumber(-12345));
    }

    static int reverseIntegerNumber(int input) {
        int sign = 1;
        if (input < 0) {
            sign = -1;
            input = -input;
        }

        int result = 0;
        while (input != 0) {
            result = input % 10 + result * 10;
            input /= 10;
        }

        return result * sign;
    }

}

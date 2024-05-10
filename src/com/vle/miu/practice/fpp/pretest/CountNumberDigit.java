package com.vle.miu.practice.fpp.pretest;

public class CountNumberDigit {

    public static void main(String[] args) {
        System.out.println(countDigitOfNumber(123));
        System.out.println(countDigitOfNumber(2314));
    }

    // 1: Count digit(123->3, 2314->4,...)
    static int countDigitOfNumber(int input) {
        int numberOfDigit = 0;
        while (input > 0) {
            input /= 10;
            numberOfDigit++;
        }

        return numberOfDigit;
    }

}

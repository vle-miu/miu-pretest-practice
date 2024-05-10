package com.vle.miu.practice.fpp.pretest;

public class CheckNumberAscendingDigit {

    public static void main(String[] args) {
        System.out.println(checkNumberAscendingDigit(123));
        System.out.println(checkNumberAscendingDigit(345));
        System.out.println(checkNumberAscendingDigit(678));
        System.out.println(checkNumberAscendingDigit(-1358));
        System.out.println(checkNumberAscendingDigit(0));
        System.out.println(checkNumberAscendingDigit(11234));
        System.out.println(checkNumberAscendingDigit(54321));
        System.out.println(checkNumberAscendingDigit(11));
    }

    // Q1: check number í having ascending digits. Return 1 if true, else 0.
    // - True: 123, 345, 678, -1358, 0.
    // - False: 11234, 54321, 11.
    static int checkNumberAscendingDigit(int input) {
        if (input < 0) {
            input *= -1;
        }

        int previousDigit = -1;
        while (input > 0) {
            int lastDigit = input % 10;
            input /= 10;

            if (lastDigit >= previousDigit && previousDigit != -1) {
                return 0;
            }

            previousDigit = lastDigit;
        }
        return 1;
    }

}

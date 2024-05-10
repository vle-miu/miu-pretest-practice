package com.vle.miu.practice.entry.test;

public class Example3 {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(37));

    }

    // Java syntax
    private static int isDigitIncreasing(int n) {
        if (n / 10 == 0) {
            return 1;
        }

        // Loop digit between 1 to 9
        for (int i = 1; i <= 9; i++) {
            int digitIncreasing = 0;
            int result = 0;

            while (result < n) {
                digitIncreasing = (digitIncreasing * 10 + i);
                result += digitIncreasing;
            }

            if (result == n) {
                return 1;
            }
        }

        return 0;
    }

}

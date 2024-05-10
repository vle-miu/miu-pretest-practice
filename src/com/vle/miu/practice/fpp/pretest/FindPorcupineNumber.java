package com.vle.miu.practice.fpp.pretest;

public class FindPorcupineNumber {

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(149));
    }

    static int findPorcupineNumber(int n) {
        int firstPrimeNumberWithLastDigit9 = 0;
        int index = 0;
        for (int i = n + 1; ; i++) {
            if (isPrimeNumber(i)) {
                index++;
                if (isLastDigitIs9(i)) {
                    if (index == 2) {
                        return firstPrimeNumberWithLastDigit9;
                    }

                    firstPrimeNumberWithLastDigit9 = i;
                } else {
                    index = 0;
                    firstPrimeNumberWithLastDigit9 = 0;
                }
            }
        }
    }

    static boolean isLastDigitIs9(int n) {
        if (isPrimeNumber(n) && n % 10 == 9) {
            return true;
        }

        return false;
    }

    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}

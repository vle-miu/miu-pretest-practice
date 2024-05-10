package com.vle.miu.practice.fpp.pretest;

public class NextPerfectSquare {

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }

    static int nextPerfectSquare(int n) {
        int i = -1;
        do {
            i++;
        } while (i * i <= n);
        return i * i;
    }

}

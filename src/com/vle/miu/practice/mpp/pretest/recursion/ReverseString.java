package com.vle.miu.practice.mpp.pretest.recursion;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("ABC"));
        System.out.println(reverse("XYZ"));
    }

    static String reverse(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        return reverse(input.substring(1)) + input.charAt(0);
    }
}

package com.gultekinmsg.numberpalindrome;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int notSameNumber = number;

        while (notSameNumber != 0) {
            int digit = notSameNumber % 10;
            reverse = reverse * 10;
            reverse += digit;
            notSameNumber /= 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

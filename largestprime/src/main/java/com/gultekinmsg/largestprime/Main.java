package com.gultekinmsg.largestprime;

public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 0) {
            return -1;
        }
        int largestDivider = -1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                for (int x = 1; x < i / 2; x++) {
                    //
                }
                largestDivider = i;
            }
        }
        return largestDivider;
    }
}

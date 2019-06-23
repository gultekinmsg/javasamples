package com.gultekinmsg.firstandlastdigitsum;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int digit = number % 10;
        int otherDigit = 0;
        while (number > 0) {
            otherDigit = number;
            number /= 10;
        }
        int total = digit + otherDigit;
        return total;
    }
}

package com.gultekinmsg.numbertowords;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("********");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("********");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("invalid value");
        }
        number = reverse(number);

        while (number > 0) {
            int lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("invalid value ");
                    break;
            }
            number = number / 10;
        }
        System.out.println();
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int times = 0;
        while (number > 0) {
            number = number / 10;
            times++;
        }
        return times;
    }

    public static int reverse(int number) {
        int digit = 0;
        int newNumber = 0;
        while (number != 0) {
            digit = number % 10;
            newNumber = digit + newNumber * 10;
            number = number / 10;
        }
        return newNumber;
    }
}

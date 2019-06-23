package com.gultekinmsg.perfectnumber;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int times = 1;
        int divider = 0;
        while (times <= number) {
            if (number % times == 0) {
                divider += times;
                if (divider == number) {
                    return true;
                }
            }
            times++;
        }

        return false;
    }
}

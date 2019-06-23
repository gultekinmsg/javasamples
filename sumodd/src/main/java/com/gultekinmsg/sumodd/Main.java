package com.gultekinmsg.sumodd;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumOld(1, 100));
        System.out.println(sumOld(-1, 100));
        System.out.println(sumOld(100, 100));
        System.out.println(sumOld(13, 13));
        System.out.println(sumOld(100, -100));
        System.out.println(sumOld(100, 1000));
    }


    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOld(int start, int end) {
        int total = 0;
        if (start >= 0 && end >= 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    total += i;
                }
            }
            return total;
        }
        return -1;
    }
}

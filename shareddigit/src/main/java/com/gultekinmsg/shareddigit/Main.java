package com.gultekinmsg.shareddigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int x, int y) {
        int z = y;
        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            while (x > 0) {
                int xDigit = x % 10;
                y = z;
                while (y > 0) {
                    int yDigit = y % 10;
                    y /= 10;
                    if (xDigit == yDigit) {
                        return true;
                    }
                }
                x /= 10;
            }
        }
        return false;
    }
}

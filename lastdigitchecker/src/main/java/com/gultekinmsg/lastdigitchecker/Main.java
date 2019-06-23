package com.gultekinmsg.lastdigitchecker;

public class Main {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println("**********");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }


    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x <= 1000 && y <= 1000 && z <= 1000 && x >= 10 && y >= 10 && z >= 10) {

            while (x > 0) {
                int xDigit = x % 10;
                y = z;
                while (y > 0) {
                    int yDigit = y % 10;
                    y /= 10;
                    if (xDigit == yDigit) {
                        return true;
                    }
                    while (z > 0) {
                        int zDigit = z % 10;
                        z /= 10;
                        if (yDigit == zDigit) {
                            return true;
                        }
                    }
                }
                x /= 10;
            }
        }
        return false;
    }

    public static boolean isValid(int num) {
        if (num <= 1000 && num >= 10) {
            return true;
        }
        return false;
    }
}

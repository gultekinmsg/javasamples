package com.gultekinmsg.flourpackproblem;

public class Main {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilos = bigCount * 5;
        int smallKilos = smallCount;

        if (bigKilos + smallKilos == goal) {
            return true;
        } else if (bigKilos + smallKilos < goal) {
            return false;
        }

        int neededBig = goal / 5;
        int neededSmall = goal % 5;

        if (neededBig >= bigKilos && neededSmall >= smallKilos) {
            return true;
        } else if (smallKilos >= goal) {
            return true;
        } else if (bigKilos < goal && (smallKilos + bigKilos >= goal)) {
            return true;
        }
        return false;

    }
}

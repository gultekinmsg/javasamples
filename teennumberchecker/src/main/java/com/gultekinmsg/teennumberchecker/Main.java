package com.gultekinmsg.teennumberchecker;

public class Main {
    public static void main(String[] args) {
        // write your code here

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("********");
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int x, int y, int z) {
        if ((x <= 19 && x >= 13) || (y <= 19 && y >= 13) || (z <= 19 && z >= 13)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int t) {
        if ((t <= 19 && t >= 13)){
            return true;
        }
        return false;
    }
}

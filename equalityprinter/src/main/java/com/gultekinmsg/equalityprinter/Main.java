package com.gultekinmsg.equalityprinter;

public class Main {
    public static void main(String[] args) {
        // write your code here
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("invalid value");
        } else if ((x == y) && (y == z)) {
            System.out.println("All number are equal");
        } else if ((x != y) && (y != z) && (z != x)) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all equal or different");
        }
    }
}

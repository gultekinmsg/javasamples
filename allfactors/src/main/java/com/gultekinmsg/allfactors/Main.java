package com.gultekinmsg.allfactors;

public class Main {
    public static void main(String[] args) {

        printFactor(6);
        System.out.println();
        printFactor(32);
        System.out.println();
        printFactor(10);
        System.out.println();
        printFactor(-1);
    }

    public static void printFactor(int number) {
        if (number < 1) {
            System.out.println("invalid value");
        }

        int times = 1;

        while (times <= number) {
            if (number % times == 0) {
                System.out.print(times + "  ");
            }
            times++;
        }
    }
}

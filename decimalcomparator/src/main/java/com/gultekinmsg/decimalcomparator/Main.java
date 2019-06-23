package com.gultekinmsg.decimalcomparator;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int num1 = (int) x * 1000;
        int num2 = (int) y * 1000;

        if (num1 == num2) {
            return true;
        }
        return false;
    }
}

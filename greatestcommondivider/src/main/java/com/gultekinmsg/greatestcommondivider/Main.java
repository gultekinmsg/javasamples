package com.gultekinmsg.greatestcommondivider;

public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int biggestDivider = 0;
        int divider = 0;
        int times = 1;
        while (times < first) {
            if (first % times == 0 && second % times == 0) {
                divider += times;
                biggestDivider = divider;
                divider = 0;
            }
            times++;
        }
        return biggestDivider;
    }
}

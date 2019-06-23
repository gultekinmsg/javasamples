package com.gultekinmsg.barkingdog;

public class Main {
    public static void main(String[] args) {
        // write your code here

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }


        return false;
    }
}

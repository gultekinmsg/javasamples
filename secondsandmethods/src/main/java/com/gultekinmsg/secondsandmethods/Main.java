package com.gultekinmsg.secondsandmethods;

public class Main {
    public static void main(String[] args) {
        // write your code here

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        } else {
            long minToHour = minutes / 60;
            long leftMin = minutes % 60;
            return minToHour + "h " + leftMin + "m " + seconds + "s";
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0 || seconds > 59) {
            return "invalid value";
        } else {
            long min = seconds / 60;
            long sec = seconds % 60;
            return getDurationString(min, sec);
        }
    }
}

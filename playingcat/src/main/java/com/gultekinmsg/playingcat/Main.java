package com.gultekinmsg.playingcat;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int nameTemperature){
        if (summer){
            if (nameTemperature>=25 && nameTemperature <= 45){
                return true;
            }
        }else {
            if (nameTemperature>=25 && nameTemperature <= 35)
                return true;
        }
        return false;
    }
}

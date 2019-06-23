package com.gultekinmsg.speedconverter;

public class Main {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else{
            double myMile = kilometersPerHour * 0.621371192;
            long myRoundedMile = Math.round(myMile);
            return myRoundedMile;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            double milesPerHour = kilometersPerHour * 1.609 ;
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour +"mi/h");
        }
    }
}

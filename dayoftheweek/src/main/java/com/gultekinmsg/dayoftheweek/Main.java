package com.gultekinmsg.dayoftheweek;

public class Main {
    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
        /*
        if (day == 0){
            System.out.println("Sunday");
        }else if (day == 1){
            System.out.println("Tuesday");
        }else if (day == 1){
            System.out.println("Mounday");
        }else if (day == 1){
            System.out.println("Wednesday");
        }else if (day == 1){
            System.out.println("Thursday");
        }else if (day == 1){
            System.out.println("Friday");
        }else if (day == 1){
            System.out.println("Saturday");
        }else {
            System.out.println("invalid day");
        }

         */
    }
}

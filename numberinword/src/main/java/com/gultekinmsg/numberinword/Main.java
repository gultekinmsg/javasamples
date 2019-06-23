package com.gultekinmsg.numberinword;

public class Main {
    public static void main(String[] args) {
        // write your code here
        printNumberWorld(0);
        printNumberWorld(5);
        printNumberWorld(9);
        printNumberWorld(10);
        printNumberWorld(-6);
    }

    public static void printNumberWorld(int num){
        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }
}

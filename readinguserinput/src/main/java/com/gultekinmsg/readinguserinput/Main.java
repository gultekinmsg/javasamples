package com.gultekinmsg.readinguserinput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myTotal = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number #" + i);
            boolean nextIntTrue = myScanner.hasNextInt();

            if (nextIntTrue) {
                int myValue = myScanner.nextInt();
                myTotal += myValue;
            } else {
                System.out.println("Invalid Number");
            }
            myScanner.nextLine();
        }
        System.out.println("Sum of numbers = " + myTotal);
        myScanner.close();
    }
}


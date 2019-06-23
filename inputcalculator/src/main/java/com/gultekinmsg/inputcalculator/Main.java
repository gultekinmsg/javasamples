package com.gultekinmsg.inputcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int times = 0;

        while (true) {
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                int myNumber = scanner.nextInt();
                scanner.nextLine();
                sum += myNumber;
                times++;
            } else {
                average = sum / times;
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}

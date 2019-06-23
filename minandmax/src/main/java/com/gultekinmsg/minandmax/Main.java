package com.gultekinmsg.minandmax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beforeBigNumber = 0;
        int beforeSmallNumber = 0;

        while (true) {
            System.out.println("Enter number");
            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int myNumber = scanner.nextInt();
                scanner.nextLine();
                if (beforeBigNumber < myNumber) {
                    beforeBigNumber = myNumber;
                } else if (beforeSmallNumber > myNumber) {
                    beforeSmallNumber = myNumber;
                } else if (beforeSmallNumber == myNumber || beforeBigNumber == myNumber) {

                }
            } else {
                System.out.println("Invalid Number");
                System.out.println("Max = " + beforeBigNumber + " and Min = " + beforeSmallNumber);
                break;
            }
        }


    }
}

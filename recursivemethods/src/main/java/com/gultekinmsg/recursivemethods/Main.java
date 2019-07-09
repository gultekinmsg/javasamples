package com.gultekinmsg.recursivemethods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // recursive ile faktöriyel write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        int index = 1;
        int myTotal = 1;
        int result = getFactorial(number, index, myTotal);
        System.out.println(number + "!=" + result);

        System.out.print(number + "= ");
        for (int i = number; i > 1; i--) {
            System.out.print(i + "x");
            myTotal *= i;
        }
        System.out.print("1 = " + myTotal);

        //5!=5x4x3x2x1 =120


    }

    public static int getFactorial(int number, int index, int myTotal) {

        if (number > 0) {
            if (index <= number) {
                myTotal *= index;
                index += 1;
                return getFactorial(number, index, myTotal);
            } else {
                return myTotal;
            }
        } else {
            return -1;
        }


    }
}


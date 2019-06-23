package com.gultekinmsg.diagonalstar;

public class Main {
    public static void main(String[] args) {

        //    printSquareStar(5);
        System.out.println("-------------------");
        printButterfly(5);
        System.out.println("-------------------");
        printButterfly(8);
    }


    public static void printButterfly(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number)
                    System.out.print("*");
                else if (i == j)
                    System.out.print("*");
                else if (j == (number - i + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
    public static void printSquareStar(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - 1; j++) {
                if ((i == 1 && j == 2) || (i == 2 && (j == 1 || j == 3)) || (i == 3 && j == 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("*");
        }
    }
    */
}

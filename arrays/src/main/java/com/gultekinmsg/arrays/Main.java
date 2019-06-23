package com.gultekinmsg.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notSorted = getInteger(5);
        printArray(notSorted);
        int[] sorted = sortArrays(notSorted);
        printArray(sorted);

    }

    public static int[] getInteger(int x) {
        int[] myArray = new int[x];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + x + " numbers to add array");
        for (int i = 0; i < x; i++) {
            myArray[i] = scanner.nextInt();
        }
        scanner.close();

        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortArrays(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

        return array;
    }
}


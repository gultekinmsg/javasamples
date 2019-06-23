package com.gultekinmsg.mielementinarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter your array length");
        count = scanner.nextInt();
        int[] myArray = readIntegers(count);
        int myMinValue = findMin(myArray);
        System.out.println("Minimum value of array = " + myMinValue);
        scanner.close();
        reverse(myArray);

    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[count];
        System.out.println("Enter " + count + " number of values for array");
        for (int i = 0; i < count; i++) {
            myArray[i] = scanner.nextInt();
        }
        scanner.close();
        return myArray;
    }
    public static int findMin(int[] array) {
        int minValue = 0;

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        minValue = array[0];
        return minValue;
    }
    public static void reverse(int[] array) {
        int length = array.length;
        int[] newArray = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            newArray[j - 1] = array[i];
            j = j - 1;
        }
        System.out.println("Normal array is:");
        System.out.println(Arrays.toString(array));
        System.out.println("Reversed array is:");
        System.out.println(Arrays.toString(newArray));

    }
}

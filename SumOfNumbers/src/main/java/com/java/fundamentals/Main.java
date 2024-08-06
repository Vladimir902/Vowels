package com.java.fundamentals;

import java.util.Scanner;

public class Main {

    public static void sumEvenNumbers(int[] arr) {

        Scanner numbers = new Scanner(System.in);
        int size = arr.length;

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = numbers.nextInt();
        }
    }


    public static void main(String[] args) {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] userInputArray = new int[size];
            sumEvenNumbers(userInputArray);

            System.out.println("The elements of the array are: ");


            for (int j : userInputArray) {
                if (j % 2 == 0) {
                    sum = sum + j;
                }
            }
        } catch (Exception e) {
            System.out.println("You can't input that");
        }


        System.out.println("The sum of even numbers is: " + sum);
    }
}

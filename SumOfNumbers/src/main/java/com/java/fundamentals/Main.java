package com.java.fundamentals;

import java.util.Scanner;

public class Main {

    public static void sumEvenNumbers(int[] arr) {  //method for user input for size of the array

        Scanner numbers = new Scanner(System.in);  //user input of the numbers in array
        int size = arr.length;

        System.out.println("Enter the elements of the array");  //iterating over the numbers in the array
        for (int i = 0; i < size; i++) {
            arr[i] = numbers.nextInt();
        }
    }


    public static void main(String[] args) {
        int sum = 0;

        try {
            Scanner scanner = new Scanner(System.in);   //user entering the size for array as an argument

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] userInputArray = new int[size];  //passing the size parameter as an argument for the array length
            sumEvenNumbers(userInputArray);

            System.out.println("The elements of the array are: ");   // printing the elements of array


            for (int j : userInputArray) {   // checking if the number is even or not
                if (j % 2 == 0) {
                    sum = sum + j;   // if its even sum the number
                }
            }
        } catch (Exception e) {
            System.out.println("You can't input that");  // error handling for the array elements
        }


        System.out.println("The sum of even numbers is: " + sum);  // printing the sum of even numbers in an array
    }
}

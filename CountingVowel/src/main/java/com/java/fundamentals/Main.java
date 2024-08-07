package com.java.fundamentals;
import java.util.Scanner;

import static com.java.fundamentals.Vowels.countVowels;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");   //ask the user for a string input

        String userInput = scanner.nextLine();   //user adds the string

        Scanner numberScanner = new Scanner(userInput); //new scanner for parsing numbers
        // Check if the input is an integer
        if (numberScanner.hasNextInt()) {
            System.out.println("The input is an integer."); //if the string is integer, handle it
        }
        // Check if the input is a double
        else if (numberScanner.hasNextDouble()) {
            System.out.println("The input is a double.");  //if the string is double,handle it
        }





        if (userInput.isEmpty()) {   //handling for empty string
                throw new IllegalArgumentException("Input string cannot be empty.");
            }

            System.out.println("The number of vowels are:" + countVowels(userInput)); //printing the sum of the vowels



    }
}



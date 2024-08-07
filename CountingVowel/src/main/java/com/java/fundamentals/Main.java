package com.java.fundamentals;
import java.util.Scanner;

import static com.java.fundamentals.Vowels.countVowels;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be empty.");
            }

            System.out.println("The number of vowels are:" + countVowels(userInput));


    }
}



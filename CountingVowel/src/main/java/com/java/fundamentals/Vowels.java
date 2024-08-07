package com.java.fundamentals;


public class Vowels {

    public static int countVowels(String input) {

            int sum = 0;
            String vowels = "AEIOUaeiou";

            char[] characters = input.toCharArray();

                for (char ch : characters) {
                    if (vowels.indexOf(ch) != -1) {
                        sum = sum + 1;

                    }

                }

    try {
        if (sum == 0) {
            System.out.println("No vowels found in the input string.");
        }

    } catch (IllegalArgumentException e) {
        // Print an error message if an exception occurs
        System.err.println("Invalid input: " + e.getMessage());
    } catch (Exception e) {
        // Handle any unexpected exceptions
        System.err.println("An unexpected error occurred: " + e.getMessage());
    }

    return sum;

    }
}




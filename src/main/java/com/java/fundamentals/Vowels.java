package com.java.fundamentals;


public class Vowels {

    public static int countVowels(String input) {

            int sum = 0;
            String vowels = "AEIOUaeiou";    //variable for holding the vowels

            char[] characters = input.toCharArray();  //converting the String to array of chars

                for (char ch : characters) {   //looping through the array of chars with foreach
                    if (vowels.indexOf(ch) != -1) {   //if the chars are in the vowels variable
                        sum = sum + 1;   //add them

                    }

                }

        if (sum == 0) {   //if the sum is 0, print no vowels found in the input string
            System.out.println("No vowels found in the input string.");
        }

    return sum;

    }
}




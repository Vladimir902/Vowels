package com.java.fundamentals;


public class Vowels {

    public static int countVowels(String input) {

        int sum = 0;
        String vowels = "AEIOUaeiou";
        char[] characters = input.toCharArray();

        for(char ch : characters) {
            if (vowels.indexOf(ch) != -1) {
                sum = sum + 1;

            }

        }

        return sum;
    }
}



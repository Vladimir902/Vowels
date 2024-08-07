package com.java.fundamentals;
import java.util.Scanner;

import static com.java.fundamentals.Vowels.countVowels;


public class Main {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a string: ");

       String userInput = scanner.nextLine();

       System.out.println("The number of vowels are:" + countVowels(userInput));

   }
}



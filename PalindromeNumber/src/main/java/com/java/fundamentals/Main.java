package com.java.fundamentals;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in); //user input for number
        int x = scanner.nextInt();
        int reverse = 0;    //initializing variables
        int temp;
        int res;


        temp = x;  //providing value of x in temp variable

        while (temp != 0) //loop to find reverse number
        {
            res = temp % 10;   //extracting last digit from the number
            reverse = reverse * 10 + res;  //adding the extracted digit for reverse order
            temp /= 10;  //removing last digit
        }


        if (x == reverse)  //checking if the user input is the same as the reverse variable
            System.out.println (x + " is palindrome");
        else
            System.out.println (x + " is not palindrome");

    }
}
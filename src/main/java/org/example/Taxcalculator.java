/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;


public class Taxcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("What is the order amount?");
        String amountString = input.nextLine();

        double amount = Double.parseDouble(amountString);

        System.out.print("What is the state?");
        String stateString = input.nextLine();


        if (stateString.equals("WI")) {
            System.out.printf("The subtotal is $%.2f.", amount);
            double tax = Math.ceil(0.055f * amount * 100)/100;
            amount += tax;
            System.out.printf("\nThe tax is $%.2f.\n", tax);
        }

        System.out.printf("The total is $%.2f.", amount);
    }
}

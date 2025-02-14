package com.tit.day05javaexceptionhandling.throwvsthrows;

import java.util.Scanner;

/*
 * 6. throw vs. throws (Exception Propagation)
 * 💡 Problem Statement:
 * Create a method calculateInterest(double amount, double rate, int years) that:
 * Throws IllegalArgumentException if amount or rate is negative.
 * Propagates the exception using throws and handles it in main().
 *
 * Expected Behavior:
 * If valid, return and print the calculated interest.
 * If invalid, catch and display "Invalid input: Amount and rate must be positive".
 */

// Creating a class InterestCalculationSimulation to demonstrate interest calculation
public class InterestCalculationSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of InterestCalculator
        InterestCalculator calculator = new InterestCalculator();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        try {
            // Calculate interest and print the result
            double interest = calculator.calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);
        } catch (IllegalArgumentException e) {
            // Handle invalid input exception
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Closing the scanner object
            scanner.close();
        }
    }
}


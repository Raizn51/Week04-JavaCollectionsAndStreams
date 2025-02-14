package com.tit.day05javaexceptionhandling.finallyblockexecution;

import java.util.Scanner;

/*
 * 7. finally Block Execution
 * 💡 Problem Statement:
 * Write a program that performs integer division and demonstrates the finally block execution.
 * The program should:
 * - Take two integers from the user.
 * - Perform division.
 * - Handle ArithmeticException (if dividing by zero).
 * - Ensure "Operation completed" is always printed using finally.
 *
 * Expected Behavior:
 * - If valid, print the result.
 * - If an exception occurs, handle it and still print "Operation completed".
 */

// Creating a class DivisionSimulation to demonstrate division operation
public class DivisionSimulation
{
    public static void main(String[] args) {
        // Creating an object of DivisionHandler
        DivisionHandler divisionHandler = new DivisionHandler();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Perform the division
        divisionHandler.performDivision(numerator, denominator);

        // Closing the scanner object
        scanner.close();
    }
}

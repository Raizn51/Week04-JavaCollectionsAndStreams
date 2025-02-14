package com.tit.day05javaexceptionhandling.nestedtrycatchblock;

import java.util.Scanner;

/*
 * 9. Nested try-catch Block
 * 💡 Problem Statement:
 * Write a Java program that:
 * Takes an array and a divisor as input.
 * Tries to access an element at an index.
 * Tries to divide that element by the divisor.
 * Uses nested try-catch to handle:
 * - ArrayIndexOutOfBoundsException if the index is invalid.
 * - ArithmeticException if the divisor is zero.
 *
 * Expected Behavior:
 * If valid, print the division result.
 * If the index is invalid, catch and display "Invalid array index!".
 * If division by zero, catch and display "Cannot divide by zero!".
 */

// Creating a class ArrayDivisionSimulation to demonstrate array division operation
public class ArrayDivisionSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of ArrayDivisionHandler
        ArrayDivisionHandler handler = new ArrayDivisionHandler();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Example array
        Integer[] array = {10, 20, 30, 40, 50};

        // Prompt the user to enter an index
        System.out.print("Enter the index number: ");
        int index = scanner.nextInt();

        // Prompt the user to enter a divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Perform the division operation
        handler.divideElementAtIndex(array, index, divisor);

        // Closing the scanner object
        scanner.close();
    }
}

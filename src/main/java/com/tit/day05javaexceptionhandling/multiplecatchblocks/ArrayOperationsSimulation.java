package com.tit.day05javaexceptionhandling.multiplecatchblocks;

/*
 * 4. Multiple Catch Blocks
 * 💡 Problem Statement:
 * Create a Java program that performs array operations.
 * Accept an integer array and an index number.
 * Retrieve and print the value at that index.
 * Handle the following exceptions:
 * - ArrayIndexOutOfBoundsException if the index is out of range.
 * - NullPointerException if the array is null.
 *
 * Expected Behavior:
 * If valid, print "Value at index X: Y".
 * If the index is out of bounds, display "Invalid index!".
 * If the array is null, display "Array is not initialized!".
 */

import java.util.Scanner;

// Creating a class ArrayOperationsSimulation to demonstrate array operations
public class ArrayOperationsSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of ArrayHandler
        ArrayHandler arrayHandler = new ArrayHandler();

        // Example array
        Integer[] array = {1, 2, 3, 4, 5};

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index number: ");
        int index = scanner.nextInt();

        // Retrieve and print the value at the specified index
        arrayHandler.getValueAtIndex(array, index);

        // Closing the scanner object
        scanner.close();
    }
}

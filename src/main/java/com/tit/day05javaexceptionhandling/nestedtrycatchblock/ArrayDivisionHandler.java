package com.tit.day05javaexceptionhandling.nestedtrycatchblock;

// Creating a class ArrayDivisionHandler to handle array division operations
public class ArrayDivisionHandler {

    // Method to divide an element at a specified index by a divisor
    public void divideElementAtIndex(Integer[] array, int index, int divisor) {
        try {
            // Attempt to access the element at the specified index
            try {
                int element = array[index];
                // Attempt to divide the element by the divisor
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid array index
            System.out.println("Invalid array index!");
        }
    }
}

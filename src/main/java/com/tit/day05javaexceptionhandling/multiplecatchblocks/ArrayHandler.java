package com.tit.day05javaexceptionhandling.multiplecatchblocks;

// Creating a class ArrayHandler to handle array operations
public class ArrayHandler
{

    // Method to retrieve and print the value at a given index of an array
    public void getValueAtIndex(Integer[] array, int index)
    {
        try {
            // Attempt to print the value at the specified index
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of range
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handle the case where the array is null
            System.out.println("Array is not initialized!");
        }
    }
}


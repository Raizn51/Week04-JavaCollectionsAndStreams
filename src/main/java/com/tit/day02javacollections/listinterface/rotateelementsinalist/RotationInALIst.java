package com.tit.day02javacollections.listinterface.rotateelementsinalist;
/*
Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
*/
import java.util.*;

// Creating a class RotationInALIst to demonstrate rotating elements in a list
public class RotationInALIst {
    public static void main(String[] args) {
        // Creating an object of RotateList
        RotateList rotator = new RotateList();

        // List of integers
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // Taking input for the number of positions to rotate
        System.out.print("Enter the number of positions to rotate:");
        Scanner sc = new Scanner(System.in);
        int positions = sc.nextInt();

        // Rotating the list by 2 positions
        List<Integer> rotatedList = rotator.rotateList(list, positions);


        // Printing the rotated list
        System.out.println("Original list: " + list);
        System.out.println("Rotated list: " + rotatedList);
    }
}

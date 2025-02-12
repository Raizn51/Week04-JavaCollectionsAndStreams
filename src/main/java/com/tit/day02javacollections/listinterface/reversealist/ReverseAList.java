package com.tit.day02javacollections.listinterface.reversealist;
/*
Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/
import java.util.*;

// Creating a class ReverseAList to demonstrate reversing ArrayList and LinkedList
public class ReverseAList
{
    public static void main(String[] args) {
        // Creating an object of ListReverser
        ListReverser reverser = new ListReverser();

        // Demonstrating reversal of an ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 2, 3, 1, 2, 3, 4, 5, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        reverser.reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Demonstrating reversal of a LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 2, 3, 1, 2, 3, 4, 5, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        reverser.reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
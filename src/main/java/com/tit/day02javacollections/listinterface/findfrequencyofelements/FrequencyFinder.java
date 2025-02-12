package com.tit.day02javacollections.listinterface.findfrequencyofelements;
/*
Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
*/

import java.util.*;

// Creating a class FrequencyFinder to demonstrate counting frequency of elements
public class FrequencyFinder
{
    public static void main(String[] args) {
        // Creating an object of FrequencyCounter
        FrequencyCounter counter = new FrequencyCounter();

        // List of strings
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        // Counting frequency of elements
        Map<String, Integer> frequencyMap = counter.countFrequency(list);

        // Printing the frequency map
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}

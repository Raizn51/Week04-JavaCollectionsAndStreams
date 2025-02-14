package com.tit.day02javacollections.mapinterface.FindtheKeywiththeHighestValue;
/*
Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.
Example:
Input: {A=10, B=20, C=15} → Output: B.
 */
import java.util.Map;

// Creating a class FindMaxKeySimulation to demonstrate finding the key with the maximum value
public class FindMaxKeySimulation
{
    public static void main(String[] args) {
        // Creating a map with test data
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        // Creating an object of FindMaxKey
        FindMaxKey findMaxKey = new FindMaxKey();

        // Finding and printing the key with the maximum value
        String maxKey = findMaxKey.findMaxKey(map);
        System.out.println("The key with the highest value is: " + maxKey);
    }
}

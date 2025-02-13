package com.tit.day03javastreams.countwordsinafile;

/*
10. Count Words in a File
📌 Problem Statement:
Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
Requirements:
Use FileReader and BufferedReader to read the file.
Use a HashMap<String, Integer> to count word occurrences.
Sort the words based on frequency and display the top 5.
*/


// Creating a class WordCounterSimulation to demonstrate word counting operations
public class WordCounterSimulation {
    public static void main(String[] args) {
        // Creating an object of WordCounter
        WordCounter wordCounter = new WordCounter();

        // File path to read
        String filePath = "src/main/resources/LargeTextFile.txt";

        // Counting words and displaying the top 5 most frequent words
        wordCounter.countWordsAndDisplayTop5(filePath);
    }
}

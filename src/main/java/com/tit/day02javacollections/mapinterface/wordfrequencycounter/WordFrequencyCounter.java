package com.tit.day02javacollections.mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Creating a class WordFrequencyCounter to count the frequency of each word in a text file
public class WordFrequencyCounter {

    // Method to count the frequency of each word in a text file
    public Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            // Convert line to lowercase and remove punctuation
            String[] words = line.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        reader.close();
        return wordCountMap;
    }
}


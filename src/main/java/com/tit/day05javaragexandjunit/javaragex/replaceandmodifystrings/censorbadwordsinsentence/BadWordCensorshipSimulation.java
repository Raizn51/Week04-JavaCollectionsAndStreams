package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.censorbadwordsinsentence;

/*
 * 9️⃣ Censor Bad Words in a Sentence
 * 💡 Problem Statement:
 * Given a list of bad words, replace them with ****.
 *
 * 🔹 Example Input:
 * "This is a damn bad example with some stupid words."
 *
 * 🔹 Expected Output:
 * "This is a **** bad example with some **** words."
 */


import java.util.Arrays;
import java.util.List;

// Creating a class BadWordCensorshipSimulation to demonstrate bad word censorship
public class BadWordCensorshipSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Censor bad words in the text
        String result = BadWordCensor.censorBadWords(text, badWords);

        // Print the result
        System.out.println(result);
    }
}


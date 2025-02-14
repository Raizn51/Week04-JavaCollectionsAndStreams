package com.tit.day02javacollections.mapinterface.wordfrequencycounter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

// Creating a class TestingWordFrequencyCounter to test the WordFrequencyCounter
public class TestingWordFrequencyCounter {

    @Test
    void testCountWordFrequency() throws IOException {
        String filePath = "test.txt";
        String content = "Hello world, hello Java!";
        Files.write(Paths.get(filePath), content.getBytes());

        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> wordCountMap = counter.countWordFrequency(filePath);

        assertEquals(2, wordCountMap.get("hello"));
        assertEquals(1, wordCountMap.get("world"));
        assertEquals(1, wordCountMap.get("java"));

        Files.delete(Paths.get(filePath));
    }
}

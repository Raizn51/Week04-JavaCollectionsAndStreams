package com.tit.day02javacollections.extra.votingsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestingVotingSystem {

    // Test method for casting votes and getting results
    @Test
    void testVotingSystem() {
        VotingSystem votingSystem = new VotingSystem();

        // Casting some votes
        votingSystem.vote("Alice");
        votingSystem.vote("Bob");
        votingSystem.vote("Alice");
        votingSystem.vote("Carol");
        votingSystem.vote("Bob");

        // Asserting the results in sorted order
        Map<String, Integer> expectedResults = new TreeMap<>();
        expectedResults.put("Alice", 2);
        expectedResults.put("Bob", 2);
        expectedResults.put("Carol", 1);
        assertEquals(expectedResults, votingSystem.getResults(), "Results should match the expected sorted results");

        // Asserting the order of votes
        Map<String, Integer> expectedVoteOrder = new LinkedHashMap<>();
        expectedVoteOrder.put("Alice", 2);
        expectedVoteOrder.put("Bob", 2);
        expectedVoteOrder.put("Carol", 1);
        assertEquals(expectedVoteOrder, votingSystem.getVoteOrder(), "Vote order should match the expected order");
    }
}

package com.tit.day02javacollections.extra.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Creating a class VotingSystem to manage voting
public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    // Method to cast a vote for a candidate
    public void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    // Method to get the results in sorted order
    public Map<String, Integer> getResults() {
        return new TreeMap<>(votes);
    }

    // Method to get the order of votes
    public Map<String, Integer> getVoteOrder() {
        return new LinkedHashMap<>(voteOrder);
    }
}

package com.tit.day02javacollections.extra.votingsystem;
/*
Design a Voting System
Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
 */

// Creating a class VotingSystemSimulation to demonstrate the VotingSystem
public class VotingSystemSimulation
{
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting some votes
        votingSystem.vote("Alice");
        votingSystem.vote("Bob");
        votingSystem.vote("Alice");
        votingSystem.vote("Carol");
        votingSystem.vote("Bob");

        // Displaying the results in sorted order
        System.out.println("Results in sorted order: " + votingSystem.getResults());

        // Displaying the order of votes
        System.out.println("Order of votes: " + votingSystem.getVoteOrder());
    }
}

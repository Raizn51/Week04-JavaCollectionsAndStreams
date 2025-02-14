package com.tit.day02javacollections.listinterface.nthelementfromtheend;

import java.util.LinkedList;

// Creating a class NthElementFinder to find the Nth element from the end
public class NthElementFinder {

    // Method to find the Nth element from the end of a LinkedList
    public <T> T findNthFromEnd(LinkedList<T> list, int n) {
        int indexFromStart = list.size() - n;
        if (indexFromStart < 0 || indexFromStart >= list.size()) {
            throw new IllegalArgumentException("List is shorter than " + n + " elements.");
        }
        return list.get(indexFromStart);
    }
}

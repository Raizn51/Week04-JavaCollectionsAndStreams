package com.tit.day02javacollections.listinterface.reversealist;

import java.util.List;

// Creating a class ListReverser to reverse elements of a List
class ListReverser {
    // Method to reverse a List
    public void reverseList(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}

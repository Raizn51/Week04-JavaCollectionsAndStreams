package com.tit.day02javacollections.listinterface.rotateelementsinalist;

import java.util.ArrayList;
import java.util.List;

// Creating a class RotateList to rotate elements in a list
public class RotateList
{
    // Method to rotate elements of a list by a given number of positions
    public <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        List<T> rotatedList = new ArrayList<>(list.subList(positions % size, size));
        rotatedList.addAll(list.subList(0, positions % size));
        return rotatedList;
    }
}


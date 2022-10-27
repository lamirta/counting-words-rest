package com.example.countingwordsrest.services;

import java.util.Comparator;
import java.util.Map;

public class CompareByFrequency implements Comparator<Map.Entry<String, Integer>> {

    public int compare(Map.Entry<String, Integer> object1,
                       Map.Entry<String, Integer> object2) {
        int f1 = object1.getValue();
        int f2 = object2.getValue();
        if (f1 < f2) {
            return -1;
        } else if (f1 > f2) {
            return 1;
        } else { // If frequencies are equal, compare keys alphabetically.
            return object1.getKey().compareTo(object2.getKey());
        }
    }

}

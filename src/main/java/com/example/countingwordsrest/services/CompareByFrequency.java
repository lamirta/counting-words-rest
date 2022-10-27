package com.example.countingwordsrest.services;

import java.util.Comparator;
import java.util.Map;

public class CompareByFrequency implements Comparator<Map.Entry<String, Integer>> {

    // found on: https://web.tecgraf.puc-rio.br/~ismael/Cursos/apostilas/Java-Notes/data/collections/30maps/ex-wordfreq.html
    // double check this TO DO
    public int compare(Map.Entry<String, Integer> object1,
                       Map.Entry<String, Integer> object2) {
        int f1 = object1.getValue();
        int f2 = object2.getValue();
        if (f1 < f2) {
            return -1;   // or switch, this 1 and else if -1 ?? Double check
        } else if (f1 > f2) {
            return 1;
        } else { // If frequencies are equal, compare keys alphabetically.
            return object1.getKey().compareTo(object2.getKey());
        }
    }

}

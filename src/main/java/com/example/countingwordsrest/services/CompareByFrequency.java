package com.example.countingwordsrest.services;

import java.util.Comparator;
import java.util.Map;

public class CompareByFrequency implements Comparator<Map.Entry<String, Integer>> {



    // found on: https://web.tecgraf.puc-rio.br/~ismael/Cursos/apostilas/Java-Notes/data/collections/30maps/ex-wordfreq.html
    // double check this TO DO
    public int compare(Map.Entry<String, Integer> obj1
            , Map.Entry<String, Integer> obj2) {
        int c1 = obj1.getValue().intValue();
        int c2 = obj2.getValue().intValue();
        if (c1 < c2) {
            return -1;

        } else if (c1 > c2) {
            return 1;

        } else { // If counts are equal, compare keys alphabetically.
            return obj1.getKey().compareTo(obj2.getKey());
        }
    }


}

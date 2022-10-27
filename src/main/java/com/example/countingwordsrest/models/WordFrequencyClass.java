package com.example.countingwordsrest.models;

import com.example.countingwordsrest.utils.WordFrequency;

//@Entity
public class WordFrequencyClass implements WordFrequency {

    final String w;
    final Integer f;

    public WordFrequencyClass(String word, Integer frequency) {
        this.w = word;
        this.f = frequency;
    }


    @Override
    public String getWord() {
        return w;
    }

    @Override
    public int getFrequency() {
        return f;
    }

    @Override
    public String toString() {
        return "word = " + w + ", frequency = " + f;
    }

}

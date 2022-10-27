package com.example.countingwordsrest.models;

import com.example.countingwordsrest.utils.WordFrequency;
import com.example.countingwordsrest.utils.WordFrequencyAnalyzer;

import java.util.List;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {

    final Integer highestFreq;
    final Integer freqForWord;
    WordFrequencyClass wfArray;

    public WordFrequencyAnalyzerClass(Integer highestFreq, Integer freqForWord, WordFrequencyClass wfArray) {
        this.highestFreq = highestFreq;
        this.freqForWord = freqForWord;
        this.wfArray = wfArray;
    }

    public WordFrequencyAnalyzerClass(Integer highestFreq, Integer freqForWord) {
        this.highestFreq = highestFreq;
        this.freqForWord = freqForWord;
    }

    @Override
    public int calculateHighestFrequency(String text) {
        return highestFreq;
    }
    // CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        return freqForWord;
    }
    // CalculateFrequencyForWord should return the frequency of the specified word


    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
    // CalculateMostFrequentNWords should return a list of the most frequent „n" words in the input text, all the words returned in lower case. If..

}

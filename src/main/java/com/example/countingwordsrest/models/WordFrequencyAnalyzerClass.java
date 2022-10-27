package com.example.countingwordsrest.models;

import com.example.countingwordsrest.utils.WordFrequency;
import com.example.countingwordsrest.models.WordFrequencyClass;
import com.example.countingwordsrest.utils.WordFrequencyAnalyzer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {


    private Map<String, Integer> getWords(String text) {
        return 0;
    }

    @Override
    public int calculateHighestFrequency(String text) {

        int highestFreq = 0;
        Map<String, Integer> wfMap = getWords(String text);

        for(every entry e : wfMap) {
            int
        }

        return highestFreq;
    }

    // CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        int freqForWord = 0;


        return freqForWord;
    }
    // CalculateFrequencyForWord should return the frequency of the specified word


    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
    // CalculateMostFrequentNWords should return a list of the most frequent „n" words in the input text, all the words returned in lower case. If..

}

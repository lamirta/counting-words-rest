package com.example.countingwordsrest.services;

import com.example.countingwordsrest.utils.WordFrequency;
import com.example.countingwordsrest.models.WordFrequencyClass;
import com.example.countingwordsrest.utils.WordFrequencyAnalyzer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordFrequencyAnalyzerService implements WordFrequencyAnalyzer {


    private Map<String, Integer> getWords(String text) {
        String word = "";

        Map<String, Integer> wfMap = new HashMap<String, Integer>();



        return wfMap;
    }

    @Override
    public int calculateHighestFrequency(String text) {

        int highestFreq = 0;
        Map<String, Integer> wfMap = getWords(text);

        for(every entry e : wfMap) {
            int
        }

        return highestFreq;
    }

    // CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)

    @Override
    public int calculateFrequencyForWord(String text, String word) {

        int freqForWord;
        Map<String, Integer> wfMap = getWords(text);


        if(wfMap.containsValue(word.toLowerCase())) {
            freqForWord = wfMap.get(word);
            return freqForWord;
        } else {
            return 0;
        }

    }
    // CalculateFrequencyForWord should return the frequency of the specified word


    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {

        Map<String, Integer> wfMap = getWords(String text);


        return null;
    }
    // CalculateMostFrequentNWords should return a list of the most frequent „n" words in the input text, all the words returned in lower case. If..

}
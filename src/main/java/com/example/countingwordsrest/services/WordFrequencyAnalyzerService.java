package com.example.countingwordsrest.services;

import com.example.countingwordsrest.exceptions.BadRequestException;
import com.example.countingwordsrest.utils.WordFrequency;
import com.example.countingwordsrest.models.WordFrequencyClass;
import com.example.countingwordsrest.utils.WordFrequencyAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordFrequencyAnalyzerService implements WordFrequencyAnalyzer {

    private static CompareByFrequency comparator = new CompareByFrequency();



    private Map<String, Integer> getWordFreqList(String text) {
        String word = "";
        char[] chars = text.toCharArray();
        int lastCharNum = chars.length - 1;
        Map<String, Integer> wfMap = new HashMap<String, Integer>();

        for (int i = 0; i < chars.length; i++) {

            char currentChar = chars[i];

            if (Character.isLetter(currentChar) && i != lastCharNum) {
                word += currentChar;
            } else if (!Character.isLetter(currentChar) && !word.isEmpty()) {

                addToGetWords(word, wfMap);

                word = "";

            } else if(Character.isLetter(currentChar) && i == lastCharNum) {
                word += currentChar;
                addToGetWords(word, wfMap);
                word = "";
            }

        }


        return wfMap;
    }

    private void addToGetWords(String word, Map<String, Integer> wfMap) {

        //check if word is already in wordlist and increase frequency if true
        for (WordFrequencyClass wordFrequencyClass : wfMap) {
            if (WordFrequencyClass.getWord().equalsIgnoreCase(word)) {  // Cannot resolve this error, static method?

                WordFrequencyClass + 1;
                return;
            }
        }

        //if not in wordlist add to wordlist
        WordFrequencyClass wordFrequencyClass = new WordFrequencyClass(word);
        wfMap.put(wordFrequencyClass); // Cannot resolve this error

    }

    @Override
    public int calculateHighestFrequency(String text) {

        if (text.isEmpty()) {
            throw new BadRequestException("Bad Request Error: No input");
        }

        int highestFreq = 0;
        Map<String, Integer> wfMap = getWordFreqList(text);

        Collection<Map.Entry<String, Integer>> col = wfMap.entrySet();

        for(Map.Entry<String, Integer> entry: col) {
            int freq = entry.getValue();
            if(freq > highestFreq) {
                highestFreq = freq;
            }
        }

        return highestFreq;
    }
    // CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)

    @Override
    public int calculateFrequencyForWord(String text, String word) {

        int freqForWord;

        Map<String, Integer> wfMap = getWordFreqList(text);


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

        Map<String, Integer> wfMap = getWordFreqList(text);

        Collection<Map.Entry<String, Integer>> col = new ArrayList<>(wfMap.entrySet());


        List<WordFrequency> mostFreqWords = new ArrayList<>();

//        List.sort(col, comparator);  // why error??

        if (n > col.size()) {

        }



        return mostFreqWords;
    }
    // CalculateMostFrequentNWords should return a list of the most frequent „n" words in the input text, all the words returned in lower case. If..

}


//Implement
//        Scanner scan = new Scanner(System.in);
//
//        String s = scan.nextLine();
//
//        scan.useDelimiter("[^A-Za-z]+");
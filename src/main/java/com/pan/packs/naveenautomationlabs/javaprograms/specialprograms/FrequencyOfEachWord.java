package com.pan.packs.naveenautomationlabs.javaprograms.specialprograms;

import java.util.HashMap;
import java.util.Map;

// Frequency of each Word or count occurrences of each Word
public class FrequencyOfEachWord {

    public static void main(String[] args) {
        String inputString = "my name is pankaj gupta my first name is pankaj my last name is gupta";
        String wordForWhichFrequencyHasToDetermine = "name";

        calculateFrequency(inputString, wordForWhichFrequencyHasToDetermine);
    }

    public static void calculateFrequency(String str, String subStr) {

        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String word: words) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            }
            else
                map.put(word,1);
        }

        map.entrySet().stream().filter(e->e.getKey().equals(subStr)).forEach(e-> System.out.println(e.getValue()));
    }
}

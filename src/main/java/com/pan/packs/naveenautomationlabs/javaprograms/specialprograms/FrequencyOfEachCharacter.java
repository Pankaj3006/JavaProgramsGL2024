package com.pan.packs.naveenautomationlabs.javaprograms.specialprograms;

import java.util.HashMap;
import java.util.Map;

// Frequency of each character or count occurrences of each character
public class FrequencyOfEachCharacter {

    public static void main(String[] args) {
        String inputString = " sel sel sel ";

        calculateFrequency(inputString, ' '); // ' ' representing space and this program finds the number of space as 4.
    }

    public static void calculateFrequency(String str, char c) {

        Map<Character, Integer> map = new HashMap<>();

        char[] letters = str.toCharArray();
        for(char letter:letters) {
            if(map.containsKey(letter)) {
                map.put(letter, map.get(letter)+1);
            }
            else {
                map.put(letter, 1);
            }
        }

        map.entrySet().stream().filter(e->e.getKey()==c).forEach(e-> System.out.println(e.getValue()));


    }
}

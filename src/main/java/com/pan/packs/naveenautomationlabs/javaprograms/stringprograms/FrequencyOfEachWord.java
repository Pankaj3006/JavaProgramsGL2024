package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachWord {

    public static void main(String[] args) {
        String str = "my name is pankaj gupta my first name is pankaj my last name is gupta";

        String[] words = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String word: words) {
            Integer count = map.get(word);
            if(count == null) {
                map.put(word, 1);
            }
            else {
                map.put(word, ++count);
            }
        }
        System.out.println(map);
    }
}

package com.pan.packs.edabit;

import java.util.LinkedHashMap;
import java.util.Map;

public class HighestIndex {

    public static void main(String[] args) {
         String str = "Tesha";

         Map<Character, Integer> map = new LinkedHashMap<>();

         char[] letters = str.toLowerCase().toCharArray();

         for(char letter: letters) {
             if(!map.containsKey(letter)) {
                 map.put(letter, (int)letter-96);
             }
         }

         int max = 0;
         char keyWithMaxValue = 0;

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
          if(max < entry.getValue()) {
              max = entry.getValue();
              keyWithMaxValue = entry.getKey();
          }
        }

        System.out.println(""+map.get(keyWithMaxValue)+keyWithMaxValue);
    }
}

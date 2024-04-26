package com.pan.packs.edabit.stringprograms;

// Create a function that takes a string and returns the number of alphanumeric
// characters that occur more than once.


import java.util.LinkedHashMap;
import java.util.Map;

public class CountTheNumberOfDuplicateCharacters {

    public static void main(String[] args) {
        String inputString = "indivisibility";

        calculateDuplicateLetters(inputString);

        duplicateCount(inputString);
    }

    public static void duplicateCount(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int firstOcc = str.indexOf(str.charAt(i));
            int lastOcc = str.lastIndexOf(str.charAt(i));
            if (firstOcc != lastOcc) {
                count++;
                str = str.replaceAll("" + str.charAt(i), "");
            }
        }
        System.out.println(count);
    }

    public static void calculateDuplicateLetters(String s) {
        char[] letters = s.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char letter : letters) {
            if(map.containsKey(letter))
                map.put(letter, map.get(letter)+1);
            else
                map.put(letter, 1);
        }

        System.out.println(map.entrySet().stream().filter(e -> e.getValue() > 1).count());
    }
}

package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.util.Arrays;
import java.util.TreeMap;

// Two strings are said to be anagrams if they contain the same characters but in a
// Different order. Note that a letter has to be used only once.
public class CheckForAnagramStrings {

    public static void main(String[] args) {

        String str1 = "Heart   ";
        String str2 = "earth";

        System.out.println(checkForAnagramStrings(str1, str2));

        // Another Way to check Anagram Strings
        TreeMap<Character, Integer> map1 = getDescriptionOfEachString(str1);
        TreeMap<Character, Integer> map2 = getDescriptionOfEachString(str2);
        if(map1.equals(map2)) {
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
            }
        }

    private static TreeMap<Character, Integer> getDescriptionOfEachString(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        char[] letters = s.replace(" ","").toLowerCase().toCharArray();

        for(char letter: letters) {
            if(map.containsKey(letter))
                map.put(letter, map.get(letter)+1);
            else
                map.put(letter, 1);
        }
        return map;
    }

    private static boolean checkForAnagramStrings(String s1, String s2) {

        String str1 = s1.replace(" ", "");
        String str2 = s2.replace(" ", "");

        if(str1.length() != str2.length()) {
            return false;
        } else {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }
    }
}

package com.pan.packs.edabit.stringprograms;

//Create a function that will remove any repeated character(s) in a word passed to the function.
// Not just consecutive characters, but characters repeating anywhere in the string.

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String inputString = "hello world!";

        printUniqueCharacters(inputString);
        printUniqueCharactersUsingMap(inputString);
    }

    private static void printUniqueCharacters(String str) {
        String stringWithoutDuplicates = "";

        for(int i=0; i<str.length(); i++) {
            if(!stringWithoutDuplicates.contains(str.substring(i, i+1))) {
                stringWithoutDuplicates += str.charAt(i);
            }
        }
        System.out.println("stringWithoutDuplicates = " + stringWithoutDuplicates);
    }

    private static void printUniqueCharactersUsingMap(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] letters = str.toCharArray();

        for(char letter: letters) {
            if(map.containsKey(letter))
              map.put(letter, map.get(letter)+1);
            else
                map.put(letter, 1);
        }

        map.entrySet().stream().forEach(e-> System.out.print(e.getKey()));
    }
}

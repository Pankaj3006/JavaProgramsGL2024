package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {
        String str = "mississippi";
        char[] letters = str.toCharArray();
        // LinkedHashmap is used to maintain the insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character letter: letters) {
            Integer count = map.get(letter);
            if(count == null) {
                map.put(letter, 1);
            }
            else {
                map.put(letter, ++count);
            }
        }

        System.out.println(map);
        // print only the characters which are having duplicates
        map.entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.print(e.getKey()));
        System.out.println();
        // print only the characters which is appearing exactly once
        map.entrySet().stream().filter(e->e.getValue()==1).forEach(e-> System.out.print(e.getKey()));
        System.out.println();
        // Print the string after Removing Duplicates or print unique characters
        map.entrySet().stream().forEach(e-> System.out.print(e.getKey()));
        System.out.println();
        // Another Way - To Print the string after Removing Duplicates or print unique characters
        System.out.println(map.entrySet().stream().map(e -> e.getKey().toString()).collect(Collectors.joining("")));
    }
}

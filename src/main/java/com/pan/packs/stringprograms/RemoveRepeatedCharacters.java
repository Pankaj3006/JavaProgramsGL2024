package com.pan.packs.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedCharacters {

    public static void main(String[] args) {
        String inputString = "Hello World Again";

        System.out.println(removeDuplicates(inputString.toLowerCase()));
    }

    static String removeDuplicates(String str) {
        String strWithoutDuplicates = "";
        Set<String> set = new LinkedHashSet<>();

        for(int i=0; i<str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }

        for(String s :set){
            strWithoutDuplicates += s;
        }
        return  strWithoutDuplicates;
    }
}

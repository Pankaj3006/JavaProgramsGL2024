package com.pan.packs.stringprograms;

public class RemoveRepeatedCharacters2 {

    public static void main(String[] args) {
        String inputString = "Hello World";

        System.out.println(removeDuplicates(inputString));
    }

    static String removeDuplicates(String str) {
        String strWithoutDuplicates = "";

        for(int i=0; i<str.length(); i++) {
            if(!strWithoutDuplicates.contains(str.substring(i,i+1))) {
                strWithoutDuplicates += str.charAt(i);
            }
        }
        return strWithoutDuplicates;

    }
}

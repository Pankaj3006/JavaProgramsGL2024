package com.pan.packs.edabit.stringprograms;

// Create a function that takes a string's characters as ASCII and returns each character's
// hexadecimal value as a string.

public class ConvertToHex {

    public static void main(String[] args) {

        System.out.println(toHex("hello world"));
    }

    public static String toHex(String str) {

        String outputString = "";

        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++) {
                outputString += Integer.toHexString((int)ch[i]) + " ";
        }

        return outputString.trim();
    }
}

package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.util.ArrayList;
import java.util.List;

public class AnuragProgram {
    // input ==> my name is pankaj gupta
    // output => at pugj ak napsie manym

    public static void main(String[] args) {
        String inputString ="my name is pankaj gupta";
        List<Integer> listOfSpaces = new ArrayList<>();
        // To get the index of all spaces
        for(int i=0; i<inputString.length(); i++) {
            if(inputString.charAt(i) == ' ') {
                listOfSpaces.add(i);
            }
        }
        String stringWithoutSpace = inputString.replace(" ", "");
        String reverseString = "";

        for(int i=stringWithoutSpace.length()-1; i>=0; i--) {
            reverseString += stringWithoutSpace.charAt(i);
        }
        // Insert spaces at the indexes present in the input string
        for(int i=0; i<listOfSpaces.size(); i++) {
            reverseString = insertSpaces(reverseString, " ", listOfSpaces.get(i));
        }
        System.out.println("Expected String is ==> " + reverseString);
    }

    public static String insertSpaces(String str, String stringNeedToInsert, int index) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            newString += str.charAt(i);
            if (i == index-1)
                newString += stringNeedToInsert;
        }
        return newString;
    }
}
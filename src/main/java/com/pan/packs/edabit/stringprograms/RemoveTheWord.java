package com.pan.packs.edabit.stringprograms;

// Create a function that takes an array and string. The function should remove the letters in
// the string from the array, and return the array.

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveTheWord {

    public static void main(String[] args) {
        String[] inputArray = {"t", "m", "e", "i", "s", "t", "u"};
        String inputString = "testing";
        String[] outputArray = removeLetters(inputArray, inputString);
        for(int i=0;i< outputArray.length; i++) {
            System.out.println(outputArray[i]);
        }
    }

    static String[] removeLetters(String[] arr, String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j< list.size(); j++) {
                if (list.get(j).charAt(0) == str.charAt(i)) {
                    list.remove(j);
                }
            }
        }

        return list.toArray(new String[list.size()]);
    }


}

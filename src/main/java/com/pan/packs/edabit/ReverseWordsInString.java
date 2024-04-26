package com.pan.packs.edabit;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverseWords( "a good   example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();

        for(int i=words.length-1; i>=0; i--) {
            if(words[i] != "")
                list.add(words[i]);
        }

        String finalString = "";
        for(String l: list) {
            finalString += l + " ";
        }

        return finalString.trim();
    }
}

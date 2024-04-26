package com.pan.packs.stringprograms;

public class ReverseEachWord {

    public static void main(String[] args) {

        String inputString = "My Name is Pankaj";
        String[] each_word = inputString.split(" ");
        String outputString = "";

        for(int i=0; i< each_word.length; i++) {
            outputString = outputString + performReversalForEachWord(each_word[i]) + " ";
        }
        System.out.println("outputString = " + outputString);
    }

    static String performReversalForEachWord(String str) {
        String rev = "";
        char[] ch = str.toCharArray();
        for(int j=ch.length-1; j>=0; j--) {
            rev = rev + ch[j];
        }
        return rev;
    }
}

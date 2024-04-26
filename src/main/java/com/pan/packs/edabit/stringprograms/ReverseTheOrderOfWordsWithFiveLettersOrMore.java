package com.pan.packs.edabit.stringprograms;

// Write a method that takes a string of one or more words as an argument and returns the same string,
// but with all five or more letter words reversed. Strings passed in will consist of only letters and
// spaces. Spaces will be included only when more than one word is present.

public class ReverseTheOrderOfWordsWithFiveLettersOrMore {

    public static void main(String[] args) {
        System.out.println(reverse("This is a typical sentence."));
    }

    public static String reverse(String s) {

        String outputString = "";

        String[] eachWord = s.split(" ");
        for(int i=0; i<eachWord.length; i++) {
            if(eachWord[i].length()>=5)
                outputString += new StringBuffer(eachWord[i]).reverse() + " ";
            else
                outputString += eachWord[i] + " ";
        }
        return outputString.trim();
    }
}

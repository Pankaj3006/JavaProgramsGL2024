package com.pan.packs.edabit.stringprograms;

public class ReverseTheOddLengthWords {

    public static void main(String[] args) {
        String inputString = "Make sure uoy only esrever sdrow of ddo length";

        String[] eachWord = inputString.split(" ");
        String finalString = "";

        for(int i=0; i< eachWord.length; i++) {
            if(eachWord[i].length() %2 ==0) {
                finalString = finalString + eachWord[i] + " ";
            }
            else {
                finalString = finalString + reverseOdd(eachWord[i]) + " ";
            }
        }
        System.out.println(finalString);

    }

    static String reverseOdd(String str) {

//        return String.valueOf(new StringBuffer(str).reverse());

        String reverseWord = "";

        char[]  ch = str.toCharArray();
        for(int i= ch.length-1; i>=0; i--) {
            reverseWord = reverseWord + ch[i];
        }

        return reverseWord;
    }
}

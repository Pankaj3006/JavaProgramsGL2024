package com.pan.packs.edabit.stringprograms;

// We can assign a value to each character in a word, based on their position in the alphabet
// (a = 1, b = 2, ... , z = 26). A balanced word is one where the sum of values on the left-hand side
// of the word equals the sum of values on the right-hand side. For odd length words, the middle
// character (balance point) is ignored.
// Write a function that returns true if the word is balanced, and false if it's not.

public class BalancedWords {

    public static void main(String[] args) {
        System.out.println(balanced("zips"));

    }

    public static boolean balanced(String word) {

        int sumOfLeftSideValues = 0;
        int sumOfRightSideValues = 0;
        int len = word.length();

        if(len % 2 == 0) {
            for(int i=0; i<=(len/2)-1; i++) {
                sumOfLeftSideValues += word.charAt(i) - 96;
            }

            for(int i=len/2; i<len; i++) {
                sumOfRightSideValues += word.charAt(i) - 96;
            }
        }
        else {
            for(int i=0; i<=(len/2)-1; i++) {
                sumOfLeftSideValues += word.charAt(i) - 96;
            }

            for(int i=(len/2)+1; i<len; i++) {
                sumOfRightSideValues += word.charAt(i) - 96;
            }

        }

        if(sumOfLeftSideValues == sumOfRightSideValues)
            return true;
        else
            return false;
    }
}

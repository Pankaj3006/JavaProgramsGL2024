package com.pan.packs.stringprograms;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("radare"));
    }

    static boolean isPalindrome(String str) {

        String reverseString = "";

        for(int i=str.length()-1; i>=0; i--) {
            reverseString += str.charAt(i);
        }

        if(str.equals(reverseString))
            return true;
        else
            return false;
    }
}

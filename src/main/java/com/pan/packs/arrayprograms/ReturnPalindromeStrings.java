package com.pan.packs.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnPalindromeStrings {

    public static void main(String[] args) {

        String[]  array = {"radar", "abc", "abcba", "xyz", "pankaj", "pankajaknap"};
        System.out.println(Arrays.toString(returnPalindrome(array)));
    }

    static String[] returnPalindrome(String[] arr) {

        List<String> list = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            if(isPalindrome(arr[i]))
                list.add(arr[i]);
        }

        return list.toArray(new String[list.size()]);

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

package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.text.DecimalFormat;

// Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String
public class DetailedPercentageOfString {

    public static void main(String[] args) {
        String str = "Naveen Automation Labs 123 %$#@";

        int NumberOfUppercaseLetters =0;
        int NumberOfLowercaseLetters =0;
        int NumberOfDigits =0;
        int NumberOfSpecialCharacters =0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i)<='Z')
                NumberOfUppercaseLetters++;
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
                NumberOfLowercaseLetters++;
            else if(str.charAt(i) >= '0' && str.charAt(i)<='9')
                NumberOfDigits++;
            else
                NumberOfSpecialCharacters++;
        }

        calculatePercentage(NumberOfSpecialCharacters, str.length());
        calculatePercentage(NumberOfUppercaseLetters, str.length());
        calculatePercentage(NumberOfLowercaseLetters, str.length());
        calculatePercentage(NumberOfDigits, str.length());
    }

    private static void calculatePercentage(int a, int totalLength) {
        double percentage = (double) a*100/totalLength;
        DecimalFormat formatter = new DecimalFormat("##.##");
        System.out.println(formatter.format(percentage));
    }
}

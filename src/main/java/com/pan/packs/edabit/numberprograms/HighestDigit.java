package com.pan.packs.edabit.numberprograms;

// Create a function that takes a number as an argument and returns the highest digit in
// that number.

public class HighestDigit {

    public static void main(String[] args) {

        System.out.println("HighestDigit = " + highestDigit(866));

    }

    public static int highestDigit(int n) {

        int max= 0;
        int digit;
        while(n>0) {
            digit = n%10;
            if(digit>max)
                max= digit;
            n = n/10;

        }
        return max;
    }
}

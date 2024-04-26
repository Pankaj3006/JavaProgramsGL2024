package com.pan.packs.edabit.numberprograms;

// A number is said to be Disarium if the sum of its digits raised to their respective positions is
// the number itself.
//Create a function that determines whether a number is a Disarium or not.

public class DisariumNumber {

    public static void main(String[] args) {
        System.out.println(isDisarium(89));
    }

    public static boolean isDisarium(int n) {

        String str = String.valueOf(n);
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            result += (int)Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), i+1);
        }

//        int digit;
//        int count = 0;
//        int temp = n;
//        int NumberOfDigit = 0;
//
//        while(temp != 0) {
//            temp = temp/10;
//            NumberOfDigit++;
//        }
//        temp = n;
//        while(temp !=0) {
//            digit = temp % 10;
//            temp = temp/10;
//            count++;
//            result += Math.pow(digit , (NumberOfDigit - count + 1));
//        }

        if(result == n)
            return true;
        else
            return false;
    }
}

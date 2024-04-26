package com.pan.packs.edabit.arrayprograms;

// Create a function that takes an array of increasing letters and return the missing letter.

public class FindTheMissingLetter {

    public static void main(String[] args) {

        String[]  array = {"m", "o"};

        System.out.println(missingLetter(array));
    }

    public static String missingLetter(String[] arr) {

        int[]  intArray = new int[arr.length];
        int missingNumber = 0;

        for(int i=0; i< arr.length; i++) {
            intArray[i] = arr[i].charAt(0);
        }

        for(int i=1; i< intArray.length; i++) {
            if(intArray[i]-intArray[i-1]>1) {
                missingNumber = (intArray[i]+intArray[i-1])/2;
            }
        }

        return String.valueOf((char)missingNumber);
    }
}

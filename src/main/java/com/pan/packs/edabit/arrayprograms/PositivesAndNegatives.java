package com.pan.packs.edabit.arrayprograms;

// Create a function which validates whether a given array alternates between positive and
// negative numbers.

public class PositivesAndNegatives {

    public static void main(String[] args) {

        int[] num = {10, -10, 50, -7, 45, -7, 0};

        System.out.println(alternateSign(num));
    }

    public static boolean alternateSign(int[] arr) {

        for(int i=1; i<arr.length; i++){
            if(arr[i] * arr[i-1] >= 0) return false;
        }
        return arr.length>1 || arr[0] != 0;
    }
}

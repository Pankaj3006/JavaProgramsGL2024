package com.pan.packs.edabit.numberprograms;

//Create a function that takes an array of integers, sums the even and odd numbers separately,
//then returns the difference between the sum of the even and odd numbers.

public class WarOfNumbers {

    public static void main(String[] args) {
        int[] arr = {12, 8, 7, 1};

        System.out.println("result = " + solution(arr));
    }

    static int solution(int[]  array) {
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumbers += array[i];
            } else {
                sumOfOddNumbers += array[i];
            }
        }

        if(sumOfOddNumbers > sumOfEvenNumbers)
            return sumOfOddNumbers - sumOfEvenNumbers;
        else
            return sumOfEvenNumbers - sumOfOddNumbers;
    }
}

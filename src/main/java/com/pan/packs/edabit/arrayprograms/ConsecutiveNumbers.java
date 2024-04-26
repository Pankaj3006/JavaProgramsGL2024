package com.pan.packs.edabit.arrayprograms;

//Create a function that determines whether elements in an array can be re-arranged to form a
// consecutive list of numbers where each number appears exactly once.

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        int[] inputArray = {5, 4, 3, 2, 1, 1};

        System.out.println(checkForConsecutiveNumbers(inputArray));
    }

    static boolean checkForConsecutiveNumbers(int[] arr) {

        int temp=0;
        boolean flag = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int diff =1;
        for(int i=1; i< arr.length; i++) {

            if(arr[i]-arr[i-1] == diff )
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

}

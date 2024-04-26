package com.pan.packs.naveenautomationlabs.javaprograms.numberprograms;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {4, 8, 0, 6, 10};
        int temp;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        int missingNumber = 0;

        for(int i=1; i<arr.length; i++) {
           if(arr[i]-arr[i-1] != 2)
            {
                missingNumber = (arr[i]+arr[i-1])/2;
            }
        }

        System.out.println("Missing Number is: " + missingNumber);


    }



}

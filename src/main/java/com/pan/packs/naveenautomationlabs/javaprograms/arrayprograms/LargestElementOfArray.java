package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.Arrays;

public class LargestElementOfArray {

    public static void main(String[] args) {

        int[] arr = {-2, -8, -8, 0, -9, -4, -6, -10, -10, -10};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.stream(arr).max().getAsInt());

        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("Max number is: "+ max);
    }
}

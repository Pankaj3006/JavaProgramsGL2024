package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.Arrays;

public class SmallestElementOfArray {

    public static void main(String[] args) {
        int[] arr = {8, 8, 9, 4, -6, 10, 10};

        System.out.println(Arrays.stream(arr).min().getAsInt());

        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Min number is: "+ min);


        //System.out.println(min);


    }
}

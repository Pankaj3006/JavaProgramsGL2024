package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftAllZerosToRightSide {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 2, 0, 3, 0, 5, 6, 0, 0};

        // Using another Array
        int[] newArray = new int[arr.length];
        int count =0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                newArray[count] = arr[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArray));


        // Using List
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0)
                list.add(arr[i]);
        }

        int NumberOfZerosToAdded = arr.length-list.size();

        for(int i=1; i<=NumberOfZerosToAdded; i++) {
            list.add(0);
        }

        System.out.println(Arrays.toString(list.toArray()));

    }
}

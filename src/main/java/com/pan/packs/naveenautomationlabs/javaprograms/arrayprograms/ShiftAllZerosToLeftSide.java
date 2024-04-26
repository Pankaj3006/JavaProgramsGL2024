package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.Arrays;

public class ShiftAllZerosToLeftSide {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 2, 0, 3, 0, 5, 6, 0, 0};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shiftZeroToLeft(arr)));
    }

    public static int[] shiftZeroToLeft(int[] array) {
        int[] newArray = new int[array.length];

        int count = 0;
        for(int i=0;i<array.length; i++) {
            if(array[i] != 0) {
                count++;
            }
        }

        for(int i=0;i<array.length; i++) {
            if(array[i] != 0) {
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }
}

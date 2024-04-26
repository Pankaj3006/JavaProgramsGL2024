package com.pan.packs.edabit.arrayprograms;

// Write a function that returns true if you can partition an array into one element and the rest,
// such that this element is equal to the product of all other elements excluding itself.

public class ProductOfRemainingElements {

    public static void main(String[] args) {
        int[] array = {-1, -20, 80, -1, -2, 2};

        System.out.println(canPartition(array));
    }

    public static boolean canPartition(int[] arr) {
        int max=0;
        int max_index =0;
        int mult =1;

        for(int i=0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }

        for(int i=0; i< arr.length; i++) {
        if(i==max_index) {
            continue;
        }
        mult *= arr[i];
        }

        System.out.println("max_index = " + max_index);
        System.out.println("max = " + max);

        if(mult == max)
            return true;
        else
            return false;
    }
}

package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// An element of array is a leader if it is greater than or equal to all the elements to its
// right side.
public class FindLeaderElementOfArray {

    public static void main(String[] args) {

        int[] a = {92, 7, 12, 9, 8, 3, 3};
        System.out.println(Arrays.toString(findLeaderElements(a)));
    }

    private static Integer[] findLeaderElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = arr[arr.length - 1];
        list.add(max);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}

package com.pan.packs.arrayprograms;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] inputArray = {0, 0, 0, 1, 1, 3, 2, 3, 5, 6};

//        Integer[] out = removeDuplicate(inputArray);
//        for(int i=0; i<out.length; i++) {
//            System.out.println(out[i]);
//        }
        removeDuplicate(inputArray);
    }

    static void removeDuplicate(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i< arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
//        for(Integer i : set)
//            System.out.println("i = " + i);
//        return set.toArray(new Integer[set.size()]);
    }
}

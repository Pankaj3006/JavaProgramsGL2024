package com.pan.interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] array = {2,4,3,7,4,2,1,0};

        Object[] arr = removeDuplicateElements(array);

        for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i]+ " ");
        }
    }

    static Object[] removeDuplicateElements(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);

        return list.toArray();
    }
}

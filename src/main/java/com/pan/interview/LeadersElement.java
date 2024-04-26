package com.pan.interview;

//Find the leaders in the array: Leaders are the elements in an array in which all the elements to
// its right side are smaller than it. {21, 16, 7, 8, 9, 2, 5, 4}

import java.util.ArrayList;
import java.util.List;

public class LeadersElement {

    public static void main(String[] args) {

        int[] arr = {21, 16, 7, 8, 9, 2, 5, 4};
        boolean flag;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            flag = false;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]>arr[i]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            list.add(arr[i]);
        }

        System.out.println(list);

    }
}

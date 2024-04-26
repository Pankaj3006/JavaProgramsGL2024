package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementFromAnArray {

    public static void main(String[] args) {
        int[] arr = {4, 8, 8, 0, 9, 4, 0, 6, 10, 10};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.add(arr[i])==false) {
                System.out.println("Duplicate Elements are: " + arr[i]);
            }
        }

        System.out.println("***************");

        // Using another way
        int[] array = {4, 4, 8, 8, 8, 0, 9, 4, 0, 0, 6, 10, 10, 10};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array) {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i, 1);
        }
        System.out.println(map);
        map.entrySet().stream().filter(e-> e.getValue()>1).forEach(e-> System.out.println(e.getKey()));
    }
}

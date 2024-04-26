package com.pan.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueElementsInArray {

    public static void main(String[] args) {
        int[] array = {1,1,9,9,10,10,100,11,1,11,100,66,6};

        System.out.println(countOfUniqueElements(array));
    }

    private static long countOfUniqueElements(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        System.out.println(map);
        Integer maxFrequency = map.entrySet().stream().map(e -> e.getValue()).max(Integer::compareTo).get();
        map.entrySet().stream().filter(e-> e.getValue()==maxFrequency).forEach(System.out::println);

        return map.keySet().stream().count();
    }
}

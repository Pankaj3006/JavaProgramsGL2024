package com.pan.packs.edabit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheOddInteger {

    public static void main(String[] args) {

        int[] array = {20, -1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        System.out.println(Arrays.toString(findOdd(array))); // -1
    }

    public static Integer[] findOdd(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }

        System.out.println(map);

        List<Integer> list = map.entrySet().stream().filter(e->e.getValue()%2!=0).map(e->e.getKey()).collect(Collectors.toList());

        return list.toArray(new Integer[list.size()]);
    }
}

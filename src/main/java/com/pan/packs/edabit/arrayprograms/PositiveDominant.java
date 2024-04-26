package com.pan.packs.edabit.arrayprograms;

import java.util.HashMap;
import java.util.Map;

public class PositiveDominant {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 0, 0,-1,-1,-2,-2};
        System.out.println(isPositiveDominant(a));
    }

    public static boolean isPositiveDominant(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]+1));
            else
                map.put(arr[i], 1);
        }

        long positiveValues = map.entrySet().stream().filter(e->e.getKey()>0).count();
        long negativeValues = map.entrySet().stream().filter(e->e.getKey()<0).count();

        if(positiveValues>negativeValues)
            return true;
        else
            return false;
    }
}

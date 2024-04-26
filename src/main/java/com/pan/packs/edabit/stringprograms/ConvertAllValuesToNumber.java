package com.pan.packs.edabit.stringprograms;

// You prepare a list to send to the insurance company. As you finish, you notice you misformatted it.
// Given an object with at least one key/value pair, convert all the values to numbers.

import java.util.HashMap;
import java.util.Map;

public class ConvertAllValuesToNumber {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("piano", "200");
        map.put("tv", "300");
        map.put("stereo", "400");
        System.out.println(convertToNumber(map));
    }

    public static Map<String,Integer> convertToNumber(Map<String,String> list) {

        Map<String,Integer> outputMap = new HashMap<>();

        for(Map.Entry<String, String> e: list.entrySet()) {
         outputMap.put(e.getKey(), Integer.parseInt(e.getValue()));
        }

        return outputMap;
    }
}

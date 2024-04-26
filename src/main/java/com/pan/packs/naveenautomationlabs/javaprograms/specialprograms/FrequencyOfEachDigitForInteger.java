package com.pan.packs.naveenautomationlabs.javaprograms.specialprograms;

import java.util.LinkedHashMap;
import java.util.Map;

// Find frequency of each digit for given number
public class FrequencyOfEachDigitForInteger {

    public static void main(String[] args) {

        long number = 123454321098l;

        Map<Long, Integer> map = new LinkedHashMap<>();

        while(number!=0) {
             long digit = number %10;

             if(map.containsKey(digit)) {
                 map.put(digit, map.get(digit)+1);
             } else {
                 map.put(digit, 1);
             }
             number = number/10;
        }

        System.out.println(map);
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));
    }
}

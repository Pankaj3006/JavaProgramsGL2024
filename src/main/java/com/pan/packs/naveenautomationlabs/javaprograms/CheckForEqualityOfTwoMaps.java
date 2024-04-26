package com.pan.packs.naveenautomationlabs.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckForEqualityOfTwoMaps {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("c", 2);
        map1.put("d", 4);
        map1.put("a", 5);

        System.out.println(map1);

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("a", 5);
        map2.put("d", 4);
        map2.put("c", 2);
        System.out.println(map2);

        System.out.println(map1.equals(map2));
    }
}

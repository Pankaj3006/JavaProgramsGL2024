package com.pan.packs.edabit;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

// Create a method that takes a Map<String, String> and return the values as a separate array.
// Return the keys sorted alphabetically, and their corresponding values in the same order.

public class ReturnTheObjectsKeysAndValues {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Apple");
        map.put("c", "Google");
        map.put("b", "Microsoft");

        for(int i=0; i<getValues(map).length; i++) {
            System.out.println(getValues(map)[i]);
        }
    }

    public static String[] getValues(Map<String,String> map) {
        Map<String, String> outputMap = new TreeMap<>(map);

        List<String> list = new ArrayList();
        Set<Entry<String, String>> entry = outputMap.entrySet();
        for(Entry<String, String> e: entry) {
            list.add(e.getValue());
        }

        return list.toArray(new String[list.size()]);
    }
}

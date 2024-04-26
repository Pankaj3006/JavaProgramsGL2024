package com.pan.packs.collectionprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTraversing {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("Pankaj", 10000);
        map.put("Pradeep", 20000);
        map.put("Divyank", 30000);
        map.put("Gunjan", 40000);
        map.put("Pooja", 50000);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println(map);
        traversingUsingEntrySet(map);
        System.out.println("****************************************");
        traversingUsingKeySet(map);
    }

    public static void traversingUsingEntrySet(Map m) {
        Set<Map.Entry> entry = m.entrySet();
        for(Map.Entry e:entry){
            System.out.println(e.getKey() + " ---> " + e.getValue());
        }
    }

    public static void traversingUsingKeySet(Map m) {
        Set<String> keySet = m.keySet();
        for(String key:keySet){
            System.out.println(key + " ---> " + m.get(key));
        }
    }
}

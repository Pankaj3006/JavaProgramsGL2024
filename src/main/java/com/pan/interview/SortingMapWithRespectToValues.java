package com.pan.interview;

import java.util.*;

public class SortingMapWithRespectToValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("Z", 3);
        map.put("B", 4);
        map.put("C", 1);
        System.out.println(map);

        List<Map.Entry<String, Integer>> list
                = new LinkedList<>(map.entrySet());

        list.sort((a,b) ->  a.getValue().compareTo(b.getValue()));

        //Collections.sort(list,  (i1,i2) -> i1.getValue().compareTo(i2.getValue()));

        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println(temp);
    }
}

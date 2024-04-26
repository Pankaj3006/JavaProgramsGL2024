package com.pan.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LogicRelatedToMap {

    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap<>();

        map.put("Sachin", 9.6);
        map.put("kohli", 9.4);
        map.put("Surya", 8.9);

        for(Map.Entry<String, Double> entry : map.entrySet()) {
            if(entry.getValue()>9.1)
                System.out.println(entry.getKey());
        }

       // map.entrySet().stream().filter(e->e.getValue()>9.1).forEach(e-> System.out.println(e.getKey()));
    }
}

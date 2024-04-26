package com.pan.packs.java8programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToStringToMap {

    public static void main(String[] args) {
        Map<String, String> utilMap = new HashMap<>();
        utilMap.put("1","A");
        utilMap.put("2","B");
        utilMap.put("3","C");
        utilMap.put("4","D");

        // Map to String
        String utilMapString = utilMap.entrySet().stream()
                .map(e -> e.toString()).collect(Collectors.joining(","));

        System.out.println(utilMapString);

        Map<String, String> reconstructedUtilMap = Arrays.stream(utilMapString.split(","))
                .map(s -> s.split("="))
                .collect(Collectors.toMap(s -> s[0], s -> s[1]));

        reconstructedUtilMap.forEach((k,v) -> System.out.println(k+":"+v));
    }
}

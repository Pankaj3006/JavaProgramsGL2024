package com.pan.packs.naveenautomationlabs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 22, 234, 567, 254, 345, 28, 2);

        // To filter all the numbers starts with 2
        List<Integer> requiredlist = list
                .stream()
                .map(e -> e.toString())
                .filter(s -> s.startsWith("2"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(requiredlist);
    }
}

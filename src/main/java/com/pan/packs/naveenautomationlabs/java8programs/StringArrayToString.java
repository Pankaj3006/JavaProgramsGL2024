package com.pan.packs.naveenautomationlabs.java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringArrayToString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("t", "r", "v");
        System.out.println(list.stream().collect(Collectors.joining("|")));

        System.out.println(Arrays.asList("t", "r", "y", "i", "n", "g").stream().collect(Collectors.joining("")));

        String str = "my name is pankaj gupta";
//        System.out.println(Arrays.stream(str.split(" "))
//                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1, e.length()))
//                .collect(Collectors.joining(" ")));

        System.out.println(Arrays.stream(str.split(" "))
                .map(e -> new StringBuffer(e))
                .map(e -> e.reverse())
                .collect(Collectors.joining(" ")));
    }
}

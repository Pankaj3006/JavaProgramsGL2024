package com.pan.packs.naveenautomationlabs.java8programs;

import java.util.*;
import java.util.stream.Collectors;

public class Program3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,-3,4,49,2,5,6,6,70);

        // To Print Only Duplicate numbers in the output
        System.out.println("Print Only Duplicate Numbers: " +
                list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet()));

        // another way
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("Print Only Duplicate Numbers: " + list.stream().filter(e -> !set.add(e)).collect(Collectors.toList()));

        // Find max number
        System.out.println("Max Number is: " + list.stream().max((a,b) -> a.compareTo(b)).get());

        // Find min number
        System.out.println("Min Number is: " + list.stream().min((a,b) -> a.compareTo(b)).get());

        // Sorting Numbers {In Increasing order}
        System.out.println("Sort Numbers in increasing order: " + list.stream().sorted().collect(Collectors.toList()));

        // Sorting Numbers {In Decreasing order}
        System.out.println("Sort Numbers in decreasing order: " + list.stream().sorted((a,b)-> -a.compareTo(b)).collect(Collectors.toList()));

        // Get Only first 7 numbers from the given List
        System.out.println("Get Only first 7 Numbers: " + list.stream().limit(7).collect(Collectors.toList()));
        System.out.println("Sum of first 7 Numbers: " + list.stream().limit(7).reduce(0, (a, b) -> a + b));

        // Ignore first 7 numbers from the given list
        System.out.println("Skip First 7 Numbers: " + list.stream().skip(7).collect(Collectors.toList()));
        System.out.println("Sum of Numbers after Skip First 7 Numbers: " + list.stream().skip(7).reduce(0,(a,b)->a+b));

        System.out.println(list.stream().skip(7).limit(3).collect(Collectors.toList()));
    }
}

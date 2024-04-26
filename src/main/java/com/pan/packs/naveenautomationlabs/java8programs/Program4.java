package com.pan.packs.naveenautomationlabs.java8programs;

import java.util.Arrays;
import java.util.List;

public class Program4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,1,2,2,3,3,3,4,4,4,4,6,7,7,7,9,9,10,10,10);

        // Find Second-Highest Number
        System.out.println("Second Highest Number is: " +
                list.stream().sorted((a, b) -> -a.compareTo(b)).distinct().skip(1).findFirst().get());

        // Find Second-Lowest Number
        System.out.println("Second Lowest Number is: " + list.stream().sorted().distinct().skip(1).findFirst().get());
    }
}

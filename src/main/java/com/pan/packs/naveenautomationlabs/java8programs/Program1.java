package com.pan.packs.naveenautomationlabs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 5, 8, 9, 5, 9, 6, 1, 7);

        // To get The Sum of all numbers
        System.out.println("Sum is: " + list.stream().reduce(0, (a, b) -> a + b));

        // To Get the average of all Numbers
        System.out.println("Average is: " + list.stream().mapToInt(e -> e).average().getAsDouble());

        // To get the square of each number
        System.out.println("Square of Each number: " + list.stream().map(e -> e * e).collect(Collectors.toList()));

        // To get the square of each number, filter (<50) and then find average of all numbers
        System.out.println("After All Operation, Average is: " + list.stream().map(e -> e * e).filter(a -> a < 50).mapToInt(e -> e).average().getAsDouble());

        // To get Even Numbers and Odd Numbers
        List<Integer> evenNumbersList = list.stream().filter(e-> e%2==0).collect(Collectors.toList());
        List<Integer> oddNumbersList = list.stream().filter(e-> e%2!=0).collect(Collectors.toList());
        System.out.println("Even Numbers list: " + evenNumbersList);
        System.out.println("Odd Numbers List: " + oddNumbersList);
    }
}

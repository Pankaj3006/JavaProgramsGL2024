package com.pan.packs.java8programs.streamprograms.streamMethods;

import java.util.Arrays;
import java.util.List;

public class ExplainCountMethod {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bus", "bike", "train", "flight", "car");

        System.out.println(vehicles.stream().count());
        System.out.println("******************");
        System.out.println(vehicles.stream().distinct().count());
        System.out.println("******************");
        vehicles.stream().limit(3).forEach(System.out::println);
        System.out.println("******************");
        vehicles.stream().distinct().limit(3).forEach(System.out::println);
        System.out.println("******************");
        vehicles.stream().skip(3).forEach(System.out::println);
        System.out.println("******************");
        // Default Natural Sorting Order
        vehicles.stream().sorted().forEach(System.out::println);
        System.out.println("******************");
        // Customized Sorting Order
        vehicles.stream().sorted((a,b)->-a.compareTo(b)).forEach(System.out::println);
        System.out.println("******************");
        // Customized Sorting Order With filtering and mapping
        vehicles.stream().sorted((a,b)->-a.compareTo(b)).filter(s->s.length()>3).map(String::toUpperCase).forEach(System.out::println);
    }
}

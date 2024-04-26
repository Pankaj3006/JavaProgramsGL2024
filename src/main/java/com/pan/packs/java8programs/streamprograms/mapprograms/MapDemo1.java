package com.pan.packs.java8programs.streamprograms.mapprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "Car", "train", "bicycle", "flight");

        List<String> vehiclesWithUpperCase = vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(vehiclesWithUpperCase);
    }
}

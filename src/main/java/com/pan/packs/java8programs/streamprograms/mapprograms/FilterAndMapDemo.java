package com.pan.packs.java8programs.streamprograms.mapprograms;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapDemo {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "Car", "train", "bicycle", "flight");

        vehicles.stream().map(String::toUpperCase).filter(s->s.length()>4 && s.length()<7).forEach(System.out::println);

    }
}

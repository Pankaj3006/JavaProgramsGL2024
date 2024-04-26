package com.pan.packs.java8programs.streamprograms.filterprograms;

import java.util.Arrays;
import java.util.List;

public class FilterNonNullString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sky", null, "Fly", null, "product", "Dell");

        list.stream().filter(s-> s != null).forEach(System.out::println);
    }
}

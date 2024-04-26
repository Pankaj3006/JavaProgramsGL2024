package com.pan.packs.java8programs.streamprograms.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// findAny(), findFirst(), noneMatch(), allMatch(), anyMatch()
public class ExplainOtherMethods {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Two Apples", "One Mango", "One Apple", "Two Bananas", "More Mangoes");

        boolean result = list.stream().anyMatch(str -> str.startsWith("One"));
        System.out.println(result);

        result = list.stream().allMatch(str -> str.startsWith("One"));
        System.out.println(result);

        result = list.stream().noneMatch(str -> str.startsWith("One"));
        System.out.println(result);

        Optional<String> anyString = list.stream().findAny();
        System.out.println(anyString.get());

        Optional<String> firstString = list.stream().findFirst();
        System.out.println(firstString.get());
    }
}

package com.pan.packs.java8programs.streamprograms.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatinatingTwoStreams {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Dog", "Cat", "Lion");
        List<String> birds = Arrays.asList("peacock", "sparrow", "bird");
        List<String> reptiles = Arrays.asList("crocodiles", "fish");

        Stream stream1 = animals.stream();
        Stream stream2 = birds.stream();
        Stream stream3 = reptiles.stream();

        Stream stream4 =Stream.concat(stream1,stream2);
        Stream finalStream = Stream.concat(stream3, stream4);

        finalStream.forEach(System.out::println);
    }
}

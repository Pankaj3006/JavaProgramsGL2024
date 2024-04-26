package com.pan.packs.java8programs.streamprograms.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExplainMinMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> min = list.stream().filter(i->i%2==0).min((a, b) -> a.compareTo(b));
        System.out.println(min.get());
    }
}

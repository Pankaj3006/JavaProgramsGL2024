package com.pan.packs.java8programs;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isSumDivBy10 = (a,b) -> a+b%10==0;
        BiPredicate<String, Integer> isStringLengthEqualToSpecified = (a,b) -> a.length()==b;
        BiPredicate<String, String> isStringLengthEqual = (a,b) -> a.length()==b.length();

        System.out.println(isSumDivBy10.test(5,5));
        System.out.println(isStringLengthEqual.test("Pankaj", "Gupta"));
        System.out.println(isStringLengthEqualToSpecified.test("Pankaj",6));


    }
}

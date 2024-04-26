package com.pan.packs.java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i%2==0;
        Predicate<Integer> isOdd = isEven.negate();
        Predicate<Integer> isDivBy3 = i -> i%3==0;
        Predicate<Integer> isDivBy6 = isEven.and(isDivBy3);
        Predicate<String> isStringStartsWithA = s -> s.startsWith("a");
        Predicate<String> isStringStartsWithB = s -> s.startsWith("b");
        Predicate<String> isStringStartsWithAOrB = isStringStartsWithA.or(isStringStartsWithB);

        System.out.println(isEven.test(5));
        System.out.println(isOdd.test(7));
        System.out.println(isOdd.negate().test(4));
        System.out.println(isDivBy6.test(9));
        System.out.println(isDivBy6.test(12));
        System.out.println(isStringStartsWithAOrB.test("Pankaj"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,110);

        System.out.println(list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum));

        int[] a = {1,2,3,4,5,6,7,8,9,10,110};

        System.out.println(Arrays.stream(a).filter(i -> i % 2 == 0).sum());


    }
}

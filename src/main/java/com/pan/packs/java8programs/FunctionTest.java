package com.pan.packs.java8programs;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {
    private static Function<Integer, Integer> add5 = i-> i+5;
    private static Function<Integer, Integer> mult5 = i-> i*5;
    private static Function<String, String> add = i-> String.valueOf(Integer.parseInt(i)+10);
    private static UnaryOperator<String> length = s-> String.valueOf(s.length());
    private static BiFunction<Integer, Integer, Integer> sum = (a,b) -> a+b;
    private static BinaryOperator<Integer> sumUsingBinary = (a,b) -> a+b;

    public static void main(String[] args) {
        System.out.println(add5.apply(5));
        System.out.println(mult5.apply(10));
        System.out.println(add5.andThen(mult5).apply(5));
        System.out.println(add5.compose(mult5).apply(5));
        System.out.println(mult5.andThen(add5).apply(5));
        System.out.println(length.apply("Pankaj"));
        System.out.println(length.andThen(add).apply("Testing"));
        System.out.println(sum.apply(5,6));
        System.out.println(sumUsingBinary.apply(5,7));
    }
}

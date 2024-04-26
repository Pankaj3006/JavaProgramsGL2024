package com.pan.packs.java8programs;

import java.util.function.Supplier;

public class SupplierTest {

    private static Supplier<Double> op = () -> Math.random();
    private static Supplier<Integer> ope = () -> (int)(Math.random()*10);

    public static void main(String[] args) {

        System.out.println(op.get());
        System.out.println(ope.get());

    }
}

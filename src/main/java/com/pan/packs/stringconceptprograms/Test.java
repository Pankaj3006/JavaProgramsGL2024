package com.pan.packs.stringconceptprograms;

public class Test {

    public static void main(String[] args) {
        final int[] x= {1, 2, 3};
        x[0] = 4;
        System.out.println(x[0] + " " + x[1] + " " + x[2]);
        String s1 = new String("pankaj");
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        String s5 = s4.toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
    }

    void m1() {
        System.out.println("m1 method");

    }
}

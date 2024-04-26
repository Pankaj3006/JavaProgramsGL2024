package com.pan.practice;

public class Child extends Parent {

    public void test() {
        System.out.println("Child Class");
    }
    public void test1() {
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Pankaj");
        sb.append("Gupta");
        System.out.println(sb);
    }
}

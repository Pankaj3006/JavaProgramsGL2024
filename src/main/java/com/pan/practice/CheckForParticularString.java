package com.pan.practice;

public class CheckForParticularString {

    public static void main(String[] args) {
        String str = "mynameisvinodkumar";

        String subStr = "vinod123";

        System.out.println(check(str, subStr));
    }

    private static boolean check(String s, String subS) {

       // return s.contains(subS);
        return s.indexOf(subS) != -1;
    }
}

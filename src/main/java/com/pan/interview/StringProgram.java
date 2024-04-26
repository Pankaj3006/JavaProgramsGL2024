package com.pan.interview;

public class StringProgram {

    public static void main(String[] args) {
        String str = "Im in interview";

        String initialPart = str.substring(0, 2);
        String finalPart = str.substring(str.length()-4, str.length());

        String finalString = initialPart + " " + finalPart;

        System.out.println(finalString);
    }
}

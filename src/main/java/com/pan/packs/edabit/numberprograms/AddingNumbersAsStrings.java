package com.pan.packs.edabit.numberprograms;

// Create a function that takes two number strings and returns their sum as a string.
// Return "Invalid Operation" If either input is "" or null.

public class AddingNumbersAsStrings {

    public static void main(String[] args) {

        System.out.println(add("903", "167"));
    }

    public static String add(String a, String b) {

        if(a == "" || b == "" || a== null || b == null)
            return "Invalid Operation";
        else
            return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));

    }
}

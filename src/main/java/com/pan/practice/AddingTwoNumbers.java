package com.pan.practice;

public class AddingTwoNumbers {

    public static void main(String[] args) {
         String firstNumber = "789";
         String secondNumber = "45500";
        System.out.println(add(firstNumber, secondNumber));
    }

    public static String add(String a, String b) {
        if (a == null || b == null || a.isBlank() || b.isBlank()) {
            return "Invalid Operation";
        }

        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}

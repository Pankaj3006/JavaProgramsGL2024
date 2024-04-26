package com.pan.interview;

public class NumberOfPerfectSquare {

    public static void main(String[] args) {

        int a= 3;
        int b= 10000;
        System.out.println(countPerfectSquareNumbers(a, b));
    }

    public static int countPerfectSquareNumbers(int num1, int num2) {

        int result = (int)(Math.floor(Math.sqrt(num2)) - Math.ceil(Math.sqrt(num1)) +1);
        return result;
    }
}

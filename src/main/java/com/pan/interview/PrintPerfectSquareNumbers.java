package com.pan.interview;

public class PrintPerfectSquareNumbers {

    public static void main(String[] args) {
        int a=3;
        int b=10000;
        for(int i=a; i<=b; i++) {
            if(checkForPerfectSquare(i))
            System.out.print(i + "  ");
        }
    }

    public static boolean checkForPerfectSquare(int num) {

        if(Math.floor(Math.sqrt(num)) - Math.sqrt(num) == 0)
            return true;
        else
            return false;
    }
}

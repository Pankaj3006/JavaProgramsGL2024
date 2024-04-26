package com.pan.packs.naveenautomationlabs.javaprograms;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        x = x+y; // x=30
//        y = x-y; // y=10
//        x = x-y; // x=20
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

//        x = x^y; // x=30
//        y = x^y; // y=10
//        x = x^y; // x=20
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        x = x*y; // x=200
        y = x/y; // y=10
        x = x/y; // x=20

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}

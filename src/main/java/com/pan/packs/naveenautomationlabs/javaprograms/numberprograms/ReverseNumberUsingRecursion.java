package com.pan.packs.naveenautomationlabs.javaprograms.numberprograms;

public class ReverseNumberUsingRecursion {

    public static void main(String[] args) {

        int num = 12345;

//        int rev = 0;
//        while(num>0) {
//            rev = rev * 10 + num % 10;
//            num = num/10;
//        }
//        System.out.println(rev);

        calculateReverse(num);
    }

    private static void calculateReverse(int number) {
        if(number<10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number%10);
            calculateReverse(number/10);
        }

    }
}

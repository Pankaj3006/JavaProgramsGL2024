package com.pan.packs.edabit;

// You are given two numbers n and k. The number p is created by concatenating the string n,
// k times. Continuing the above example where n = 9875, assume your value k=4. Your initial
// p = 9875 9875 9875 9875 (spaces added for clarity).

import java.math.BigInteger;

public class RecursiveDigit {

    public static void main(String[] args) {
        System.out.println(superDigit("148", 3));
        System.out.println(superDigit("123", 3));
        //System.out.println(superDigit("99999999999999999999999999", 104500));
    }

    public static int superDigit(String n, int k) {
        String  p ="";
        while(k>0) {
            p += n;
            k--;
        }

        int num = Integer.parseInt(p);
        int sum;

        do {
            sum=0;
            while (num>0) {
                int digit = num%10;
                sum += digit;
                num = num/10;
            }
            num = sum;
        }while(sum>10);

        return sum;
    }
}

package com.pan.packs.edabit;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(gcd(6, 30));
    }

    public static int gcd(int a, int b) {

        int smallNum = Math.min(a,b);
        int gcd = 0;
        for(int i=smallNum; i>=1; i--) {
            if(a%i==0 && b%i==0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}

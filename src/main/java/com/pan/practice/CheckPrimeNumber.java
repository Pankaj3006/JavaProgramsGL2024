package com.pan.practice;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        int num =1001;
        boolean flag = false;

        for(int i=2; i<=num/2; i++) {
            if(num%i==0) {
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println("Number is prime Number");
        else
            System.out.println("Number is not a prime Number");
    }
}

package com.pan.packs.edabit;

// Create a function that tests whether or not an integer is a perfect number. A perfect number is a
// number that can be written as the
// sum of its factors, (equal to sum of its proper divisors) excluding the number itself.

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(checkPerfect(1001));
    }

    public static boolean checkPerfect(int num) {

        int sumOfFactors = 0;
        for(int i=1; i<=num/2; i++) {
            if(num%i==0) {
                sumOfFactors += i;
            }
        }

        if(sumOfFactors == num)
            return true;
        else
            return false;
    }
}

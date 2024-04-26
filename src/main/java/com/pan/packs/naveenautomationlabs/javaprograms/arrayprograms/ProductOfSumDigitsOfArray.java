package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

public class ProductOfSumDigitsOfArray {

    public static void main(String[] args) {
            int[] array = {167, 167, 167, 167, 167, 31, 7654};

            int sum=0;
            for(int i:array) {
                sum += i;
            }

        System.out.println(sum);

            int mult;
            do {
                mult = 1;
                while (sum > 0) {
                    int digit = sum % 10;
                    // to Check if any Digit is zero. Instantly the product will become Zero.
                    if(digit == 0) {
                        mult =0;
                        break;
                    }
                    mult *= digit;
                    sum = sum / 10;
                } // 192, 18, 8
                sum = mult;
                System.out.println(mult);
            } while(mult>10);


    }
}

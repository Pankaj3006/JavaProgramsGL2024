package com.pan.packs.edabit.arrayprograms;

public class ProductOfDigitsOfSum {

    public static void main(String[] args) {
        int[] array = {167, 167, 167, 167, 167, 3};

        System.out.println(calculateProduct(array));
    }

    static long calculateProduct(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int r;
        long prodOfSum;

        do {
            if(sum==0)
                r=0;
            else
                r=1;
            while (sum != 0) {
                r *= sum % 10;
                sum = sum / 10;
            }
            prodOfSum = r;
            sum = r;
        } while (prodOfSum >= 10);


        return prodOfSum;
    }
}

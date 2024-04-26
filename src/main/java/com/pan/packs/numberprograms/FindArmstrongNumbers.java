package com.pan.packs.numberprograms;

public class FindArmstrongNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            if (i == findSumOfDigits(i))
                System.out.println(i);
        }
    }

    static int findSumOfDigits(int num) {
        int temp = num;
        int sumOfDigits = 0;
        int NoOfDigits = 0;

        while (temp != 0) {
            NoOfDigits++;
            temp = temp / 10;
        }

        while (num != 0) {
            temp = num % 10;
            sumOfDigits = sumOfDigits + (int) Math.pow(temp, NoOfDigits);
            num = num / 10;
        }

        return sumOfDigits;
    }
}

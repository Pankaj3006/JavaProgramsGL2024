package com.pan.packs.naveenautomationlabs.javaprograms;

public class CheckForArmstrongNumber {

    public static void main(String[] args) {
        int num = 54748;
        System.out.println(checkArmstrongNumber(num));
        if(checkArmstrongNumber(num) == num)
            System.out.println("Number is Armstrong number");
        else
            System.out.println("Number is not Armstrong number");
    }

    private static int checkArmstrongNumber(int number) {
        int sum = number;
        int count = 0;
        while(sum > 0) {
            count++;
            sum = sum/10;
        }

        while(number > 0) {
            int digit = number % 10;
            sum += (int)Math.pow(digit, count);
            number = number/10;
        }

        return sum;
    }
}

package com.pan.packs.numberprograms;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 154;

        if(num==findSumOfDigits(num)) {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }
    }

    static int findSumOfDigits(int num) {
        int temp = num;
        int sumOfDigits =0;
        int NoOfDigits =0;

        while(temp!=0) {
            NoOfDigits++;
            temp = temp/10;
        }

        while(num!=0) {
            temp = num %10;
            sumOfDigits = sumOfDigits + (int)Math.pow(temp, NoOfDigits);
            num = num/10;
        }

        return sumOfDigits;
    }

}

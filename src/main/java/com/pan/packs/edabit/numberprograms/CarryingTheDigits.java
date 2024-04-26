package com.pan.packs.edabit.numberprograms;

// Write a function that returns the number of times you must carry a digit when you sum together
// two integers.

public class CarryingTheDigits {

    public static void main(String[] args) {

        System.out.println(carryDigits(956, 135));
    }

    public static int carryDigits(int n1, int n2) {

        int count = 0;
        int digitFromFirstNumber;
        int digitFromSecondNumber;
        int carry = 0;

        while(n1 != 0 || n2 != 0) {
            digitFromFirstNumber = n1 % 10;
            digitFromSecondNumber = n2 % 10;

            if(digitFromFirstNumber + digitFromSecondNumber + carry >= 10) {
                count++;
                carry = 1;
            }
            else
                carry = 0;

            n1 = n1 /10;
            n2 = n2 /10;
        }

        return count;
    }
}

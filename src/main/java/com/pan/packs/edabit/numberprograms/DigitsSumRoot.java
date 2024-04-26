package com.pan.packs.edabit.numberprograms;

// Create a function that takes a number and returns one digit that is the result of summing all the
// digits of the input number. When the sum of the digits consists of more than one digit, repeat
// summing until you get one digit.

public class DigitsSumRoot {

    public static void main(String[] args) {
        System.out.println(digitRoot(999888777L));
    }

    public static int digitRoot(long n) {

        int add = 0;

        while(n>10) {
             add =0;
            while (n != 0) {
                add += n % 10;
                n = n / 10;
            }
            n = add;
        }

        return add;

    }
}

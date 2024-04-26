package com.pan.packs.edabit.numberprograms;

// Create a function that takes a number and returns its multiplicative persistence,
// which is the number of times you must multiply the digits in num until you reach a
// single digit.

public class PersistentLittleBugger {

    public static void main(String[] args) {
        System.out.println(bugger(39));

    }

    public static int bugger(int num) {

        int mult = 0;
        int digit;

        while (num>10) {
            mult = 1;
            do {
                digit = num % 10;
                mult *= digit;
                num = num / 10;
            } while (num != 0);
            num = mult;
        }

        return mult;
    }
}

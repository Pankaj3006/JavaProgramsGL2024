package com.pan.packs.edabit.numberprograms;

// create a function that takes two numbers a and b and an operator 'o'. His function should return
// the result of the corresponding mathematical function on both numbers. If the operator is not one of
// the specified characters +, -, /, *, or if there is a division by zero, the function should return null. Help him by fixing the code in the code tab to pass this challenge.

public class FixBasicCalculator {

    public static void main(String[] args) {

    }

    public static Object basicCalculator(int a, String o, int b) {
        Object result;
        if(o == "+")
            result = a + b;
        else if(o == "-")
            result = a - b;
        else if(o == "*")
            result = a * b;
        else if(o == "/" && b != 0)
            result = a / b;
        else
            result = null;

        return result;
    }

}

package com.pan.packs.edabit.numberprograms;

// Given a positive integer n and if 1 plus 2 times n exactly divides 1 plus 2 raised to the
// power n, then n is said to be a Curzon number.

import java.math.BigDecimal;
import java.math.BigInteger;

public class CurzonNumbers {

    public static void main(String[] args) {
        int num = 194;

        System.out.println(isCurzon(num));
    }

    public static boolean isCurzon(int n) {

        BigInteger N = BigInteger.valueOf(n);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        BigInteger elevated = two.pow(n).add(one);
        BigInteger multiplied = two.multiply(N).add(one);

        return elevated.mod(multiplied).equals(BigInteger.ZERO);

    }
}

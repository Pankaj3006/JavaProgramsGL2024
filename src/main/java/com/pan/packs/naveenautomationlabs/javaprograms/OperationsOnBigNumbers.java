package com.pan.packs.naveenautomationlabs.javaprograms;

import java.math.BigInteger;

public class OperationsOnBigNumbers {

    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("12345678901234567890123456789012345678900987654321");
        BigInteger n2 = new BigInteger("12345678901234567890123456789012345678900987654321");

        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
        System.out.println(n1.subtract(n2));
        System.out.println(n1.divide(n2));
    }
}

package com.pan.packs.stringprograms;

// Create a function that takes a string of 1's and 0's (binary) as an argument and
// return the equivalent decoded ASCII text.

public class BinaryToASCIIConversion {

    public static void main(String[] args) {
        System.out.println(binaryConversion("010010010010000001101100011011110111011001100101001000000101010001100101011100110110100000100001"));
    }

    public static String binaryConversion(String bin) {

        String outputString = "";
        for(int i=0; i<bin.length(); i=i+8) {
           outputString += (char)Integer.parseInt(bin.substring(i, i+8),2);
        }

        return outputString;
    }
}

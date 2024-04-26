package com.pan.packs.naveenautomationlabs.javaprograms.numberprograms;

public class CheckNumberIsBinary {

    public static void main(String[] args) {
        long num= 10100101l;
        if(checkForBinaryNumber(num))
            System.out.println("The Given Number " + num + " is a binary number");
        else
            System.out.println("The Given number " + num + " is NOT a binary number");

        System.out.println(checkForBinaryNum(num));
    }

    private static boolean checkForBinaryNumber(long number) {
        boolean flag = true;

        while(number >0) {
            if(number%10>1) {
                flag = false;
                break;
            }
            number = number/10;
        }
        return flag;
    }

    private static boolean checkForBinaryNum(long number) {
        try {
            Integer.parseInt(String.valueOf(number), 2);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}

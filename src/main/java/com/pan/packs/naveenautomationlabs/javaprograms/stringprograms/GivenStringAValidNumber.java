package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

public class GivenStringAValidNumber {

    public static void main(String[] args) {
        String str = "123098756402134";
        System.out.println(isValidNumber(str));
        System.out.println(isValidNumber1(str));
        System.out.println(isValidNumber2(str));
        if(isValidNumber(str))
            System.out.println("The Given number "+str+ " is a valid number");
        else
            System.out.println("The Given number "+str+ " is not a valid number");
    }

    public static boolean isValidNumber(String number) {
        try {
            Double.parseDouble(number);
            //Long.parseLong(number);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidNumber1(String number) {
        return number.matches("[0-9]+");
    }

    public static boolean isValidNumber2(String number) {
        return number.matches("\\d+");
    }
}

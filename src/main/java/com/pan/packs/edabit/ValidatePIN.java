package com.pan.packs.edabit;

public class ValidatePIN {

    public static void main(String[] args) {

        System.out.println(validate("123473"));
    }

    public static boolean validate(String pin) {

        String regex4 = "[0-9]{4}";
        String regex6 = "\\d{6}";

        if(pin.matches(regex4) || pin.matches(regex6))
            return true;
        else
            return false;
    }
}

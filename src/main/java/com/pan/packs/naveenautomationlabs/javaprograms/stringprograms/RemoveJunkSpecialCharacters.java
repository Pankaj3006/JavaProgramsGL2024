package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

public class RemoveJunkSpecialCharacters {

    public static void main(String[] args) {
        String str = "汉字/漢字 @#$%&*() latin String 1234567890";

        str = str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(str);
    }
}

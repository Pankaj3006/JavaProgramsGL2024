package com.pan.packs.edabit;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        System.out.println(titleToNumber("AA"));
    }

    public static int titleToNumber(String s) {

        int result =0;

        for(int i=s.length()-1; i>=0; i--) {
            result += 26 * (s.length()-1) + s.charAt(i) - 64;
        }

        return result;
    }
}

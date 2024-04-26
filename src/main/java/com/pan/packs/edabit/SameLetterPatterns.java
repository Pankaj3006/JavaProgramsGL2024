package com.pan.packs.edabit;

public class SameLetterPatterns {

    public static void main(String[] args) {

        System.out.println(sameLetterPattern("BAAB", "QZZQ"));
    }

    public static boolean sameLetterPattern(String str1, String str2) {

        if(str1.length()!=str2.length())
            return false;

        boolean flag = false;

        for(int i=1; i<str1.length(); i++) {
            if(str1.charAt(i)-str1.charAt(i-1)==str2.charAt(i)-str2.charAt(i-1))
                flag = true;
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}

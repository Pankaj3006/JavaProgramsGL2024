package com.pan.packs.edabit.stringprograms;

public class CaseAndIndexInverter {

    public static void main(String[] args) {

        String str = "dLROW YM sI HsEt";

        System.out.println(invert(str));
    }

    public static String invert(String s) {
        String finalString = "";

        char[]  ch = s.toCharArray();

        for(int i=ch.length-1; i>=0; i--) {
            if(ch[i]>='a' && ch[i]<='z') {
                finalString = finalString + String.valueOf(ch[i]).toUpperCase();
            }

            else if (ch[i]>='A' && ch[i]<='Z') {
                finalString = finalString + String.valueOf(ch[i]).toLowerCase();
            }

            else {
                finalString = finalString + ch[i];
            }
        }

        return  finalString;
    }
}

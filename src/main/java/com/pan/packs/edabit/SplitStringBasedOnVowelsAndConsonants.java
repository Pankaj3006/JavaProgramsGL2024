package com.pan.packs.edabit;

public class SplitStringBasedOnVowelsAndConsonants {

    public static void main(String[] args) {
        System.out.println(split("What's the time?"));
    }

    public static String split(String str) {
        String vowelChars = "";
        String consonantsChars = "";

        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                vowelChars += ch[i];
            }
            else {
                consonantsChars += ch[i];
            }
        }

        return vowelChars + consonantsChars;
    }
}

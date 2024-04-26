package com.pan.packs.edabit;

public class FirstNVowels {

    public static void main(String[] args) {
        System.out.println(firstNVowels("shrimp", 2));
    }

    public static String firstNVowels(String str, int n) {

        char[] ch = str.toCharArray();
        int count = 0;
        String firstNVowels = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                firstNVowels += ch[i];
                count++;
            }

            if (count == n)
                break;
        }

        if(firstNVowels.length()<n)
            firstNVowels = "invalid";

        return firstNVowels;
    }
}

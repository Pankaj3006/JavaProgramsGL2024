package com.pan.practice;

public class ExpectedFormat {

    public static void main(String[] args) {
        String inputString = "this is epam systems";
        System.out.println(reverseStringWithCapitalLetter(inputString));
        String str = "Abcd01234%^&*";
        System.out.println(extractAlphaNumericCharacter(str));
    }

    private static String reverseStringWithCapitalLetter(String str) {
        String[] words = str.split(" ");
        String rev = "";

        for(int i=words.length-1; i>=0; i--) {
            rev += words[i].substring(0,1).toUpperCase()
                    +
                    words[i].substring(1,words[i].length())
                    +
                    " ";
        }
        return rev;
    }

    private static String extractAlphaNumericCharacter(String str) {
        char[] ch = str.toCharArray();

        String ex = "";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        for(int i=0; i<ch.length; i++) {
            if((ch[i]>='0' && ch[i]<='9') || (ch[i]>='A' && ch[i]<= 'Z') || (ch[i]>='a' && ch[i]<='z'))
                ex += ch[i];
        }
        return ex;
    }
}

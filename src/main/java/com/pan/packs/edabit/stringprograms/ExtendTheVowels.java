package com.pan.packs.edabit.stringprograms;

// Create a function that takes a word and extends all vowels by a number num.

public class ExtendTheVowels {

    public static void main(String[] args) {

        System.out.println(extendVowels("Xavier", 6));

    }

    public static String extendVowels(String w, int n) {

        String outputString = "";
        char[]  ch = w.toCharArray();
        if(n>=0) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
                        ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                    outputString = outputString + repeatCharacter(ch[i], n);
                else
                    outputString = outputString + ch[i];
            }
        }
        else
            outputString = "invalid";
        return outputString;

//        return n > -1 ? w.replaceAll("(?i)([aeiou])",
//                new String(new char[n+1]).replace("\0", "$1")) : "invalid";
    }

    static String repeatCharacter(char c, int n) {
        String repeatString = "";
        for(int i=0; i<=n; i++) {
            repeatString += c;
        }
        return repeatString;
    }
}

package com.pan.packs.edabit;

// The Atbash cipher is an encryption method in which each letter of a word is replaced with
// its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
// Capitalisation should be retained.
// Non-alphabetic characters should not be altered.
//Create a function that takes a string and applies the Atbash cipher to it.

public class AtbashCipher {

    public static void main(String[] args) {

        System.out.println(atbash("apple")); // "zkkov"

        System.out.println(atbash("Hello world!")); // "Svool dliow!"

        System.out.println(atbash("Christmas is the 25th of December")); // "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

    }

    public static String atbash(String str) {

        String atbashString = "";
        for(int i=0; i<str.length(); i++) {
            atbashString += generateAtbash(str.charAt(i));
        }

        return atbashString;
    }

    private static char generateAtbash(char c) {
        if(c >= 'A' && c<= 'Z') {
            return (char)(90-c+'A');
        } else if(c >= 'a' && c<= 'z')
            return (char)(122-c+'a');
        else
            return c;
    }
}

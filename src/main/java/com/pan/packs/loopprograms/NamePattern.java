package com.pan.packs.loopprograms;

public class NamePattern {

    public static void main(String[] args) {
        String name= "Pankaj";

        // Using functions
        for(int i=0; i<=name.length(); i++) {
            System.out.println(name.substring(0,i));
        }
        for(int i=name.length()-1; i>=1; i--) {
            System.out.println(name.substring(0,i));
        }

        System.out.println("***********************************");
        // using Arrays
        char[] letter = name.toCharArray();
        for(int i=0; i<letter.length; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(letter[j]);
            }
            System.out.println();
        }
        for(int i=letter.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print(letter[j]);
            }
            System.out.println();
        }

    }
}

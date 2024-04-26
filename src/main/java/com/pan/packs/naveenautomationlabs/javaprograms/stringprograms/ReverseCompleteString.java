package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

public class ReverseCompleteString {

    public static void main(String[] args) {

        String str = "Pankaj Gupta";
       // String rev = "";

        for(int i=str.length()-1; i>=0; i--) {
           // rev = rev +str.charAt(i);
            System.out.print(""+str.charAt(i));
        }

        System.out.println();

        // Using another way
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}

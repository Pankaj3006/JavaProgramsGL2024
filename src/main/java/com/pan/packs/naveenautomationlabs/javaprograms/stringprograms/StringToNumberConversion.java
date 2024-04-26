package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

// Convert String to Number without using parseInt() function
public class StringToNumberConversion {

    public static void main(String[] args) {
        String s ="123";
        //System.out.println(Integer.parseInt(s));

        int number =0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>=48 && s.charAt(i)<=57) {
                number = number * 10 + (int)s.charAt(i)-48;
            }
        }
        System.out.println(number);

    }
}

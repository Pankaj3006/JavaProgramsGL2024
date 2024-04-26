package com.pan.packs.numberprograms;

// Starting from the left side of an integer, adjacent digits pair up in "battle" and the
// larger digit wins. If two digits are the same, they both lose. A lone digit automatically wins.

//Create a function that returns the victorious digits.

public class DigitsBattle {

    public static void main(String[] args) {
        System.out.println(battleOutcome(578921445));
    }

    public static int battleOutcome(int num) {
        String outputString = "";

        String str = String.valueOf(num);
        for(int i=1; i<str.length(); i=i+2) {
            if(str.charAt(i)-str.charAt(i-1)>0)
                outputString += str.charAt(i);
            else if(str.charAt(i)-str.charAt(i-1)<0)
                outputString += str.charAt(i-1);
        }
        if(str.length() %2 == 0)
            return Integer.parseInt(outputString);
        else
            return Integer.parseInt(outputString + str.charAt(str.length()-1));

    }
}

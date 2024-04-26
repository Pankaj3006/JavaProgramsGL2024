package com.pan.packs.edabit;

//A number may not be a palindrome, but its descendant can be. A number's direct child is created
// by summing each pair of adjacent digits to create the digits of the next number.

//For instance, 123312 is not a palindrome, but its next child 363 is, where: 3 = 1 + 2; 6 = 3 + 3;
// 3 = 1 + 2.

//Create a function that returns true if the number itself is a palindrome or any of its descendants
// down to the first 2 digit number (a 1-digit number is trivially a palindrome).

public class PalindromeDescendant {

    public static void main(String[] args) {

        int num = 23336014;

        if(checkPalindrome(num))
            System.out.println(true);
        else {
            int descendant = createDescendantNumber(num);
            while(descendant>10) {
                System.out.println(descendant);
                boolean flag = checkPalindrome(descendant);
                System.out.println(flag);
                if(flag) {
                    break;
                }
                descendant = createDescendantNumber(descendant);
            }
        }
    }

    static int createDescendantNumber(int n) {

        String str = String.valueOf(n);
        String finalString = "";

        for(int i=0; i<str.length(); i=i+2) {

            String twoDigits = str.substring(i, i+2);

            int sum = Integer.parseInt(twoDigits.substring(0,1))+Integer.parseInt(twoDigits.substring(1));
            finalString = finalString + sum;
        }

        return Integer.parseInt(finalString);
    }

    static boolean checkPalindrome(int a) {

        boolean flag;
        if(a<10) {
            return true;
        }

        int temp = a;
        int result = 0;

        while(a>0) {
            int digit = a % 10;

            result = result * 10 + digit;
            a = a/10;
        }

        if(temp==result)
            flag = true;
        else
            flag = false;

        return flag;
    }
}

package com.pan.packs.edabit;

// Given a number, insert duplicate digits on both sides of all digits which appear in a group
// of one.
// All tests will include positive integers only.

public class LonelyNumbers {

    public static void main(String[] args) {
        System.out.println(numbersNeedFriendsToo(22733)); //2277733
        System.out.println(numbersNeedFriendsToo(4666));  // 444666
        System.out.println(numbersNeedFriendsToo(544));   // 55544
        System.out.println(numbersNeedFriendsToo(123));   // 111222333
        System.out.println(numbersNeedFriendsToo(56657)); // 55566555777
        System.out.println(numbersNeedFriendsToo(33));    // 33
    }
    public static long numbersNeedFriendsToo(int n) {
        String str = " " + n + " ";
        String finalString = "";

        for(int i=1; i<str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(i-1) && str.charAt(i) != str.charAt(i+1)) {
             finalString += repeatCharacter(str.charAt(i));
            } else {
                finalString += str.charAt(i);
            }
        }
        long a = Long.parseLong(finalString);
        return a;
    }

    private static String repeatCharacter(char ch) {
        int n=3;
        String s = "";
        while(n>0) {
            s += ch;
            n--;
        }

        return s;
    }
}

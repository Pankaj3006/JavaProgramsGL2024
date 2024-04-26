package com.pan.practice;

import java.util.*;

public class SortString {

    public static void main(String[] args) {
        String str = "10010101101110101001";

        System.out.println(method1(str));
        System.out.println(method2(str));
    }

    private static String method1(String s) {

        String zeroString = "";
        String oneString = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0')
                zeroString += s.charAt(i);
            else
                oneString += s.charAt(i);
        }
        return zeroString + oneString;
    }

    private static String method2(String s) {

        Map<Character, Integer> map = new TreeMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }

        System.out.println(map);

        String finalString = "";

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            finalString += repeatCharacter(entry.getKey(), entry.getValue());
        }

        return finalString;
    }

    private static String repeatCharacter(char c, int num) {

        String str = "";
        for(int i=1; i<=num; i++) {
            str += c;
        }

        return str;

    }
}

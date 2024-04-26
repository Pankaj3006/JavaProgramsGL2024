package com.pan.practice;

public class FindCommonSubString {

    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Friday", "Tueday"};
        String commonPart = "";
        int length = days[0].length();

        for(int i=0; i<length; i++) {
            char ch = days[0].charAt(i);
            int count = 0;
            for(int j=1; j< days.length; j++) {
                if(days[j].charAt(i) == ch) {
                    count++;
                }
                if(count== days.length-1)
                    commonPart += ch;
            }
        }

        System.out.println(commonPart);
    }
}

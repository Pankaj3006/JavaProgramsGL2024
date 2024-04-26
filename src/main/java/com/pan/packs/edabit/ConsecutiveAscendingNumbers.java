package com.pan.packs.edabit;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveAscendingNumbers {

    public static void main(String[] args) {
        System.out.println(ascending("666667"));
    }

    public static boolean ascending(String str) {

        boolean flag = false;
        for(int i=2; i<=str.length()/2; i++) {
            List<String> list = createGroups(str, i);
            if(checkForConsecutiveNumbers(list)) {
                System.out.println(list);
                flag = true;
                break;
            }
            else {
                System.out.println(list);
            }
        }

        return flag;
    }

    static List<String> createGroups(String str, int n) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i=i+n) {
            if(i+n<str.length())
                list.add(str.substring(i, i+n));
            else
                list.add(str.substring(i,str.length()));

        }

        return list;
    }

    static boolean checkForConsecutiveNumbers(List li) {

        boolean flag = true;

        for(int i=0; i<li.size()-1; i++) {
            Integer secondNumber = Integer.parseInt((String)li.get(i+1));
            Integer firstNumber = Integer.parseInt((String)li.get(i));
            if(secondNumber-firstNumber!=1) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}

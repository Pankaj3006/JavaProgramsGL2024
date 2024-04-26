package com.pan.packs.edabit.stringprograms;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortByLength {

    public static void main(String[] args) {
        String inputString = "Hello my friend am t Ma";
        String[] each_word = inputString.split(" ");

        System.out.println(sort(each_word));
    }

    static String sort(String[] arr) {
        TreeSet t = new TreeSet(new MyComparator());

        for(int i=0; i<arr.length; i++) {
            t.add(arr[i].toLowerCase());
        }

        String OutputString = "";

        Iterator iterator = t.iterator();
        while(iterator.hasNext()) {
            OutputString += iterator.next() + " ";
        }

        return OutputString.trim();
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        if(s1.length()>s2.length())
            return +1;
        else if(s1.length() < s2.length())
            return -1;
        else
            return s1.compareTo(s2);
    }
}

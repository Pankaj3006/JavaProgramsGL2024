package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

import java.util.ArrayList;
import java.util.List;

public class CountOfWordsFromCapitalizedString {

    public static void main(String[] args) {
        String str = "PankajGuptaHdfcIciciBankJava";
        List<Integer> list = new ArrayList<>();

        int count =0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) >='A' && str.charAt(i)<= 'Z') {
                count++;
                list.add(i);
            }
        }
        System.out.println("Number of words are: " + count);

        for(int i=0; i<list.size(); i++) {
            if(i != list.size()-1)
                System.out.println(str.substring(list.get(i), list.get(i+1)));
            else
                System.out.println(str.substring(list.get(i), str.length()));
        }
    }
}

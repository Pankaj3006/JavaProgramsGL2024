package com.pan.interview;

public class OrderValue {

    public static void main(String[] args) {

        String str = "Your Order value is $32";

        String[] strings = str.split("\\$");

        if(Math.floor(Double.parseDouble(strings[1]))-Math.ceil(Double.parseDouble(strings[1])) == 0) {
            System.out.println(Integer.parseInt(strings[1]));
        }
        else {
            System.out.println(Double.parseDouble(strings[1]));
        }
    }
}

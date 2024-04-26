package com.pan.packs.stringconceptprograms;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class GetClassMethod {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        Class c = l.get(0).getClass();
        System.out.println(c.getName());
        Method[] m = c.getDeclaredMethods();
        for(Method m1 : m)
        {
            System.out.println(m1.getName());
        }
    }
}

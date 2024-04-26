package com.pan.packs.collectionprograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0; i<=10; i++) {
            v.add(i);
        }
        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            int p = (int)e.nextElement();
            if(p %2 == 0)
                System.out.println(p);
        }
    }
}

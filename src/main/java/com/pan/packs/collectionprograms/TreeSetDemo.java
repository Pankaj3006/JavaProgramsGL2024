package com.pan.packs.collectionprograms;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        return -i1.compareTo(i2);
    }
}

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet s = new TreeSet(new MyComparator());
        s.add(100);
        s.add(101);
        s.add(120);
        s.add(104);
        s.add(106);
        s.add(107);
        s.add(110);
        s.add(118);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet(104));
        System.out.println(s.tailSet(110));
        System.out.println(s.subSet(110, 100));
        System.out.println(s.comparator());
    }
}

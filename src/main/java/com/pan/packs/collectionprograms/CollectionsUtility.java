package com.pan.packs.collectionprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CollectionsUtility {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("L");
        list.add("Z");
        list.add("K");
        list.add("a");
        Collections.sort(list);
        //System.out.println(Collections.binarySearch(l, "Z"));

        Integer[] a = {2, 3};
        List l = Arrays.asList(a);
        l.set(0,4);
        System.out.println(l);
        System.out.println(l.size());
    }
}

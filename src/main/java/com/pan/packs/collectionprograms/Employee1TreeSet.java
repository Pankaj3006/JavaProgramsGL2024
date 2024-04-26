package com.pan.packs.collectionprograms;

// Write a program to insert employee objects into the TreeSet where default natural sorting order is
// ascending order of their ids.
// Write a comparator class to define Customized sorting which is alphabetical order of employee names.

import java.util.Comparator;
import java.util.TreeSet;

class Employee1 implements Comparable {

    String name;
    int id;

    Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " --> " + id;
    }

    @Override
    public int compareTo(Object o) {
        int eid1= this.id;
        Employee1 e = (Employee1) o;
        int eid2 = e.id;
        if(eid1 > eid2)
            return +1;
        else if(eid1 < eid2)
            return -1;
        else
            return 0;
    }
}

public class Employee1TreeSet {

    public static void main(String[] args) {
        TreeSet<Employee1> treeSet = new TreeSet<>();
        treeSet.add(new Employee1("Pankaj", 101));
        treeSet.add(new Employee1("Divyank", 105));
        treeSet.add(new Employee1("Priya", 110));
        treeSet.add(new Employee1("Gunjan", 107));
        treeSet.add(new Employee1("Parekh", 104));
        treeSet.add(new Employee1("Suman", 110));
        treeSet.add(new Employee1("Sujeet", 120));
        System.out.println(treeSet);
        TreeSet<Employee1> treeSet1 = new TreeSet<>(new MyComparator1());
        treeSet1.add(new Employee1("Pankaj", 101));
        treeSet1.add(new Employee1("Divyank", 105));
        treeSet1.add(new Employee1("Priya", 110));
        treeSet1.add(new Employee1("Gunjan", 107));
        treeSet1.add(new Employee1("Parekh", 104));
        treeSet1.add(new Employee1("Suman", 110));
        treeSet1.add(new Employee1("Sujeet", 120));
        System.out.println(treeSet1);
    }
}

class MyComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee1 e1 = (Employee1) o1;
        Employee1 e2 = (Employee1) o2;
        return e1.name.compareTo(e2.name);
    }
}

package com.pan.packs.collectionprograms;

// Write a program to insert employee objects into the TreeSet where default natural sorting order is
// ascending order of their salaries. if two employees have same salaries then consider alphabetical
// orders of their names.
// Write a comparator class to define Customized sorting which is alphabetical order of employee names.
// if two employees having the same name then consider descending order of their age.

import java.util.Comparator;
import java.util.TreeSet;

class Employee2 implements Comparable {

    String name;
    long salary;
    int age;

    Employee2(String name, long salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " --> " + salary + " --> " + age;
    }

    @Override
    public int compareTo(Object o) {
        long sal1 = this.salary;
        String name1 = this.name;
        Employee2 e = (Employee2) o;
        long sal2 = e.salary;
        String name2 = e.name;
        if(sal1 > sal2)
            return +1;
        else if(sal1 < sal2)
            return -1;
        else
            return name1.compareTo(name2);
    }
}

public class Employee2TreeSet {

    public static void main(String[] args) {
        TreeSet<Employee2> treeSet = new TreeSet<>();
        treeSet.add(new Employee2("Pankaj", 120000l, 34));
        treeSet.add(new Employee2("Divyank", 100000l, 5));
        treeSet.add(new Employee2("Priya", 11000l, 24));
        treeSet.add(new Employee2("Gunjan", 11000l, 27));
        treeSet.add(new Employee2("Parekh", 14000l, 30));
        treeSet.add(new Employee2("Suman", 20000l, 56));
        treeSet.add(new Employee2("Sujeet", 50000l, 87));
        System.out.println(treeSet);
        TreeSet<Employee2> treeSet1 = new TreeSet<>(new MyComparator2());
        treeSet1.add(new Employee2("Pankaj", 120000l, 34));
        treeSet1.add(new Employee2("Divyank", 100000l, 5));
        treeSet1.add(new Employee2("Priya", 11000l, 24));
        treeSet1.add(new Employee2("Gunjan", 11000l, 27));
        treeSet1.add(new Employee2("Priya", 14000l, 30));
        treeSet1.add(new Employee2("Suman", 20000l, 56));
        treeSet1.add(new Employee2("Sujeet", 50000l, 87));
        System.out.println(treeSet1);
    }
}

class MyComparator2 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee2 e1 = (Employee2) o1;
        Employee2 e2 = (Employee2) o2;
        Integer age1 = e1.age;
        Integer age2 = e2.age;
        if(e1.name.equals(e2.name))
            return -age1.compareTo(age2);
        else
            return e1.name.compareTo(e2.name);
    }
}

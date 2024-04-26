package com.pan.packs.naveenautomationlabs.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentWithHighestMarks {

    public static void main(String[] args) {
        Student s1 = new Student("Pankaj", 98);
        Student s2 = new Student("Pradeep", 88);
        Student s3 = new Student("Ram", 78);
        Student s4 = new Student("Ravi", 70);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        Integer highestMarks = list.stream().map(e->e.getMarks()).max((a,b)->a.compareTo(b)).get();

        list.stream().filter(e->e.getMarks()==highestMarks).forEach(e-> System.out.println(e.getName()));
    }
}

package com.pan.packs.java8programs.streamprograms.mapprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    char grade;
    double percentage;

    Student(String name, char grade, double percentage) {
        this.name = name;
        this.grade = grade;
        this.percentage = percentage;
    }
}

public class FlatMapDemo {

    public static void main(String[] args) {
        List<Student> listA = new ArrayList<>();
        listA.add(new Student("John", 'A', 0.9));
        listA.add(new Student("Peter", 'A', 0.95));
        listA.add(new Student("Alex", 'A', 0.96));

        List<Student> listB = new ArrayList<>();
        listB.add(new Student("Hales", 'B', 0.8));
        listB.add(new Student("Tony", 'B', 0.85));
        listB.add(new Student("Sony", 'B', 0.88));

        List<Student> listC = new ArrayList<>();
        listC.add(new Student("Scott", 'C', 0.7));
        listC.add(new Student("Sean", 'C', 0.74));
        listC.add(new Student("David", 'C', 0.72));

        List<List<Student>> list = Arrays.asList(listA, listB, listC);
        List<Double> allGrades = list.stream().flatMap(e->e.stream()).map(e->e.percentage).collect(Collectors.toList());
        Double averagePercentage = allGrades.stream().reduce(0.0,(a,b)->a+b)/9;
        list.stream().flatMap(e->e.stream()).filter(e->e.percentage>averagePercentage).map(e->e.name).forEach(System.out::println);
        System.out.println(averagePercentage);
    }
}

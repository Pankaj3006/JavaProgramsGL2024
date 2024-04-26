package com.pan.packs.java8programs.streamprograms.mapprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
     int id;
     String name;
     double salary;

     Employee(int id, String name, double salary) {
         this.id=id;
         this.name=name;
         this.salary=salary;
     }
}

public class FilterAndMapDemo2 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", 25000));
        list.add(new Employee(2, "Alex", 22000));
        list.add(new Employee(3, "Hales", 28000));
        list.add(new Employee(4, "Peter", 35000));
        list.add(new Employee(5, "Scott", 32000));

        List<String> finalList =
                list.stream().filter(e->e.salary>25000).map(e->e.name).collect(Collectors.toList());

        System.out.println(finalList);
    }
}

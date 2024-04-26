package com.pan.packs.jsonprograms;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

public class JSONReaderUsingGson {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/employee.json");

        Person person = gson.fromJson(fileReader, Person.class);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        person.getMails().forEach(System.out::println);
        person.getAddress().forEach(k-> System.out.println(k));
        person.getAddress().forEach(k-> System.out.println(k.getFloor()+":"+k.getCity()+":"+k.getPinCode()));
        System.out.println("+++++++++++++++++++++++++");
        person.getMails().stream().filter(k -> k.contains("gmail")).map(k -> k.toUpperCase())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}

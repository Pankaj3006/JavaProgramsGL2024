package com.pan.packs.jsonprograms;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class JSONReaderUsingJackson {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/employee.json");

        Person person = objectMapper.readValue(fileReader, Person.class);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getMails());

        for(Address address: person.getAddress()) {
            System.out.println(address);
        }

    }
}

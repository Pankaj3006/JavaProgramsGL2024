package com.pan.packs.jsonprograms;

import java.util.List;

public class Person {

    String firstName;
    String lastName;
    List<String> mails;
    List<Address> address;
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getMails() {
        return mails;
    }

    public List<Address> getAddress() {
        return address;
    }
}

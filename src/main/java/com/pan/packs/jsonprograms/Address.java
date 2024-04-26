package com.pan.packs.jsonprograms;

public class Address {

    String city;
    int pinCode;
    String floor;

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return getCity()+":"+getPinCode()+" On "+getFloor();
    }

}

package com.bridgelabz;

public class Contact {

    String name, address, city, state, email;
    long phoneNumber, zipCode;

    public Contact(String name, String address, String city, String state, String email , long phoneNumber, long zipcode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipcode;
    }
}
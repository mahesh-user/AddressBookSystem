package com.bridgelabz;

public class AdressBook {
    String name,address,city,state,email;
    String phoneNumber,zipCode;

     public  AdressBook(String a, String b , String c, String d, String e , String f, String g ) {

        this.name = a;
        this.address = b;
        this.city = c;
        this.state = d;
        this.email = e;
        this.phoneNumber = f;
        this.zipCode = g;
         System.out.println(name);
         System.out.println(address);
         System.out.println(city);
         System.out.println(state);
         System.out.println(email);
         System.out.println(phoneNumber);
         System.out.println(zipCode);
    }

}




package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {
    ArrayList<Contact> list = new ArrayList<>();
    public void add(){
        System.out.println("cont man------");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.next();
        String city = sc.next();
        String state = sc.next();
        String email = sc.next();
        long phoneNumber = sc.nextLong();
        long zipCode = sc.nextLong();
        Contact contact = new Contact(name,address,city,state,email,phoneNumber,zipCode);
        list.add(contact);
        System.out.println("add-------------");
    }
    public void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" edit the addressbook");
        String name1 = scanner.next();

        for (int i=0;i< list.size();i++){
            if ((list.get(i).name).equals(name1)){
                list.get(i).phoneNumber = 93758723;
                list.get(i).address = "agjishg";
                list.get(i).city = "ahfaj";
                System.out.println("address");
                System.out.println("phonenumber");
                System.out.println("city");

            }
        }

    }
}
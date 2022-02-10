package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {
    ArrayList<Contact> list = new ArrayList<Contact>();

    public void add() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.next();
        String city = sc.next();
        String state = sc.next();
        String email = sc.next();
        long phoneNumber = sc.nextLong();
        long zipCode = sc.nextLong();
        Contact contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
        list.add(contact);
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).name).equals(name1)) {
                list.get(i).phoneNumber = 93758723;
                list.get(i).address = "agjishg";
                list.get(i).city = "ahfaj";
            }
        }

    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).name).equals(name1)) {
                list.remove(i);
            }
        }
        for (Contact i:list) {
            System.out.println(i.name);
        }
    }
}
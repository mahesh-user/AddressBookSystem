package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {
    Scanner sc = new Scanner(System.in);
    Contact contact;

    public void addingContact(){

        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the address");
        String address = sc.next();
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the emailId");
        String email = sc.next();
        System.out.println("Enter the Phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the zipcode");
        long zipCode = sc.nextLong();
        contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
    }

    /**
     * this method is to edit the existing contact
     */
    public void editingContact() {
        System.out.println("Enter the Name of contact to Edit");
        String name1 = sc.next();
        if (contact.name.equals (name1)) {
            System.out.println("\n1 : Change the name");
            System.out.println("2 : Change the address");
            System.out.println("3 : Change the city");
            System.out.println("4 : Change the state");
            System.out.println("5 : Change the emailId");
            System.out.println("6 : Change the Phone number");
            System.out.println("7 : Change the zipcode");
            System.out.println("0 : Exit");
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    System.out.println("Enter new Name");
                    contact.name = sc.next();
                    break;
                }
                case 2: {
                    System.out.println("Enter new address");
                    contact.address = sc.next();
                    break;
                }
                case 3: {
                    System.out.println("Enter the new city");
                    contact.city = sc.next();
                    break;
                }
                case 4: {
                    System.out.println("Enter the new state");
                    contact.state = sc.next();
                    break;
                }
                case 5: {
                    System.out.println("Enter the new email");
                    contact.email = sc.next();
                    break;
                }
                case 6: {
                    System.out.println("Enter the new phoneNumber");
                    contact.phoneNumber = sc.nextLong();
                    break;
                }
                case 7: {
                    System.out.println("Enter the new Zipcode");
                    contact.zipCode = sc.nextLong();
                    break;
                }
                default:
                    break;
            }
            System.out.println("After Editing the contact");
            System.out.println(contact.name + " " +contact.state + " " + contact.address + " " +contact.city + " " + contact.email + " " +contact.phoneNumber + " " + contact.zipCode);
        }
    }

}
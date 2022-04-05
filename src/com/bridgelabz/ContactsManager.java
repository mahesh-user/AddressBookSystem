package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//purpose:This class is to manage the contacts and adress book

//auther:mahesh
public class ContactsManager {
    Scanner sc = new Scanner(System.in);
    Map<String,Contact> contactsList = new HashMap<>();
    Contact contact;

    /**
     * this method is to add the contact
     */
    public void addingContact(){
        System.out.println("Enter the name");
        String name = sc.next();
        if (contactsList.containsKey(name)){
            System.out.println("Contact already exists");
            System.out.println("It will just update the existing details");
        }
        System.out.println("Enter the address");
        String address = sc.next();
        System.out.println("Enter the city");
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
        contactsList.put(contact.name, contact);
    }

    /**
     * this method is to edit the existing contact
     */


    public void editingContact() {
        System.out.println("Enter the Name of contact to Edit");
        String name1 = sc.next();
        if (contactsList.containsKey(name1)) {
            Contact editContact = contactsList.get(name1);
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
                    editContact.name = sc.next();
                    break;
                }
                case 2: {
                    System.out.println("Enter new address");
                    editContact.address = sc.next();
                    break;
                }
                case 3: {
                    System.out.println("Enter the new city");
                    editContact.city = sc.next();
                    break;
                }
                case 4: {
                    System.out.println("Enter the new state");
                    editContact.state = sc.next();
                    break;
                }
                case 5: {
                    System.out.println("Enter the new email");
                    editContact.email = sc.next();
                    break;
                }
                case 6: {
                    System.out.println("Enter the new phoneNumber");
                    editContact.phoneNumber = sc.nextLong();
                    break;
                }
                case 7: {
                    System.out.println("Enter the new Zipcode");
                    editContact.zipCode = sc.nextLong();
                    break;
                }
                default:
                    break;
            }
            System.out.println("After Editing the contact");
            System.out.println(editContact.name + " " + editContact.state + " " + editContact.address + " "
                    + editContact.city + " " + editContact.email + " " + editContact.phoneNumber +
                    " " + editContact.zipCode);
        }
    }

    /**
     * this method is delete contacts in  contact
     */
    public void deleteContact(){
        System.out.println("Enter the name that you want to delete");
        String name2 = sc.next();
        if (contactsList.containsKey(name2)){
            contactsList.remove(name2);
        }

    }
    public void printContactsList(){
        System.out.println(contactsList);
    }
}
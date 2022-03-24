package com.bridgelabz;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MultipleAddressBook {
    Map<String, ContactsManager> multipleAddressBook = new HashMap<String, ContactsManager>();
    Scanner sc = new Scanner(System.in);

    public void addingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();

        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            ContactsManager addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.addingContact();
            //after adding we will put that again in the multiple address book
            multipleAddressBook.put(abName, addressBook);
        }
        //if given is not there in the book
        else {
            //create a new addressBook
            ContactsManager addressBook = new ContactsManager();
            //add the contact
            addressBook.addingContact();
            //put that address book in to the multipleAddressBook
            multipleAddressBook.put(abName, addressBook);
        }
    }

    public void editingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        //assigning the user input to the abName to check whether its in the book
        String abName = sc.next();
        //if given name is present in the multipleAddressBook it will add the contact in that addressbook
        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            ContactsManager addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.editingContact();
            //after adding we will put that again in the multiple address book
            multipleAddressBook.put(abName, addressBook);
        }
        //if given is not there in the book
        else {
            System.out.println("Entered name doesn't exist");
        }
    }
    public void deleteContactInAddressBook(){
        System.out.println("Enter the AddressBook Name");
        //assigning the user input to the abName to check whether its in the book
        String abName = sc.next();
        //if given name is present in the multipleAddressBook it will add the contact in that addressbook
        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            ContactsManager addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.deleteContact();
        }
    }
}

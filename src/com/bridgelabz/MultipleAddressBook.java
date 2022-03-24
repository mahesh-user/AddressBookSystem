package com.bridgelabz;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MultipleAddressBook {
    Map<String, ContactsManager> multipleAddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void addingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.addingContact();
            multipleAddressBook.put(abName, addressBook);
        }
        else {
            ContactsManager addressBook = new ContactsManager();
            addressBook.addingContact();
            multipleAddressBook.put(abName, addressBook);
        }
    }

    public void editingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.editingContact();
            multipleAddressBook.put(abName, addressBook);
        }
        else {
            System.out.println("Entered name doesn't exist");
        }
    }
    public void deleteContactInAddressBook(){
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.deleteContact();
        }
    }

}

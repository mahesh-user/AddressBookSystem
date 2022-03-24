package com.bridgelabz;
import java.util.*;

public class MultipleAddressBook {
    Map<String, ContactsManager> multipleAddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    List<Contact> cityList = new ArrayList<>();
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

    public void searchContactUsingCity(){
        ContactsManager addressBook = new ContactsManager();
        System.out.println("Enter the name of the city that want to search");
        String searchCity = sc.next();
        multipleAddressBook.forEach((k,v) -> {
            v.contactsList.forEach((x,y) -> {
                if (y.city.equals(searchCity)){
                    Contact searchResult = y;
                    System.out.println(searchResult.toString());
                }
            });
        });
    }
    public int countOfContactsByCity(){
        int count = cityList.size();
        return count;
    }

}

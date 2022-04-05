package com.bridgelabz;
import java.util.*;
//purpose:This class is to manage the contacts and adress book

//auther:mahesh
public class MultipleAddressBook {
    Map<String, ContactsManager> multipleAddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    List<Contact> cityList = new ArrayList<>();

    /**
     * this method is to add addressBook to the multipleAddressBook
     */

    public void addingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.addingContact();
            multipleAddressBook.put(abName, addressBook);
        } else {
            ContactsManager addressBook = new ContactsManager();
            addressBook.addingContact();
            multipleAddressBook.put(abName, addressBook);
        }
    }

    /**
     * this method is to edit addressBook to the multipleAddressBook
     */

    public void editingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.editingContact();
            multipleAddressBook.put(abName, addressBook);
        } else {
            System.out.println("Entered name doesn't exist");
        }
    }

    /**
     * this method is to delete contact in addressBook to the multipleAddressBook
     */
    public void deleteContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String abName = sc.next();
        if (multipleAddressBook.containsKey(abName)) {
            ContactsManager addressBook = multipleAddressBook.get(abName);
            addressBook.deleteContact();
        }
    }

    /**
     * this method is to search city in addressBook to the multipleAddressBook
     */
    public void searchContactUsingCity() {
        ContactsManager addressBook = new ContactsManager();
        System.out.println("Enter the name of the city that want to search");
        String searchCity = sc.next();
        multipleAddressBook.forEach((k, v) -> {
            v.contactsList.forEach((x, y) -> {
                if (y.city.equals(searchCity)) {
                    Contact searchResult = y;
                    System.out.println(searchResult.toString());
                }
            });
        });
    }

    /**
     * this method is to search state in addressBook to the multipleAddressBook
     */
    public void searchContactUsingState() {
        ContactsManager addressBook = new ContactsManager();
        System.out.println("Enter the name of the city that want to search");
        String searchCity = sc.next();
        multipleAddressBook.forEach((k, v) -> {
            v.contactsList.forEach((x, y) -> {
                if (y.state.equals(searchCity)) {
                    Contact searchResult = y;
                    System.out.println(searchResult.toString());
                }
            });
        });
    }
    /**
     * this method is to count of city in addressBook to the multipleAddressBook
     */

    public int countOfContactsByCity() {
        System.out.println("Enter the name of the city that want to search");
        String searchCity = sc.next();
        multipleAddressBook.forEach((k, v) -> {
            v.contactsList.forEach((x, y) -> {
                if (y.city.equals(searchCity)) {
                    cityList.add(y);
                }

            });
        });
        int count = cityList.size();
        System.out.println(count);
        return count;
    }
}

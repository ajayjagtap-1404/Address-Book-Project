package AddressBooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AddressBookMain {

    static HashMap<String, AddressBook> hashMap = new HashMap<String, AddressBook>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();

        AddressBook addressBookObj = new AddressBook();
        System.out.println("Welcome to AddressBook Program :");
        System.out.println();
        boolean repeat = true;
        while (repeat) {
            System.out.println("Please select any number from the below Main Menu");
            System.out.println("1. Add AddressBook \n2. View AddressBook \n3. Exit from the Address Book program");
            int selection = addressBookMain.scanner.nextInt();
            switch (selection) {
                case 1: {
                    System.out.println("Please enter the Name of the AddressBook");
                    String addressBookName = addressBookMain.scanner.next();
                    System.out.println(addressBookName);
                    hashMap.put(addressBookName, addressBookObj);
                    for (Map.Entry<String, AddressBook> m : hashMap.entrySet()) {
                        System.out.println(m.getKey() + " is Address book Elements are " + m.getValue().contactsArrayList);
                    }
                    addressBookObj.addContacts(addressBookName, addressBookObj);
                }
                case 2: {
                    for (Map.Entry<String, AddressBook> m : hashMap.entrySet()) {
                        System.out.println(m.getKey() + " Elements are" + m.getValue().contactsArrayList);
                    }
                }
                break;
                case 3: {
                    System.out.println("Thank you for using Address Book");
                }
                break;
                default:
                    repeat = false;


            }


        }

    }
}
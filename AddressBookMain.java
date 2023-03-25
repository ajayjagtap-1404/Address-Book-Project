package AddressBooks;

import java.security.KeyStore;
import java.util.*;


public class AddressBookMain {
    // key -> bookName , value -> contact class
    HashMap<String, List<Contacts>> hashMap = new HashMap<>();
    AddressBook addressBook = new AddressBook();
    Scanner scanner = new Scanner(System.in);
    static public final int ADD_ADDRESS_BOOK = 1;
    static public final int VIEW_ADDRESS_BOOK = 2;
    static public final int EXIT_FROM_ADDRESS_BOOK = 3;


    public static void main(String[] args) {
        System.out.println(" Welcome to AddressBook Program : ");
        Scanner scanner = new Scanner(System.in);
        List<Contacts> contactsArrayList = new ArrayList<>();
        AddressBookMain addressBookMain = new AddressBookMain();


        boolean repeat = true;
        while (repeat) {
            System.out.println("Please select any number from the below Main Menu");

            System.out.println("1. Add AddressBook \n2. View AddressBook \n3. Exit from the Address Book program ");
            // take user choice for work on addressBook.

            int choice = scanner.nextInt();
            switch (choice) {
                case ADD_ADDRESS_BOOK:
                    addressBookMain.createAddressBook(contactsArrayList);

                    System.out.println("----------------------------------------------------------");
                    break;
                case VIEW_ADDRESS_BOOK:
                    System.out.println("Enter key ");
                    String key = scanner.next();
                    for (Map.Entry<String, List<Contacts>> m : addressBookMain.hashMap.entrySet()) {
                        if (addressBookMain.hashMap.containsKey(key)) {
                            System.out.println(m.getKey() + " Elements are" + m.getValue());
                        }
                    }
                    System.out.println("----------------------------------------------------------");
                    break;
                case EXIT_FROM_ADDRESS_BOOK: {
                    System.out.println("Thank you for using Address Book");
                    repeat = false;
                }
                System.out.println("----------------------------------------------------------");
                break;

                default:
                    System.out.println("Pleas Enter valid input ...");

                    break;

            }


        }

    }

    public void createAddressBook(List<Contacts> contactsArrayList) {
        System.out.println("Enter Address book name ");
        String bookName = scanner.next();
        if (!hashMap.containsKey(bookName)) {
            hashMap.put(bookName, contactsArrayList);
            addressBook.contactList(contactsArrayList);
        } else {
            System.out.println("Enter AddressBook name is available .... ");
        }


    }

}

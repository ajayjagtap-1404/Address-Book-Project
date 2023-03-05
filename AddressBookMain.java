package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    int noOfContact;

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to AddressBook Program :");
        System.out.println();
        boolean repeat = true;
        while (repeat) {
            System.out.println("Enter any option : ");
            System.out.println(" 1. add for Contact: \n 2. edit for Contact: \n 3. delete for Contact: \n 4. print for Contact: \n 5. exit:");
            int menu = addressBookMain.scanner.nextInt();
            final int addContact = 1, editContact = 2, deleteContact = 3, printContact = 4, exitProgram = 5;

            switch (menu) {
                case addContact:
                    addressBookMain.addContacts();
                    addressBookMain.printDetails();
                    break;
                case editContact:
                    addressBookMain.editContact();
                    addressBookMain.printDetails();
                    break;
                case deleteContact:
                    addressBookMain.deleteContact();
                    addressBookMain.printDetails();
                    break;
                case printContact:
                    addressBookMain.printDetails();
                    break;
                case exitProgram:
                    repeat = false;
                    System.out.println(" Thank you for visiting :");
                    break;
                default:
                    System.out.println("Please enter valid input ....");
                    break;
            }

        }


    }


    private void addContacts() {
        System.out.println("Enter how many contact you want to save :");
        noOfContact = scanner.nextInt();
        for (int i = 0; i < noOfContact; i++) {
            Contacts contacts = new Contacts();
            System.out.println("Enter person " + (i + 1) + " First name :");
            contacts.firstName = scanner.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " Last  name :");
            contacts.lastName = scanner.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " Address :");
            contacts.address = scanner.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " City Name :");
            contacts.city = scanner.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " State Name :");
            contacts.state = scanner.next().toUpperCase();
            System.out.println("Enter person " + (i + 1) + " zip Code :");
            contacts.zip = scanner.nextInt();
            System.out.println("Enter person " + (i + 1) + " Phone Number :");
            contacts.phoneNumber = scanner.nextLong();
            contactsArrayList.add(contacts);

        }
    }

    public void editContact() {
        for (int i = 0; i < contactsArrayList.size(); i++) {
            boolean repeat = true;
            while (repeat) {
                System.out.println("Which data you want to edit :");
                System.out.println("1. First name\n 2. Last name:\n 3. Address \n 4. city \n 5. State \n 6. zip code \n 7. PhoneNumber \n 8. exit  ");
                final int firstName = 1, lastName = 2, address = 3, city = 4, state = 5, zipCode = 6, phoneNumber = 7, exit = 8;
                int choice = scanner.nextInt();
                switch (choice) {
                    case firstName:
                        System.out.println("Enter old first  name to update :");
                        String editFirstname = scanner.next();
                        if (editFirstname.equalsIgnoreCase(contactsArrayList.get(i).firstName)) {
                            System.out.println("Enter new first name for update :");
                            String newFirstName = scanner.next().toUpperCase();
                            contactsArrayList.get(i).firstName = newFirstName;
                            System.out.println("Update successfully :");
                            System.out.println("New name update as  : " + editFirstname + " to " + newFirstName);
                        }
                        break;
                    case lastName:
                        System.out.println("Enter old Last name to update :");
                        String editLastName = scanner.next().toUpperCase();
                        if (editLastName.equalsIgnoreCase(contactsArrayList.get(i).lastName)) {
                            System.out.println("Enter new last name for update :");
                            String newLastName = scanner.next().toUpperCase();
                            contactsArrayList.get(i).lastName = newLastName;
                            System.out.println("Update successfully :");
                        }
                        break;
                    case address:
                        System.out.println("Enter old Address to update :");
                        String editAddress = scanner.next();
                        if (editAddress.equalsIgnoreCase(contactsArrayList.get(i).address)) {
                            System.out.println("Enter new address for update :");
                            String newAddress = scanner.next();
                            contactsArrayList.get(i).address = newAddress;
                            System.out.println("Update successfully :");
                        }
                        break;
                    case city:
                        System.out.println("Enter old city name to update :");
                        String editCityName = scanner.next();
                        if (editCityName.equalsIgnoreCase(contactsArrayList.get(i).city)) {
                            System.out.println("Enter new city name for update :");
                            String newCityName = scanner.next();
                            contactsArrayList.get(i).city = newCityName;
                            System.out.println("Update successfully :");
                        }
                        break;
                    case state:
                        System.out.println("Enter old state name to update :");
                        String editStateName = scanner.next();
                        if (editStateName.equalsIgnoreCase(contactsArrayList.get(i).state)) {
                            System.out.println("Enter new state  name for update :");
                            String newStateName = scanner.next();
                            contactsArrayList.get(i).firstName = newStateName;
                            System.out.println("Update successfully :");
                        }
                        break;
                    case zipCode:
                        System.out.println("Enter old zip code to update :");
                        int editZipCode = scanner.nextInt();
                        if (editZipCode == contactsArrayList.get(i).zip) {
                            System.out.println("Enter new zip code for update : ");
                            int newZipCode = scanner.nextInt();
                            contactsArrayList.get(i).zip = newZipCode;
                            System.out.println("Update successfully :");

                        }
                        break;
                    case phoneNumber:
                        System.out.println("Enter old phone number to update :");
                        int editPhoneNum = scanner.nextInt();
                        if (editPhoneNum == contactsArrayList.get(i).phoneNumber) {
                            System.out.println("Enter new zip code for update : ");
                            int newPhoneNUm = scanner.nextInt();
                            contactsArrayList.get(i).phoneNumber = newPhoneNUm;
                            System.out.println("Update successfully :");
                        }
                        break;
                    case exit:
                        repeat = false;
                        break;
                    default:
                        System.out.println("Invalid input try again..... ");
                        break;

                }
            }
        }
    }


    public void deleteContact() {
        System.out.println("enter first  name of person  which you want to delete  ");
        String name = scanner.next();
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (name.equalsIgnoreCase(contactsArrayList.get(i).firstName)) {
                contactsArrayList.remove(i);

                System.out.println("Delete successfully : " + name + " name  contact details ");
            }
        }

    }


    public void printDetails() {
        System.out.println("Contact Details:");
        for (Contacts info : contactsArrayList) {
            System.out.println(info.firstName + " " + info.lastName + " " + info.address + " " + info.city + " " + info.state + " " + info.zip + " " + info.phoneNumber);
        }

    }
}


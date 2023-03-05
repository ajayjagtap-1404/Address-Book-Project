package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);

    boolean noOfContact = true;

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to AddressBook Program :");
        System.out.println();
        System.out.println("Enter 1 to enter address book program or any number to exit :");
        int enter = addressBookMain.scanner.nextInt();
        System.out.println();
        if (enter == 1) {
            while (enter != 2) {
                System.out.println("Enter any option : ");
                System.out.println(" 1. add \n 2. edit \n 3. delete \n 4. print \n 5. exit");
                String menu = addressBookMain.scanner.next();


                switch (menu) {
                    case "add":
                        addressBookMain.addContacts();
                        System.out.println("After adding ");
                        addressBookMain.printDetails();
                        break;
                    case "edit":
                        addressBookMain.editContact();
                        System.out.println("After editing");
                        addressBookMain.printDetails();
                        break;
                    case "delete":
                        addressBookMain.deleteContact();
                        System.out.println("After deleting ");
                        addressBookMain.printDetails();
                        break;
                    case "print":
                        addressBookMain.printDetails();
                        break;
                    case "exit":
                        enter = 2;
                        System.out.println(" Thank you for visiting :");
                        break;
                    default:
                        System.out.println("Please enter valid input ....");
                        break;
                }

            }

        } else {
            System.out.println("Thank you  :");

        }

    }

    private void addContacts() {
        while (noOfContact) {
            Contacts contacts = new Contacts();
            System.out.println("Enter First name :");
            contacts.setFirstName(scanner.next().toUpperCase());
            System.out.println("Enter Last Name :");
            contacts.setLastName(scanner.next().toUpperCase());
            System.out.println("Enter Address :");
            contacts.setAddress(scanner.next().toUpperCase());
            System.out.println("Enter city Name :");
            contacts.setCity(scanner.next().toUpperCase());
            System.out.println("Enter State Name : ");
            contacts.setState(scanner.next().toUpperCase());
            System.out.println("Enter zip code :");
            contacts.setZip(scanner.nextInt());
            System.out.println("Enter phone number :");
            contacts.setPhoneNumber(scanner.nextLong());
            contactsArrayList.add(contacts);
            System.out.println("Do you wish to add contact ? (Enter Y to add or any key as No)");
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'y') {
                continue;
            } else {
                break;
            }

        }
    }

    public void editContact() {
        System.out.println("Do you wish to edit contact ? (Enter Y to add or any key as No)");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'y') {
            for (Contacts contacts : contactsArrayList) {
                System.out.println("Which data you want to edit :");
                System.out.println("1. First name\n 2. Last name:\n 3. Address \n 4. city \n 5. State \n 6. zip \n 7. PhoneNumber \n 8. exit  ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter First name to update :");
                        contacts.setFirstName(scanner.next().toUpperCase());
                        break;
                    case 2:
                        System.out.println("Enter last name to edit :");
                        contacts.setLastName(scanner.next().toUpperCase());
                        break;
                    case 3:
                        System.out.println("Enter Address to edit :");
                        contacts.setAddress(scanner.next().toUpperCase());
                        break;
                    case 4:
                        System.out.println("Enter city to edit :");
                        contacts.setCity(scanner.next().toUpperCase());
                        break;
                    case 5:
                        System.out.println("Enter State name to edit");
                        contacts.setState(scanner.next().toUpperCase());
                        break;
                    case 6:
                        System.out.println("Enter zip code :");
                        contacts.setZip(scanner.nextInt());
                    case 7:
                        System.out.println("Enter phone number :");
                        contacts.setPhoneNumber(scanner.nextLong());
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Invalid input try again..... ");
                        editContact();
                        break;


                }
            }
        }
    }

    public void deleteContact() {
        System.out.println("Do you want  delete contact ? (Enter Y to add or any key as No)");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'y') {
            for (Contacts contacts : contactsArrayList) {
                System.out.println("Which data you want to delete :");
                System.out.println("1.First name\n 2. Last name:\n 3. Address \n 4.city \n 5. State \n 6. zip \n 7. PhoneNumber \n 8. exit  ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter First name to delete:");
                        String nameForDelete = scanner.next();
                        if (nameForDelete.equalsIgnoreCase(contacts.getFirstName()))
                            contacts.setFirstName(null);
                        break;
                    case 2:
                        System.out.println("Enter last name to delete :");
                        contacts.setLastName(null);
                        break;
                    case 3:
                        System.out.println("Enter Address to delete :");
                        contacts.setAddress(null);
                        break;
                    case 4:
                        System.out.println("Enter city to delete :");
                        contacts.setCity(null);
                        break;
                    case 5:
                        System.out.println("Enter State name to delete");
                        contacts.setState(null);
                        break;
                    case 6:
                        System.out.println("Enter zip code to delete :");
                        contacts.setZip(0);
                    case 7:
                        System.out.println("Enter phone number to delete :");
                        contacts.setPhoneNumber(0);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Invalid input try again..... ");
                        deleteContact();
                        break;


                }
            }
        }
    }

    public void printDetails() {
        System.out.println("Contact Details:");
        for (Contacts info : contactsArrayList) {
            System.out.println("First Name : " + info.getFirstName() + ": Last Name : " + info.getLastName() + " : Address : " + info.getAddress() + " : city : " + info.getCity() +
                    ": state :" + info.getState() + " : zip : " + info.getZip() + " : phone number : " + info.getPhoneNumber());
        }

    }
}


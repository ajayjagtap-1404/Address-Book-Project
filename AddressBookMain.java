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
        System.out.println("Enter Person details :");
        addressBookMain.addContacts();
        System.out.println("Your added contact list is :");
        addressBookMain.printDetails();
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

    public void printDetails() {
        System.out.println("Contact Details:");
        for (Contacts info : contactsArrayList) {
            System.out.println("First Name : " + info.getFirstName() + ": Last Name : " + info.getLastName() + " : Address : " + info.getAddress() + " : city : " + info.getCity() +
                    ": state :" + info.getState() + " : zip : " + info.getZip() + " : phone number : " + info.getPhoneNumber());
        }

    }
}


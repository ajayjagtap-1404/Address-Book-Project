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
        System.out.println("For editing Contact :");
        addressBookMain.editContact();
        System.out.println("After editing :");
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


    public void printDetails() {
        System.out.println("Contact Details:");
        for (Contacts info : contactsArrayList) {
            System.out.println("First Name : " + info.getFirstName() + ": Last Name : " + info.getLastName() + " : Address : " + info.getAddress() + " : city : " + info.getCity() +
                    ": state :" + info.getState() + " : zip : " + info.getZip() + " : phone number : " + info.getPhoneNumber());
        }

    }
}


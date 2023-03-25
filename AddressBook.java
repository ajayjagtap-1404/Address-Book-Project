package AddressBooks;

import java.util.*;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    public void contactList(List<Contacts> contactsArrayList) {
        boolean repeat = true;
        while (repeat) {
            System.out.println("Enter any option : ");
            System.out.println(" 1. add for Contact: \n 2. edit for Contact: \n 3. delete for Contact: \n 4. print for Contact: \n 5. exit:");
            int menu = scanner.nextInt();
            final int addContact = 1, editContact = 2, deleteContact = 3, printContact = 4, exitProgram = 5;

            switch (menu) {
                case addContact:
                    addContacts(contactsArrayList);
                    break;
                case editContact:
                    if (contactsArrayList.isEmpty()) {
                        System.out.println("No contacts found please add contact details ");
                        return;
                    } else {
                        editContact(contactsArrayList);
                        System.out.println(" After Editing : ");
                        System.out.println(contactsArrayList);
                    }
                    break;
                case deleteContact:
                    if (contactsArrayList.isEmpty()) {
                        System.out.println("No contacts found please add contact details ");
                        return;
                    } else {
                        deleteContact(contactsArrayList);
                        System.out.println(" After Deleting : : ");
                        System.out.println(contactsArrayList);
                    }


                    break;
                case printContact:
                    if (contactsArrayList.isEmpty()) {
                        System.out.println("No contacts found please add contact details ");
                        return;
                    } else {
                        System.out.println(contactsArrayList);
                    }
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

    void addContacts(List<Contacts> contactsArrayList) {
        System.out.println("Enter how many contact you want to save :");
        int noOfContact = scanner.nextInt();
        for (int i = 0; i < noOfContact; i++) {
            Contacts contacts = new Contacts();
            System.out.println("Enter person " + (i + 1) + " First name :");
            contacts.setFirstName(scanner.next().toUpperCase());
            System.out.println("Enter person " + (i + 1) + " Last  name :");
            contacts.setLastName(scanner.next().toUpperCase());
            boolean result = contactsArrayList.stream().anyMatch(p -> contacts.equals(p));
            if (result) {
                System.out.println("Enter name already present in book ");
                System.out.println("Do you want to Return or  Proceed with same name or Exit   \n 1. Return \n 2. Exit \n 3.Press any key  Proceed with same name ");

                int input = scanner.nextInt();
                if (input == 1) {
                    i--;
                    continue;
                } else if (input == 2) {
                    break;
                }

            }

            System.out.println("Enter person " + (i + 1) + " Address :");
            contacts.setAddress(scanner.next().toUpperCase());
            System.out.println("Enter person " + (i + 1) + " City Name :");
            contacts.setCity(scanner.next().toUpperCase());
            System.out.println("Enter person " + (i + 1) + " State Name :");
            contacts.setState(scanner.next().toUpperCase());
            System.out.println("Enter person " + (i + 1) + " zip Code :");
            contacts.setZip(scanner.nextInt());
            System.out.println("Enter person " + (i + 1) + " Phone Number :");
            contacts.setPhoneNumber(scanner.nextLong());
            contactsArrayList.add(contacts);

            System.out.println((i + 1) + " person Contact details  Added successfully");

        }

        System.out.println("----------------------------------------------------------");

    }

    public void editContact(List<Contacts> contactsArrayList) {
        System.out.println("Enter first name person whose data you want to change :");
        String person = scanner.next();
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (person.equalsIgnoreCase(contactsArrayList.get(i).getFirstName())) {
                System.out.println("Which data you want to edit :");
                System.out.println("1. First name\n 2. Last name:\n 3. Address \n 4. city \n 5. State \n 6. zip code \n 7. PhoneNumber \n 8. exit  ");
                int choice = scanner.nextInt();
                final int firstName = 1, lastName = 2, address = 3, city = 4, state = 5, zipCode = 6, phoneNumber = 7, exit = 8;

                switch (choice) {
                    case firstName:
                        System.out.println("Enter new first name for update :");
                        contactsArrayList.get(i).setFirstName(scanner.next().toUpperCase());
                        System.out.println("Update successfully :");
                        break;
                    case lastName:
                        System.out.println("Enter new last name for update :");
                        contactsArrayList.get(i).setLastName(scanner.next().toUpperCase());
                        System.out.println("Update successfully :");
                        break;
                    case address:
                        System.out.println("Enter new address for update :");
                        contactsArrayList.get(i).setAddress(scanner.next().toUpperCase());
                        System.out.println("Update successfully :");
                        break;
                    case city:
                        System.out.println("Enter new city name for update :");
                        contactsArrayList.get(i).setCity(scanner.next().toUpperCase());
                        System.out.println("Update successfully :");
                        break;
                    case state:
                        System.out.println("Enter new state  name for update :");
                        contactsArrayList.get(i).setState(scanner.next().toUpperCase());
                        System.out.println("Update successfully :");
                        break;
                    case zipCode:
                        System.out.println("Enter new zip code for update : ");
                        contactsArrayList.get(i).setZip(scanner.nextInt());
                        System.out.println("Update successfully :");
                        break;
                    case phoneNumber:
                        System.out.println("Enter new zip code for update : ");
                        contactsArrayList.get(i).setPhoneNumber(scanner.nextInt());
                        System.out.println("Update successfully :");
                        break;
                    case exit:
                        break;
                    default:
                        System.out.println("Invalid input try again..... ");
                        break;

                }
            } else {
                System.out.println("Contact not found ! ");
            }
        }

    }

    public void deleteContact(List<Contacts> contactsArrayList) {
        System.out.println("enter first  name of person  which you want to delete  ");
        String name = scanner.next();
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (name.equalsIgnoreCase(contactsArrayList.get(i).getFirstName())) {
                contactsArrayList.remove(i);
                System.out.println("Delete successfully : " + name + " name  contact details ");
            }
        }
        System.out.println("----------------------------------------------------------");
    }


}

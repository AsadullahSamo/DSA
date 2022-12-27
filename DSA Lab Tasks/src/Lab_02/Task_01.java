package Lab_02;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class ContactApp{
    Scanner sc = new Scanner(System.in);

    public void displayChoices(){
        System.out.println("0. Exit");
        System.out.println("1. Display contacts");
        System.out.println("2. Search contacts");
        System.out.println("3. Add contacts");
        System.out.println("4. Update contacts");
        System.out.println("5. Delete contacts\n");
    }
    public void displayContacts(String [] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]\n");
    }      // end of displayContacts() method

    public void searchContact(String [] arr){
        System.out.print("Enter contact to search in list: ");
        String contact = sc.nextLine();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(contact)) {
                System.out.println("Contact found at index " + i);
                return;
            }
        }
        System.out.println("Contact is not present in Contacts");
    }      // end of searchContact() method
    public String[] addContact(String [] arr){
        System.out.println("Add new contact to list");
        String contact = sc.nextLine();
        String [] newArray = new String[arr.length+1];
        for (int i=0; i< newArray.length-1; i++){
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = contact;
        System.out.println(contact+" added in list");
        return newArray;
    }      // end of addContact() method

    public void updateContact(String [] arr){
        System.out.println("Enter contact name to update: ");
        String oldName = sc.nextLine();
        System.out.println("Enter new name: ");
        String newName = sc.nextLine();
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i].equals(oldName)){
                index = i;
                break;
            }
        }     // end of for loop
        arr[index] = newName;
    }      // end of updateContact() method
    public String[] deleteContact(String [] arr){
        System.out.print("Enter contact name to delete: ");
        String contact = sc.nextLine();
        int size = arr.length;
        String [] newArray = new String[arr.length-1];
        if(arr[size-1].equals(contact)){
            for (int i=0; i< newArray.length; i++){
                newArray[i] = arr[i];
            }
        } else {

            int index = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equals(contact)) {
                    index = i;
                }
            }     // end of for loop
            for (int i = 0, k = 0; i < newArray.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[k++] = arr[i];
            }     // end of for loop
            newArray[newArray.length - 1] = arr[arr.length - 1];
        }
        System.out.println(contact+" deleted in list");
        return newArray;
    }      // end of deleteContacts()

}       // end of ContactApp class

public class Task_01 {
    public static void main(String[] args) {


        String [] contacts = {"Asad", "Awais", "Junaid", " Sir Mohsin", "Abbas", "Uzair Hussain", "Hassan", "Waryal"};
        ContactApp ca = new ContactApp();

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            ca.displayChoices();
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
            switch (choice){
                case 0-> System.exit(0);
                case 1 -> ca.displayContacts(contacts);
                case 2 -> ca.searchContact(contacts);
                case 3 -> contacts = ca.addContact(contacts);
                case 4 -> ca.updateContact(contacts);
                case 5 -> contacts = ca.deleteContact(contacts);
                default -> System.out.println("Invalid, please select correct option");
            }
        } while (choice!=0);

//
//        // Display Contacts
//        ca.displayContacts(contacts);
//
//        // Search Contacts
//        ca.searchContact(contacts, "Sir Mohsin");
//
//        // Add contacts
//        contacts = ca.addContact(contacts,"Sir Naeem");
//        contacts = ca.addContact(contacts,"Kamran");
//        ca.displayContacts(contacts);
//
//        //  update contacts
//        ca.updateContact(contacts);
//        ca.displayContacts(contacts);
//
//        // Delete contacts
//        contacts = ca.deleteContact(contacts,  "Mohsin");
//        contacts = ca.deleteContact(contacts,  "Kamran");
//        contacts = ca.deleteContact(contacts,  "Asad");
//        ca.displayContacts(contacts);
    }
}

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
    public void displayContacts(String [][] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
                if (i!=arr.length-1){
                    System.out.print("["+arr[i][0]+", "+arr[i][1]+"], ");
                } else {
                    System.out.print("["+arr[i][0]+", "+arr[i][1]+"]");
                }
        }
        System.out.print("]\n");
    }      // end of displayContacts() method

    public void searchContact(String [][] arr){
        System.out.print("Enter contact name or number to search in list: ");
        String contact = sc.nextLine();
        for(int i=0; i<arr.length; i++){
            if(arr[i][0].equals(contact) || arr[i][1].equals(contact)) {
                System.out.println(contact+" found at index ["+i+"][0]");
                return;
            }
        }
        System.out.println(contact+" is not present in Contacts");
    }      // end of searchContact() method
    public String[][] addContact(String [][] arr){
        String [][] newArray = new String[arr.length+1][2];
        int size = newArray.length;
        System.out.print("Enter new contact name: ");
        String contact = sc.nextLine();
        System.out.print("Enter new contact number: ");
        String number = sc.nextLine();
        System.out.println("Enter position(from 1 to "+size+") to add at: ");
        size++;
        int pos = sc.nextInt();
        sc.nextLine();
        for (int i=pos-1; i< newArray.length-1; i++){
            newArray[i+1] = arr[i];
        }
        for (int i=0; i< pos-1; i++){
            newArray[i] = arr[i];
        }
        // because index = pos - 1;  e.g(pos = 7, then index = 6, pos = 1, index = 0)
        newArray[pos-1][0] = contact;
        newArray[pos-1][1] = number;
        System.out.println(contact+" added in list");
        return newArray;
    }      // end of addContact() method

    public void updateContact(String [][] arr){
        System.out.println("Enter contact name to update: ");
        String oldName = sc.nextLine();
        System.out.println("Enter new name: ");
        String newName = sc.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = sc.nextLine();
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i][0].equals(oldName)){
                index = i;
                break;
            }
        }     // end of for loop
        arr[index][0] = newName;
        arr[index][1] = newNumber;
    }      // end of updateContact() method
    public String[][] deleteContact(String [][] arr){
        System.out.print("Enter contact name to delete: ");
        String contact = sc.nextLine();
        int size = arr.length;
        String [][] newArray = new String[arr.length-1][2];
        if(arr[size-1][0].equals(contact)){
            for (int i=0; i< arr.length-1; i++){
                newArray[i][0] = arr[i][0];
                newArray[i][1] = arr[i][1];
            }
        } else {

            int index = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i][0].equals(contact)) {
                    index = i;
                }
            }     // end of for loop
            for (int i = 0, k = 0; i < newArray.length; i++) {
                if (i == index) {
                    continue;
                }
                    newArray[k][0] = arr[i][0];
                    newArray[k][1] = arr[i][1];
                    k++;
            }     // end of for loop
            newArray[newArray.length - 1][0] = arr[arr.length - 1][0];
            newArray[newArray.length - 1][1] = arr[arr.length - 1][1];
        }
        System.out.println(contact+" deleted from list");
        return newArray;
    }      // end of deleteContacts()

}       // end of ContactApp class

public class Task_01 {
    public static void main(String[] args) {


        String [][] contacts = {{"Asad", "+924567891237"}, {"Awais", "+924512345789"}, {"Junaid", "+924513687002"}, {"Sir Mohsin", "+9245136789010"}, {"Abbas", "+924123678410"}, {"Uzair Hussain", "+921345689698"}, {"Hassan", "+928746555445"}, {"Waryal", "+924513789456"}};
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


    }
}

package Lab_01;

import java.util.Scanner;

public class Name_And_Roll_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int roll_no;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        roll_no = sc.nextInt();

        System.out.println("Name: "+name+" and Roll Number: "+roll_no);

    }
}

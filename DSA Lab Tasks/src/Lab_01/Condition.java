package Lab_01;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if(age<=13){
            System.out.println("Ticket is $5");
        } else if(age>13 && age<=65){
            System.out.println("Ticket is $10");
        } else if(age>65){
            System.out.println("Ticket is $7");
        }
        // Android.java

    }
}
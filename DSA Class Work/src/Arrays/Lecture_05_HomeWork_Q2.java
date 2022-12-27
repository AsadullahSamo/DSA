package Arrays;

import java.util.Scanner;

public class Lecture_05_HomeWork_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your DSA marks: ");
        int DSAmarks = sc.nextInt();

        if (DSAmarks>=0 && DSAmarks<=100){
            System.out.println("Your DSA marks are "+DSAmarks);
        } else {
            System.out.println("Invalid marks");
        }

        System.out.print("Enter your OOP marks: ");
        int OOPmarks = sc.nextInt();
        if (OOPmarks<0 || OOPmarks>100){
            System.out.println("Invalid marks");
        } else {
            System.out.println("Your OOP marks are: "+OOPmarks);
        }

    }
}

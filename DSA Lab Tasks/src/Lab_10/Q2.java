package Lab_10;

import java.util.Scanner;

public class Q2 {

    public static void printNums(int lowerlimit, int n){
        if(lowerlimit>n)
            return;
        else {
            System.out.println(lowerlimit);
            printNums(lowerlimit + 1, n);
        }
    }  // end of method

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNums(1, num);

    }
}

package Lab_10;

import java.util.Scanner;

public class Q1 {

    public static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        else
            return n * factorial(n-1);
    }      // end of factorial


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
    }
}

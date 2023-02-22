package Lab_10;

import java.util.Scanner;

public class Q3 {

    public static int fab(int n){


        if ( n == 0 )
            return 0;
        else if ( n == 1 )
            return 1;
        else
            return ( fab(n-1) + fab(n-2) );
    }   // end of method fab()


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            System.out.print(fab(i)+"  ");
        }
    }
}

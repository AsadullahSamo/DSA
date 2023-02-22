package Recursion;

public class Factorial {

    public static long factorial(int n){
        if (n==1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {

        long factorial1 = factorial(5);
        System.out.println(factorial1);
        long factorial2 = factorial(6);
        System.out.println(factorial2);

    }
}

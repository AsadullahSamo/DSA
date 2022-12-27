package Lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_02 {

    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements of array");
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void displayOutput(int [] arr){
        System.out.print("[");
        int size =  arr.length;
        for (int i=0; i< arr.length; i++){
            if(i==size-1){
                System.out.print(arr[i]+"]");
                return ;
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

    }       // end of displayOutput

    public static void search(int [] arr, int num){
        for (int i=0; i< arr.length; i++){
            if(arr[i]==num){
                System.out.println("Number found at index "+i);
                return;
            }
        }
        System.out.println("Number not found ");
    }
//    public static void menu(){
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        while (choice!=4){
//
//            switch (choice) {
//                case 1 -> input();
//                case 2 -> displayOutput();
//                case 3 -> search();
//
//            }
//        }
//    }      // end of menu()

    public static void main(String[] args) {

        int [] arr = {1, 5, 6, 7, 8, 8 ,9};
        displayOutput(arr);
        System.out.println();

        search(arr, 6);
        search(arr, -1);

    }
}

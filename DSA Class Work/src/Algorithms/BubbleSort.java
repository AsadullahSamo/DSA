package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {1, 2, 5, 7, 9, 87, 56, 42, 78, 100, 4};

        // Sorting using Bubble Sort
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing Resulting sorted array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

    }     // end of main
}        // end of program

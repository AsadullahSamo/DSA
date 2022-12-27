package Algorithms;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int [] a, int lowerbound, int upperbound){
        int pivot = a[upperbound];
        int i = lowerbound-1;
        for (int j=lowerbound; j<upperbound; j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[upperbound];
        a[upperbound] = temp;
        return (i+1);
    }

    public static void quickSort(int [] a, int lowerbound, int upperbound){
        if(lowerbound<upperbound){
            int location = partition(a, lowerbound, upperbound);
            quickSort(a, lowerbound, location-1);
            quickSort(a, location+1, upperbound);
        }
    }


    public static void main(String[] args) {

        int [] array = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        int size = array.length;
        quickSort(array, 0, size-1);
        System.out.println(Arrays.toString(array));
    }
}

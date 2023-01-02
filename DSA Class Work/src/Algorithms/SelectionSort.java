/**
                    Algorithm
 Pass 1: Find min element in array and swap it with first element
 Pass 2: Find min element in remaining array and swap it with second element
 Number of passes required are n-1
 Two loops, outer for passes and inner for finding min element
 */

package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int [] arr){
        for (int i=0; i< arr.length-1; i++){
            int min = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr1 = {7, 4, 10, 8, 3, 1};
        System.out.println(Arrays.toString(selectionSort(arr1)));
    }
}

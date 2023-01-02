/**
                    Algorithm
 We divided array into sorted and unsorted lists (arrays)
 Step 1: We take first element as sorted list and rest of array as unsorted
 Step 2: We will take an element from unsorted array and find its appropriate place in sorted list, then insert element at that place in sorted list
 Step 3: Take var temp and store sorted element in it (from right to left) till 0 index if (arr[i]>temp) put arr[i] at index of temp, and compare temp with second value and so on until 0 index, then put temp at appropriate place
 Two loops --> Outer from 1 to n, Inner from i+1 to 0 (Decremental loop)
 */

package Algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int [] arr){
        int temp;
        for (int i=1; i< arr.length; i++){
            temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr = {5, 4, 10, 1, 6, 2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}

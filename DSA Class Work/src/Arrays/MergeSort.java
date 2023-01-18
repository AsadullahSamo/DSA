package Arrays;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int [] a, int lowerbound, int upperbound){

        if (lowerbound<upperbound) {
            int mid = (lowerbound + upperbound) / 2;
            mergeSort(a, lowerbound, mid);
            mergeSort(a, mid + 1, upperbound);
            merge(a, lowerbound, mid, upperbound);
        }
    } // end of mergeSort() method

    public static void merge(int [] a, int lowerbound, int mid, int upperbound){
        int [] b = new int[a.length];
        int i = lowerbound, j = mid+1, k = lowerbound;
        while (i<=mid && j<=upperbound){
            if (a[i]<=a[j]){
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }     // end of while loop
        if (i>mid){
            while (j<=upperbound){
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while (i<=mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (i=lowerbound; i<=upperbound; i++){
            a[i] = b[i];
        }
    }   // end of merge() method

    public static void main(String[] args) {

        int [] array = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}

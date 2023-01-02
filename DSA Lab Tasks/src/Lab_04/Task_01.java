package Lab_04;

import java.util.Arrays;

public class Task_01 {

    public static int[] bubbleSort(int [] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }      // end of bubbleSort()

    public static int[] insertionSort(int [] arr){
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }        // end of insertionSort() method

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
    }     // end of selectionSort() method

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
        
        int [] array = {180, 165, 150, 170, 145};

        long before1 = System.nanoTime();
        System.out.println(Arrays.toString(bubbleSort(array)));
        long after1 = System.nanoTime();
        System.out.println("Execution time of bubbleSort() method is "+(after1-before1)+" nanoseconds");

        long before2 = System.nanoTime();
        System.out.println(Arrays.toString(insertionSort(array)));
        long after2 = System.nanoTime();
        System.out.println("Execution time of insertionSort() method is "+(after2-before2)+" nanoseconds");
        
        long before3 = System.nanoTime();
        System.out.println(Arrays.toString(selectionSort(array)));
        long after3 = System.nanoTime();
        System.out.println("Execution time of selectionSort() method is "+(after3-before3)+" nanoseconds");

        long before4 = System.nanoTime();
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        long after4 = System.nanoTime();
        System.out.println("Execution time of quickSort() method is "+(after4-before4)+" nanoseconds");
    }
}

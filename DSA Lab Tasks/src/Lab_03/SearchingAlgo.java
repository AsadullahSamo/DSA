package Lab_03;

import java.util.Arrays;

public class SearchingAlgo {

    public static int linearSearch(int [] array, int element){
        long diff;
        long before = System.currentTimeMillis();
        int index = 0;
        boolean flag = false;
        for (int i=0; i< array.length; i++){
                if(array[i]==element){
                    flag = true;
                    index = i;
                }
        }
        if(flag){
            return index;
        } else {
            return -1;
        }

    }    // end of linearSearch

    public static void linearSearch2D(int [][] array, int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == element) {
                    System.out.println("Element found at index ["+i+"]["+j+"]");
                    return;
                }
            }
        }
            System.out.println("Element not found");
    }    // end of linearSearch2D
    public static int binarySearch(int [] arr, int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int p = 0, q=arr.length-1, i = 0;
        while (p<=q){
            i= (p+q)/2;
            if(arr[i]==target){
                return i;
            }

            if(arr[i]<target){
                p = i+1;
            } else {
                q = i-1;
            }
        }
        return -1;
    }

    public static void binarySearch2D(int[][] array, int key) {

        int [] newArray = new int[array.length*array[0].length];

        int j=0, k=0;
        for (int i=0; i< newArray.length; i++){
            if(j>2) {
                j = 0;
                k++;
            }
            newArray[i] = array[k][j];
            j++;
        }

//        Arrays.sort(newArray);
        int arr = binarySearch(newArray, key);
        switch (arr){
            case 0 -> System.out.println("Elemnt found at index [0][0]");
            case 1 -> System.out.println("Elemnt found at index [0][1]");
            case 2 -> System.out.println("Elemnt found at index [0][2]");
            case 3 -> System.out.println("Elemnt found at index [1][0]");
            case 4 -> System.out.println("Elemnt found at index [1][1]");
            case 5 -> System.out.println("Elemnt found at index [1][2]");
            case 6 -> System.out.println("Elemnt found at index [2][0]");
            case 7 -> System.out.println("Elemnt found at index [2][1]");
            case 8 -> System.out.println("Elemnt found at index [2][2]");
        }
    }


    public static void main(String[] args) {

      int [] array = {4, 5, 6, 78, 98, -5, 0, 12, 25, -8};

        long before = System.currentTimeMillis();
        System.out.println("Index is "+linearSearch(array, 78));
        long after = System.currentTimeMillis();
        long runtime = after - before;
        System.out.println("Runtime of linear search is "+runtime);


        long before1 = System.currentTimeMillis();
        System.out.println("Index is "+binarySearch(array, -5));
        long after1 = System.currentTimeMillis();
        long runtime1 = after1 - before1;
        System.out.println("Runtime of binary search is "+runtime1);
//
        int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
        long before2 = System.currentTimeMillis();
        linearSearch2D(matrix, 8);
        long after2 = System.currentTimeMillis();
        long runtime2 = after2 - before2;
        System.out.println("Runtime of linear search is "+runtime2);

        binarySearch2D(matrix, 7);

    }
}

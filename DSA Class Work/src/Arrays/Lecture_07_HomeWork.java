package Arrays;
import java.util.Arrays;

public class Lecture_07_HomeWork {
    public static int binarySearch(int [] arr, int target){
        int counter = 1;
        System.out.println(Arrays.toString(arr));
        int p = 0, q = arr.length-1, i = 0;
        while (p<=q){
            i = (p+q)/2;
            if(arr[i]==target){
                System.out.println("Maximum attempt to find "+target+" is "+counter);
                System.out.print("Index is ");
                return i;
            }
            if(arr[i]<target){
                p = i+1;
            } else {
                q = i-1;
            }
            counter++;
        }     // end of while loop
        System.out.print("Index of "+target+" is ");
        return -1;
    }       // end of binarySearch() method

    public static void main(String[] args) {

        int [][] matrix = {{2, 1, 3}, {4, 6, 2}, {27, 81, 36}, {21, -1, 37}, {23, 15, 13},
                {98, 87, 76}, {45, 65, 9}, {54, 56, 59}, {4, 5, 68}, {74, 85, 69}};

        int [] arr = new int[30];

        //  Converting 2D array into 1D
        int j=0, k=0;
        for (int i=0; i<30; i++){

            if(j>2) {
                j = 0;
                k++;
            }
            arr[i] = matrix[k][j];
            j++;

        }

        //  Sorting 1D array
        for (int i=0; i< arr.length; i++){
            for (j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //  Applying binary search
        System.out.println(binarySearch(arr, 45));
        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr, 21));
        System.out.println(binarySearch(arr, 27));
        System.out.println(binarySearch(arr, 98));

    }      // end of main() method
}          // end of program
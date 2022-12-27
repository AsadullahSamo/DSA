package Arrays;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotate(int [] arr, int d){
        int k=0;
        int size = arr.length;
        int [] temp = new int[d];
        for (int i=0; i< temp.length; i++){
            temp[i] = arr[i];
        }
        for (int i=0; i< size-d; i++) {
            arr[i] = arr[i+d];
        }
        for (int i=size-d; i< size; i++){
            arr[i] = temp[k];
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotate(arr, 2)));
        int [] arr2 = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(Arrays.toString(rotate(arr2, 2)));

    }
}

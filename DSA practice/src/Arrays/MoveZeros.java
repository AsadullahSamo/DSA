package Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static int[] zeros(int [] arr){
        int k=0;
        for (int i=0; i< arr.length-1; i++){
                if (arr[i] == 0) {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                    k++;
                }
            }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr1 = {1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println(Arrays.toString(zeros(arr1)));
    }
}

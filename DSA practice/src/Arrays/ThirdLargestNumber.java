package Arrays;

import java.util.Arrays;

public class ThirdLargestNumber {

    public static int thirdLargestElement(int [] arr) {
        int max= Integer.MIN_VALUE;
        Arrays.sort(arr);
        max = arr[arr.length-3];
        return max;
    }


    public static void main(String[] args) {

        int [] arr1 = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargestElement(arr1));
        int [] arr2 = {19, -10, 20, 14, 2, 16, 10};
        System.out.println(thirdLargestElement(arr2));
    }
}

package Arrays;

import java.util.Arrays;

public class SlidingWindowMaximum {

    public static int max(int...arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static int[] slideWindowMax(int [] nums, int k){
        int size = nums.length;
        int [] temp = new int[size-k+1];
        int size2 = temp.length;

            for (int i = 0; i < size2; i++) {

                    temp[i] = max(nums[i], nums[i + 1], nums[i + 2]);

            }
            return temp;
        }



    public static void main(String[] args) {

        int [] array1 = {4, 3, 8, 9, 0, 1};
        System.out.println(Arrays.toString(slideWindowMax(array1, 3)));
        int [] array2 = {9, 8, 6, 4, 3, 1};
        System.out.println(Arrays.toString(slideWindowMax(array2, 4)));
        int [] array3 = {1, 2, 3, 4, 10, 6, 9, 8, 7, 5};
        System.out.println(Arrays.toString(slideWindowMax(array3, 3)));
        int [] array4 = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(slideWindowMax(array4, 3)));

    }
}

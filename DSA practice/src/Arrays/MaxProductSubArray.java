package Arrays;

import java.util.Arrays;

public class MaxProductSubArray {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxProduct = 0;
        if(nums.length>1) {
            for (int i = nums.length - 1; i > 1; i--) {
                if (nums[i] * nums[i - 1] > maxProduct) {
                    maxProduct = nums[i - 1] * nums[i - 2];
                }
            }
            return maxProduct;
        } else {
            return nums[0];
        }
    }

    public static void main(String[] args) {

        int [] array1 = {2, 3, -2, 4};
        System.out.println(maxProduct(array1));
        int [] array2 = {-2, 0, -1};
        System.out.println(maxProduct(array2));
        int [] array3 = {-2};
        System.out.println(maxProduct(array3));
        int [] array4 = {-4, -3};
        System.out.println(maxProduct(array4));


    }
}

/**
                    Problem Description
        Given an array of length n, return an array with running sum of same length
        Input: nums = [1, 2, 3, 4]
        Output: [1, 3, 6, 10]
        Explanation: Running sum is obtained as [1, 1+2, 1+2+3, 1+2+3+4]
 */

package Arrays;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {

        int [] newArray = new int[nums.length];
        int sum = 0;
        for (int i=0; i< nums.length; i++){
            sum = 0;
            for (int j=0; j<= i; j++){
                sum += nums[j];
            }
            newArray[i] = sum;
        }
        return newArray;

    }

    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(array1)));
        int [] array2 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(array2)));

    }
}

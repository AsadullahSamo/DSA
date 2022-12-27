/**
                    Problem Description
 Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

 The value of |x| is defined as:

 x if x >= 0.
 -x if x < 0.


 Example 1:
 Input: nums = [1,2,2,1], k = 1
 Output: 4
 Explanation: The pairs with an absolute difference of 1 are:
 - [1,2,2,1]
 - [1,2,2,1]
 - [1,2,2,1]
 - [1,2,2,1]

 Example 2:
 Input: nums = [1,3], k = 3
 Output: 0
 Explanation: There are no pairs with an absolute difference of 3.

 Example 3:
 Input: nums = [3,2,1,5,4], k = 2
 Output: 3
 Explanation: The pairs with an absolute difference of 2 are:
 - [3,2,1,5,4]
 - [3,2,1,5,4]
 - [3,2,1,5,4]
 */

package Arrays;

public class NumberOfPairsWithAbsoluteDifference {

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]-nums[j]==k || nums[i]-nums[j]==-k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] array1 = {1, 2, 2, 1};
        System.out.println(countKDifference(array1, 1));
        int [] array2 = {1, 3};
        System.out.println(countKDifference(array2, 3));
        int [] array3 = {3, 2, 1, 5, 4};
        System.out.println(countKDifference(array3, 2));

    }    // end of main() method
}       //  end of program

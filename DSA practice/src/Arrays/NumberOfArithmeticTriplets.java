/**
                                Problem Description
 You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

 1. i < j < k,
 2. nums[j] - nums[i] == diff, and
 3. nums[k] - nums[j] == diff.
 Return the number of unique arithmetic triplets.

 Example 1:
 Input: nums = [0,1,4,6,7,10], diff = 3
 Output: 2
 Explanation:
 (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
 (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.

 Example 2:
 Input: nums = [4,5,6,7,8,9], diff = 2
 Output: 2
 Explanation:
 (0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
 (1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
 */

package Arrays;

public class NumberOfArithmeticTriplets {

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int num : nums) {
            for (int i : nums) {
                for (int j : nums) {
                    if (i - num == diff && j - i == diff) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] nums1 = {0, 1, 4, 6, 7, 10};
        int diff1 = 3;
        System.out.println(arithmeticTriplets(nums1, diff1));

        int [] nums2 = {4, 5, 6, 7, 8, 9};
        int diff2 = 2;
        System.out.println(arithmeticTriplets(nums2, diff2));

    }     // end of main() method
}        //  end of program

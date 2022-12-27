/**
            Problem Description
 Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

 Return the answer in an array.

 Example 1:

 Input: nums = [8,1,2,2,3]
 Output: [4,0,1,1,3]
 Explanation:
 For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 For nums[1]=1 does not exist any smaller number than it.
 For nums[2]=2 there exist one smaller number than it (1).
 For nums[3]=2 there exist one smaller number than it (1).
 For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 Example 2:

 Input: nums = [6,5,4,8]
 Output: [2,1,0,3]
 Example 3:

 Input: nums = [7,7,7,7]
 Output: [0,0,0,0]
 */

package Arrays;

import java.util.Arrays;

public class SmallerNumberThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] newArray = new int[nums.length];
        int count;
        for (int i=0; i< nums.length; i++){
            count = 0;
            for (int j=0; j< nums.length; j++){
                if (nums[j]<nums[i]){
                    count++;
                }
            }
            newArray[i] = count;
        }
        return newArray;
    }     // end of method

    public static void main(String[] args) {

        int [] array1 = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array1)));
        int [] array2 = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array2)));
        int [] array3 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array3)));


    }
}

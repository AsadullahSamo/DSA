/**
            Problem Description
 We are given a list nums of integers representing a list compressed with run-length encoding.

 Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

 Return the decompressed list.

 Example: 01
 Input: nums = [1,2,3,4]
 Output: [2,4,4,4]
 Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

 Example: 02
 Input: nums = [1,1,2,3]
 Output: [1,3,3]
 */

package Arrays;

import java.util.Arrays;

public class DecompressRLEncoding {

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i=0; i< nums.length; i+=2){
                size += nums[i];
        }
        int [] newArray = new int[size];
        int k = 0, freq, val;
            for (int i=0; i< nums.length; i+=2){
                freq = nums[i]; val = nums[i+1];
                int m = 1;
                while (m<=freq){
                    newArray[k] = val;
                 m++;
                 k++;
                }
            }
        return newArray;
    }

    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(array1)));
        int [] array2 = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(array2)));
    }
}

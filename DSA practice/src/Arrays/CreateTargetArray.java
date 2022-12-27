/**
                Problem Description
 Given two arrays of integers nums and index. Your task is to create target array under the following rules:

 Initially target array is empty.
 From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 Repeat the previous step until there are no elements to read in nums and index.
 Return the target array.

 It is guaranteed that the insertion operations will be valid.

 Example: 01
 Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 Output: [0,4,1,3,2]
 Explanation:
 nums       index     target
 0            0        [0]
 1            1        [0,1]
 2            2        [0,1,2]
 3            2        [0,1,3,2]
 4            1        [0,4,1,3,2]

 Example: 02
 Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
 Output: [0,1,2,3,4]
 Explanation:
 nums       index     target
 1            0        [1]
 2            1        [1,2]
 3            2        [1,2,3]
 4            3        [1,2,3,4]
 0            0        [0,1,2,3,4]

 Example: 03
 Input: nums = [1], index = [0]
 Output: [1]
 */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

    public static void insert(int [] arr, int pos, int num){
        for (int i=0; i< arr.length; i++){

        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int k;
        int [] targetArray = new int[nums.length];
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            k = index[i];
            array.add(k, nums[i]);
        }

        for (int i=0; i<targetArray.length; i++){
            targetArray[i] = array.get(i);
        }
        return targetArray;
    }

    public static void main(String[] args) {

        int [] nums1 = {0, 1, 2, 3, 4};
        int [] index1 = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums1, index1)));
        int [] nums2 = {1, 2, 3, 4, 0};
        int [] index2 = {0, 1, 2, 3, 0};
        System.out.println(Arrays.toString(createTargetArray(nums2, index2)));
        int [] nums3 = {1};
        int [] index3 = {0};
        System.out.println(Arrays.toString(createTargetArray(nums3, index3)));
    }
}

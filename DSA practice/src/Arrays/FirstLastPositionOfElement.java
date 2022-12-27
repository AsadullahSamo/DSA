package Arrays;

import java.util.Arrays;

public class FirstLastPositionOfElement {

    public static int[] searchRange(int[] nums, int target){

        int [] array = new int[2];
        boolean flag = false;
        for (int i=0, j=nums.length-1; i< nums.length; i++, j--){
            if(nums[i]==target) {
                array[1] = i;
                flag = true;
            }
            if (nums[j]==target)
                array[0] = j;
        }
        if(flag)
        return array;
        else {
            array[0] = -1;     array[1] = -1;
        }
            return array;
    }

    public static void main(String[] args) {

        int [] arr1 = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr1, 8)));
        System.out.println(Arrays.toString(searchRange(arr1, 6)));
        int [] arr2 = {};
        System.out.println(Arrays.toString(searchRange(arr2, 0)));
    }
}

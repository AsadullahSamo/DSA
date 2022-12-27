package Arrays;

import java.util.Arrays;

public class SingleNumber_II {

    public static int singleNumber(int [] nums){
        int size = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int num = 0;
        if(size==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        for (int i=1; i<nums.length-1; i++){
            if (nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                num = nums[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int [] array = {2, 2, 3, 2};
        System.out.println(singleNumber(array));
//        singleNumber(array);

        int [] array2 = {0, 1, 0, 1, 0, 1, 9};
        System.out.println(singleNumber(array2));
//        singleNumber(array2);

        int [] array3 = {1};
        System.out.println(singleNumber(array3));

        int [] array4 = {30000, 500, 100, 30000, 100, 30000, 100};
        System.out.println(singleNumber(array4));

    }
}

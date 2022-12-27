package Arrays;

import java.util.Arrays;

public class SmallestPositiveInteger {

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int size = nums.length;
        int num = 0, max = 0;

//        if(size==1 && nums[size-1]<1){
//            num = 1;
//        }
//        else if(size==1 && nums[size-1]==1){
//            num = 2;
//        }
//        else if(size==1 && nums[size-1]>1){
//            num = 1;
//        }
//        else if(nums[size-1]<1){
//            num =1;
//        }
//
//        else if(nums[0]>1 && size>1){
//            num = 1;
//        } else if(nums[0]<0 && size>1){
//            num = 1;
//        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                break;
            }
        }
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] > 0 && nums[i] + 1 != nums[i + 1]) {
                if(max-1!=0 && max+1!=nums[i+1]){
                    num = 1;
                } else {
                    num = nums[i] + 1;
                    break;
                }
            }
        }

        return num;
    }




    public static void main(String[] args) {

        int [] arr1 = {2, 9, -10, 5, 3, 1, 11, -1, 7};
        System.out.println(firstMissingPositive(arr1));

        int [] arr2 = {-10,4,-4,2,15,13,6,8,-1};
        System.out.println(firstMissingPositive(arr2));

        int [] arr3 = {1,1,0,18,1,-12,-6,18,21};
        System.out.println(firstMissingPositive(arr3));

        int [] arr4 = {1, 2, 3,4,5, -10,-10,18,-12,-6,18,21, 6};
        System.out.println(firstMissingPositive(arr4));



    }
}

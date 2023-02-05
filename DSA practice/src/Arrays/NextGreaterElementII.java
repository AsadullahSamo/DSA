package Arrays;

import java.util.Arrays;

public class NextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        int [] ans = new int[nums.length];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for (int i=0; i< nums.length-1; i++){
            boolean flag = false;
            int element = nums[i];
            int j;
            for (j=0; j< nums.length; j++){
                if (nums[j]>element){
                    flag = true;
                    break;
                }
            }
            if (flag)
                ans[i] = nums[j];
            else
                ans[i] = -1;
        }
        int element = nums[nums.length-1];
        int i;
        for (i= nums.length-2; i>=0; i--){
            if (nums[i]>element)
                ans[nums.length-1] = nums[i];

        }
        if (ans[nums.length-1] == 0)
            ans[nums.length-1] = -1;
        return ans;
    }     // end of nextGreaterElements() method

    public static void main(String[] args) {

        int [] array = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(nextGreaterElements(array)));
        System.out.println(-1>-110);
    }
}

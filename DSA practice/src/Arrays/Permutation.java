package Arrays;

import java.util.Arrays;

public class Permutation {

    public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i=0; i< ans.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {

        int [] array1 = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(array1)));
        int [] array2 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(buildArray(array2)));
    }
}

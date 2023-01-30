package Arrays;

public class SingleNumber {

    public static int singleNum(int[] nums) {

        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    flag = false;
                }
            }
            if (flag == true) {
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {


        int [] nums1 = {2, 1, 5, 3, 1, 5, 2};
        System.out.println(singleNum(nums1));
    }
}

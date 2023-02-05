package Arrays;
import java.util.Arrays;
import java.util.List;

public class NextGreaterElement1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];

        for (int i=0; i< nums1.length; i++){
            boolean flag = false;
            int element = nums1[i];
            int k = 0;
            for (int j=0; j<nums2.length; j++){
                if (nums2[j]==element){
                    k = j;
                    break;
                }
            }
            int l;
            for (l = k; l<nums2.length; l++) {
                if (nums2[l] > element) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                ans[i] = nums2[l];
            else
                ans[i] = -1;
        }
        return ans;
    }     // end of nextGreaterElement

    public static void main(String[] args) {

        int [] nums1 = {1, 3, 5, 2, 4};
        int [] nums2 = {6, 5, 4, 3, 2, 1, 7};
        int [] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));

    }
}

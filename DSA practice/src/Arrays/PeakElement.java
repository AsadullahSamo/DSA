package Arrays;

public class PeakElement {

    public static int max(int [] nums){
        int max = nums[0];
        for (int i=0; i< nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        } else {
            int index = max(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == index) {
                    index = i;
                    break;
                }
            }
            return index;
        }
    }


    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 1};
    //    System.out.println(findPeakElement(arr1));

        int [] arr2 = {1, 2, 1, 3, 5, 6, 4};
  //      System.out.println(findPeakElement(arr2));

        int [] arr3 = {1};
//        System.out.println(findPeakElement(arr3));

        int [] arr4 = {1, 2};
        //System.out.println(findPeakElement(arr4));

        int [] arr5 = {1, 2, 1};
        System.out.println(max(arr5));
        System.out.println(findPeakElement(arr5));
    }
}

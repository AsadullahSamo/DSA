package Arrays;

import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {

        n = nums.length/2;
        int [] newArray = new int[nums.length];
        for (int i=0, k=0, l=n; i<newArray.length; i++){
            if(i%2==0) {
                newArray[i] = nums[k];
                k++;
            } else {
                newArray[i] = nums[l];
                l++;
            }
        }
//        for (int i=0, k=0; i<newArray.length; i+=2, k++){
//                newArray[i] = nums[k];
//        }
//        for (int i=1, k=n; i<newArray.length; i+=2, k++){
//            newArray[i] = nums[k];
//        }
        return newArray;
    }

    public static void main(String[] args) {

        int [] array1 = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(array1, 3)));
        int [] array2 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(shuffle(array2, 4)));
        int [] array3 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(array3, 2)));

    }
}

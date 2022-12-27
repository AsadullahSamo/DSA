package Arrays;

public class SearchRotatedArray {

    public static int[] rotate(int [] arr, int d){
        int k=0;
        int size = arr.length;
        int [] temp = new int[d];
        for (int i=0; i< temp.length; i++){
            temp[i] = arr[i];
        }
        for (int i=0; i< size-d; i++) {
            arr[i] = arr[i+d];
        }
        for (int i=size-d; i< size; i++){
            arr[i] = temp[k];
            k++;
        }
        return arr;
    }  // end of rotate()

    public static int search(int[] nums, int target) {
        rotate(nums, 3);
        for (int i=0; i< nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int [] array = {0, 1, 2, 3, 4, 5, 6};
        System.out.println(search(array, 0));
        int [] array2 = {1};
        System.out.println(search(array2, 0));

    }
}

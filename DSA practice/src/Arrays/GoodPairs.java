package Arrays;

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j])
                    counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(array1));
        int [] array2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(array2));
        int [] array3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(array3));
    }
}

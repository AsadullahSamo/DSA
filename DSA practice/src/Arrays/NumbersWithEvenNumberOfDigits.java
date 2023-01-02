/**
            Problem Description

 */

package Arrays;

public class NumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        int remainder = 0, numOfDigits;
        for (int i=0; i<nums.length; i++){
            remainder = nums[i];
            numOfDigits = 0;
            while (remainder>0){
                remainder /= 10;
                numOfDigits++;
            }
            if (numOfDigits%2==0){
                count++;
            }
        }
        return count;
    }       // end of findNumbers() method

    public static void main(String[] args) {

        int [] array1 = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(array1));
        int [] array2 = {555, 901, 482, 1771};
        System.out.println(findNumbers(array2));


    }      // end of main() method
}         //  end of program

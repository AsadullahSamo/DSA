/**
            Problem Description
 Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

 A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

 0 <= i < j < k < arr.length
 |arr[i] - arr[j]| <= a
 |arr[j] - arr[k]| <= b
 |arr[i] - arr[k]| <= c
 Where |x| denotes the absolute value of x.

 Return the number of good triplets.

 Example 1:
 Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 Output: 4
 Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

 Example 2:
 Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
 Output: 0
 Explanation: No triplet satisfies all conditions.
 */

package Arrays;

public class CountGoodTriplets {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                for (int k=0; k< arr.length; k++){
                    if (i<j && j<k && k< arr.length && Math.abs(arr[i] - arr[j])<=a && Math.abs(arr[j] - arr[k])<=b && Math.abs(arr[i] - arr[k])<=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] array1 = {3, 0, 1, 1, 9, 7};
        System.out.println(countGoodTriplets(array1, 7, 2, 3));
        int [] array2 = {1, 1, 2, 2, 3};
        System.out.println(countGoodTriplets(array2, 0, 0, 1));

    }     // end of main() method
}        //  end of program

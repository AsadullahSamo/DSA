/**
                Problem Description
 Given an integer n, return any array containing n unique integers such that they add up to 0.

 Example 1:
 Input: n = 5
 Output: [-7,-1,1,3,4]
 Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

 Example 2:
 Input: n = 3
 Output: [-1,0,1]

 Example 3:
 Input: n = 1
 Output: [0]
 */

package Arrays;

import java.util.Arrays;

public class UniqueIntegersThatSumUptoZero {

    public static int[] sumZero(int n) {
        int [] array = new int[n];
        if (n%2==0){
            for (int i=1; i<n; i+=2){
                int j = -i;
                array[i-1] = i;
                array[i] = j;
            }
        } else {
            array[0] = 0;
            for (int i=1; i<n; i+=2){
                int j = -i;
                array[i] = i;
                array[i+1] = j;
            }
        }
        return array;
    }   // end of method sumZero()

    public static void main(String[] args) {

//        int n1 = 3;
        System.out.println(Arrays.toString(sumZero(5)));

    }    // end of main() method
}       //  end of program

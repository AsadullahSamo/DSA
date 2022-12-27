/**
                Problem Description
 There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

 Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

 Example: 01
 Input: candies = [2,3,5,1,3], extraCandies = 3
 Output: [true,true,true,false,true]
 Explanation: If you give all extraCandies to:
 - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
 - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
 - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
 - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

 Example: 02
 Input: candies = [4,2,1,1,2], extraCandies = 1
 Output: [true,false,false,false,false]
 Explanation: There is only 1 extra candy.
 Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

 Example: 03
 Input: candies = [12,1,12], extraCandies = 10
 Output: [true,false,true]
 */

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> newArray = new ArrayList<>(candies.length);
        int maxCandies = 0;
        boolean flag = true;
        for (int i=0; i<candies.length; i++){
            flag = true;
            maxCandies = candies[i]+extraCandies;
            for (int j=0; j<candies.length; j++){
                if (maxCandies<candies[j]){
                    flag = false;
                    break;
                }
            }
            newArray.add(flag);
        }   // end of outer for loop
        return newArray;
    }               // end of kidsWithCandies() method

    public static void main(String[] args) {

        int [] array1 = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(array1, 3));
        int [] array2 = {4, 2, 1, 1, 2};
        System.out.println(kidsWithCandies(array2, 1));
        int [] array3 = {12, 1, 12};
        System.out.println(kidsWithCandies(array3, 10));

    }     // end of main() method
}      // end of program

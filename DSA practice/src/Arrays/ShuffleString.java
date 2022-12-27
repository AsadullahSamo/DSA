/**
                    Problem Description
 You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

 Return the shuffled string.

 Example 1:
 Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]  --> c moves to index 4, o to 5, d to 6, e to 7, l to 0, e to 1, e to 2, t to 3
 Output: "leetcode"
 Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

 Example 2:
 Input: s = "abc", indices = [0,1,2]
 Output: "abc"
 Explanation: After shuffling, each character remains in its position.
 */

package Arrays;

import java.util.ArrayList;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        String newString = "";
        ArrayList<String> stringArray = new ArrayList<>();
        // To create ArrayList same as s (given string)
        for (int i=0; i< indices.length; i++){
            stringArray.add(String.valueOf(s.charAt(i)));
        }
        for (int i=0; i< indices.length; i++){
            stringArray.set(indices[i], String.valueOf(s.charAt(i)));
        }
        for (int i=0; i< stringArray.size(); i++){
            newString = newString.concat(stringArray.get(i));
        }
        return newString;
    }

    public static void main(String[] args) {

//        String [] s = {"s", "o", "d", "a"};
        String str = "codeleet";
        int [] indices = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(restoreString(str, indices));
//        for (int i=0; i<s.length; i++){
//            str = str.concat(s[i]);
//        }
//        System.out.println(str);
    }
}

/**
                    Problem Description
 Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

 A string is palindromic if it reads the same forward and backward.

 Example 1:
 Input: words = ["abc","car","ada","racecar","cool"]
 Output: "ada"
 Explanation: The first string that is palindromic is "ada".
 Note that "racecar" is also palindromic, but it is not the first.

 Example 2:
 Input: words = ["notapalindrome","racecar"]
 Output: "racecar"
 Explanation: The first and only string that is palindromic is "racecar".

 Example 3:
 Input: words = ["def","ghi"]
 Output: ""
 Explanation: There are no palindromic strings, so the empty string is returned.
 */

package Arrays;

import java.util.ArrayList;

public class FirstPalindromicStringInArray {

    public static String firstPalindrome(String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "";
        for (int i=0; i< words.length; i++){
            if (words[i].length()==1){
                str = str.concat(words[i]);
                return str;
            }
            int j = 0, k = words[i].length()-1;
            while(words[i].charAt(j)==words[i].charAt(k)){
                if (j==words[i].length()/2){
                    arrayList.add(words[i]);
                    return arrayList.get(0);
                }
                j++;
                k--;
            }
        }
        if (arrayList.size()==0){
            return "";
        }
        return arrayList.get(0);
    }

    public static void main(String[] args) {

        String [] array1 = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(array1));
        String [] array2 = {"notapalindrome", "racecar"};
        System.out.println(firstPalindrome(array2));
        String [] array3 = {"def", "ghi"};
        System.out.println(firstPalindrome(array3));
        String [] array4 = {"xngla","e","itrn","y","s","pfp","rfd"};
        System.out.println(firstPalindrome(array4));
    }
}

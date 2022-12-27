/**
                Problem Description
 Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

 A string is represented by an array if the array elements concatenated in order forms the string.

 Example 1:
 Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 Output: true
 Explanation:
 word1 represents string "ab" + "c" -> "abc"
 word2 represents string "a" + "bc" -> "abc"
 The strings are the same, so return true.

 Example 2:
 Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 Output: false

 Example 3:
 Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 Output: true
 */

package Arrays;

public class CheckIfTwoStringsAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean flag = false;
        String str1 = "", str2 = "";
        for (String s : word1) {
            str1 = str1.concat(s);
        }
        for (String s : word2) {
            str2 = str2.concat(s);
        }
        if (str1.equals(str2)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {

        String [] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
        String [] word3 = {"a", "cb"}, word4 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word3, word4));
        String [] word5 = {"abc", "d", "defg"}, word6 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word5, word6));

    }    // end of main() method
}       //  end of program

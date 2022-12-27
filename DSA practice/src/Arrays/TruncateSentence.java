/**
                                Problem Description
 A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

 For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
 You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.


 Example 1:
 Input: s = "Hello how are you Contestant", k = 4
 Output: "Hello how are you"
 Explanation:
 The words in s are ["Hello", "how" "are", "you", "Contestant"].
 The first 4 words are ["Hello", "how", "are", "you"].
 Hence, you should return "Hello how are you".

 Example 2:
 Input: s = "What is the solution to this problem", k = 4
 Output: "What is the solution"
 Explanation:
 The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
 The first 4 words are ["What", "is", "the", "solution"].
 Hence, you should return "What is the solution".

 Example 3:
 Input: s = "chopper is not a tanuki", k = 5
 Output: "chopper is not a tanuki"
 */

package Arrays;

public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        String str = "";
        int j=0;
        for (int i=0; i<s.length(); i++){
            str = str.concat(String.valueOf(s.charAt(i)));
            if (str.charAt(i)==' '){
                j++;
            }
            if (j==k){
                break;
            }
        }
        char lastLetterOfS = s.charAt(s.length()-1);
        char lastLetterOfStr = str.charAt(str.length()-1);
        if (lastLetterOfStr==lastLetterOfS){
            return str;
        } else {
            s = str.substring(0, str.length() - 1);
        }
        return s;
    }   //  end of truncateSentence() method

    public static void main(String[] args) {

        String str1 = "Hello how are you Contestant";
        System.out.println(truncateSentence(str1, 4));
        String str2 = "What is the solution to this problem";
        System.out.println(truncateSentence(str2, 4));
        String str3 = "chopper is not a tanuki";
        System.out.println(truncateSentence(str3, 5));

    }   // end of main() method
}      //  end of program

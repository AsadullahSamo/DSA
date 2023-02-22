package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacterInString {


    public static int firstUniqueChar(String s) {


        for(int i=0; i<s.length(); i++) {


            char letter = s.charAt(i);

            //if first index value is same to the last index value
            if (s.indexOf(letter) == s.lastIndexOf(letter)) {
                return i;
            }
        }
        return -1;
    }     // end of method()

    public static void main(String[] args) {

        String s = "dddccdbba";
        System.out.println(firstUniqueChar(s));
        String s2 = "loveleetcode";
        System.out.println(firstUniqueChar(s2));
        String s3 = "leetcode";
        System.out.println(firstUniqueChar(s3));
        String s4 = "aabb";
        System.out.println(firstUniqueChar(s4));

    }   // end of main()
}

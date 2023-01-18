package Arrays;

import java.util.Arrays;

public class DIMatchStrings {

    public static int[] diStringMatch(String s) {

        int [] array = new int[s.length()+1];
        int i=1, j = 2;
        if (s.charAt(0)=='D'){
            array[0] = i;
            i++;
        } else {
            array[0] = 0;
        }
        for (int k=1; k< array.length; k++){
            if(s.charAt(k-1)=='I'){
                array[k] = i+j;
                j++;
            } else if(s.charAt(k-1)=='D'){
                array[k] = j-i;
                if (k== array.length-1){
                    break;
                }
                if(s.charAt(k)=='I'){
                    i--;
                } else {
                    i++;
                }
            }
        }
        return array;
    }    // end of diStringMatch

    public static void main(String[] args) {

        String str1 = "IDID";
        System.out.println(Arrays.toString(diStringMatch(str1)));
        String str2 = "III";
        System.out.println(Arrays.toString(diStringMatch(str2)));
        String str3 = "DDIDIDDDDIID";
        System.out.println(Arrays.toString(diStringMatch(str3)));

    }     // end of main() method
}        //  end of program

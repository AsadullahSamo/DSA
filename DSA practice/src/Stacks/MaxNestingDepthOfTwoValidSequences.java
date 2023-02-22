package Stacks;

import java.util.Arrays;

public class MaxNestingDepthOfTwoValidSequences {

    public static int[] maxDepthAfterSplit(String seq) {

        int [] ans = new int[seq.length()];
        int count = 1;
        for (int i=0; i<seq.length(); i++){
            if (seq.charAt(i)=='(' && seq.charAt(i+1)=='('){
                count++;
            }
        }
        int val = count*2;
        int i=0;
        while (i<val){
            ans[i] = 1;
            i++;
        }
        return ans;

    }    // end of maxDepth()

    public static void main(String[] args) {

        String seq = "(()())";
        String seq2 = "()(())()";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq2)));

    }   // end of main()
}


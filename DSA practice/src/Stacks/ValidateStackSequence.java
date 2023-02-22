package Stacks;

import java.util.Stack;

public class ValidateStackSequence {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        stack.push(pushed[0]);
        for (int i=1, j=0; i<popped.length; i++) {
            while(stack.peek()!=popped[j]) {
                stack.push(pushed[i]);
            }
                while(pushed[i]==popped[j]){
                    stack.pop();
                    j++;
                }
            }
            System.out.println(stack);

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        int [] pushed = {1, 2, 3, 4, 5};
        int [] popped = {4, 5, 3, 2, 1};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
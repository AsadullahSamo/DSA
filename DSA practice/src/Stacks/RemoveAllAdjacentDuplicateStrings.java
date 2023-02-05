package Stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateStrings {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(c);
            } else if(c== stack.peek()){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder str = new StringBuilder("");
        while (!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        return String.valueOf(str.reverse());
    }    // end of removeDuplicates()

    public static void main(String[] args) {

        String s = "azxxzy";
        System.out.println(removeDuplicates(s));

    }
}

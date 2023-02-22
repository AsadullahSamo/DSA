package Stacks;

import java.util.Stack;

public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        if(s.charAt(0)!='#') {
            stack1.push(s.charAt(0));
        }

        for (int i=1; i<s.length(); i++){
             if(s.charAt(i)=='#'){
                 if(!stack1.isEmpty())
                    stack1.pop();
                 else{
                     i++;
                     i--;
                 }
            } else {
                stack1.push(s.charAt(i));
            }
        }

            if(t.charAt(0)!='#') {
                stack2.push(t.charAt(0));
            }
        for (int i=1; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!stack2.isEmpty()) {
                    stack2.pop();
                }
                else{
                    i++;
                    i--;
                }
            } else {
                stack2.push(t.charAt(i));
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);
        return stack1.equals(stack2);
    }


    public static void main(String[] args) {

        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s, t));

    }
}

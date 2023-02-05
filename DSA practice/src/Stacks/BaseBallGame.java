package Stacks;

import java.util.Stack;

public class BaseBallGame {

    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<operations.length; i++){
            if (operations[i].equals("D")) {
                stack.push((stack.peek()) * 2);
            }
            else if (operations[i].equals("C")) {
                stack.pop();
            }
            else if (operations[i].equals("+")){
                int element = stack.peek();
                int poppedElement = stack.pop();
                element += stack.peek();
                stack.push(poppedElement);
                stack.push(element);
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while (!stack.isEmpty()){
            sum += stack.peek();
            stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {

        String [] operations1 = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations1));

        String [] operations2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(operations2));

        String [] operations3 = {"1", "C"};
        System.out.println(calPoints(operations3));

    }    // end of main() method
}        // end of program

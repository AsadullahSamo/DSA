package Stacks;

import java.util.Stack;

class CustomStack {
    Stack<Integer> stack = new Stack<>();
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if(stack.size()!=maxSize) {
            stack.add(x);
        }
    }

    public int pop() {
        if (stack.size()==0)
            return -1;
        return stack.pop();
    }

    public void increment(int k, int val) {
        for (int i=0; i<k; i++) {
            if(i==stack.size()){
                break;
            }
            stack.set(i, stack.get(i)+val);
        }
    }

}       // end of class CustomStack


public class DesignStackWithIncrementOperation {
    public static void main(String[] args) {

        CustomStack stk = new CustomStack(3);
        stk.push(1);
        stk.push(2);
        System.out.println(stk.pop());
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);
        stk.increment(5, 100);                // stack becomes [101, 102, 103]
        stk.increment(2, 100);                // stack becomes [201, 202, 103]
        System.out.println(stk.pop());
        System.out.println(stk.pop());                   // return 202 --> Return top of the stack 202, stack becomes [201]
        System.out.println(stk.pop());                     // return 201 --> Return top of the stack 201, stack becomes []
        System.out.println(stk.pop());

    }
}

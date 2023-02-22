package Stacks;

class MyStack {

    private int [] a = new int[100];
    private int size = 0;

    public MyStack() {

    }

    public void push(int x) {
        a[size++] = x;
    }

    public int pop() {
        if (size==0){
            throw new IllegalStateException();
        }
        int temp = a[--size];
        return temp;

    }

    public int top() {
        if(size==0){
            throw new IllegalStateException();
        }
        return a[size-1];
    }

    public boolean empty() {
        return (size==0);
    }
}


public class ImplementStackUsingQueues {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}

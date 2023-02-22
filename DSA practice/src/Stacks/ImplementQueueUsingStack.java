package Stacks;

import java.util.Stack;

class MyQueue{
    Stack<Integer> queue = new Stack();

    int size = 0;
    public MyQueue() {

    }

    public void push(int x) {
        queue.add(0, x);
        size++;
    }

    public int pop() {
        if (size==0){
            throw new IllegalStateException();
        }
        return (queue.pop());
    }

    public int peek() {
        if (size==0){
            throw new IllegalStateException();
        }
        return queue.peek();
    }

    public boolean empty() {
        return (size==0);
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}

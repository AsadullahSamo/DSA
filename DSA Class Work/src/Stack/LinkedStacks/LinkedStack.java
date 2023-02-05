package Stack.LinkedStacks;

import Stack.ArrayStacks.ArrayStack;
import java.util.EmptyStackException;

public class LinkedStack {

    private int size = 0;
    private Node top;

    static class Node{
        Node next;
        Object object;
        public Node(Object object){
            this.object = object;
        }
    }   // end of class Node

    public ArrayStack conversion(LinkedStack linkedStack){
        ArrayStack a = (ArrayStack) linkedStack;
        return a;
    }
    public boolean equals(LinkedStack linkedStack, ArrayStack arrayStack){
        if (linkedStack.size!=arrayStack.size()){
            return false;
        }
        for (int i=0; i<size; i++){
            if (linkedStack.peek()!=arrayStack.peek()){
                return false;
            }
        }
        return true;
    }     // end of equals()
    public String toString(){
        StringBuilder str = new StringBuilder("[");
        int count = size;
        while(!isEmpty()){
            if (count==1)
                str.append(peek());
            else
                str.append(peek()).append(", ");
            pop();

            count--;
        }

        str.append("]");
        return String.valueOf(str);
    }    // end of toString()
    public void push(Object obj){
        Node temp = new Node(obj);
        temp.next = top;
        top = temp;
        size++;

    }
    public Object pop(){
        Object oldTop =  top.object;
        top = top.next;
        --size;
        return oldTop;
    }
    public Object peek(){
        if (size==0)
            throw new EmptyStackException();
        return top.object;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public int size(){
        return size;
    }

}

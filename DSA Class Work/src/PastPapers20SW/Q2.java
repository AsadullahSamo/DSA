package PastPapers20SW;

import java.util.Stack;

class ArrayStack{

    private int size = 0;
    private Object a[];

    public ArrayStack(int cap){
        a = new Object[cap];
    }   // end of constructor
    public void push(Object obj){
        if (size==a.length){
            resize();
        }
        a[size++] = obj;
    }
    public Object peek(){
        if (size==0){
            throw new IllegalStateException();
        }
        return a[size-1];
    }
    public Object pop(){
        if (size==0){
            throw new IllegalStateException();
        }
        Object obj = a[--size];
        a[size] = null;
        return obj;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void resize(){
        Object [] aa = a;
        a = new Object[2 * aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
    public void print(ArrayStack stack){
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }    // end of print() method

}      // end of class ArrayStack

public class Q2 {
    public static void main(String[] args) {

        ArrayStack stack1 = new ArrayStack(12);
        stack1.push("OOP in C++");
        stack1.push("Calculus by SM. Yusuf");
        stack1.push("Into to IICT");
        stack1.push("Electric Technology");

        ArrayStack stack2 = new ArrayStack(12);
        stack2.push("Sams Teach Yourself Java in 24 hours");
        stack2.push("Islamic Studies");
        stack2.push("Farkaleet Series");
        stack2.push("Core Java");

        ArrayStack stack3 = new ArrayStack(12);
        stack3.push("Modern DBS Design");
        stack3.push("Algorithms Part 1");
        stack3.push("Intro to Management");
        stack3.push("Intro to OR");

        ArrayStack stack = new ArrayStack(12);
        while (!stack1.isEmpty()){
            stack.push(stack1.peek());
            stack1.pop();
        }
        while (!stack2.isEmpty()){
            stack.push(stack2.peek());
            stack2.pop();
        }
        while (!stack3.isEmpty()){
            stack.push(stack3.peek());
            stack3.pop();
        }

        stack.print(stack);

    }  // end of main()
}

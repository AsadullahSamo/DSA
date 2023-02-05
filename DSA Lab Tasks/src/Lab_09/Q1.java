package Lab_09;

import java.util.EmptyStackException;

public class Q1 {

    static class ArrayStack<k>{
        private int size = 0;
        private  k [] arr;

        public ArrayStack(int capacity){
            arr = (k[]) new Object[capacity];
        }    // end of constructor

        public void push(k stack){
            if(size==arr.length){
                resize();
            }
            arr[size++] =  stack;
        }    // end of push() method

        public k pop() {
            if (size==0){
                throw new EmptyStackException();
            }
            k obj = arr[--size];
            return obj;
        }       // end of pop() method
        public boolean search(k obj){
            for (int i=0; i< arr.length; i++){
                if (arr[i]==obj){
                    return true;
                }
            }
            return false;
        }

        public k peek() {
            if(size==0){
                throw new EmptyStackException();
            }
            return arr[size-1];
        }      // end of peek() method
        public void display(){
            System.out.print("[");;
            while (!isEmpty()){
                if (getSize()==1)
                    System.out.print(peek());
                else
                    System.out.print(peek()+", ");
                pop();
            }
            System.out.println("]");
        }       // end of display()
        public boolean isEmpty(){
            return (size==0);
        }
        public int getSize(){
            return size;
        }
        private void resize(){
            Object [] aa = arr;
            arr = (k[]) new Object[2*aa.length];
            System.arraycopy(aa, 0, arr, 0, size);
        }     // end of resize() method
    }      // end of ArrayStack class

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack = new ArrayStack<>(10);

        System.out.println(arrayStack.isEmpty());

        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(8);
        arrayStack.push(1);
        arrayStack.push(-18);
        arrayStack.push(90);

        System.out.println("The size of stack is: "+arrayStack.getSize());
        System.out.println(arrayStack.peek());

        arrayStack.pop();
        System.out.println(arrayStack.peek());

        System.out.println("Searching 18... "+arrayStack.search(-18));

        System.out.println("Stack is empty? "+arrayStack.isEmpty());
        arrayStack.display();

    }
}

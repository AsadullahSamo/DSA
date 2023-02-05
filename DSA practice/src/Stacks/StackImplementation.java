package Stacks;


class ArrayStack{
    private int size = 0;
    private Object [] arr;


    public ArrayStack(int capacity){
        arr = new Object[capacity];
    }    // end of constructor

    public void push(Object stack){
        if(size==arr.length){
            resize();
        }
        arr[size++] = stack;
    }    // end of push() method

    public Object pop() {
        if (size==0){
            throw new IllegalStateException();
        }
        Object obj = arr[--size];
        arr[size] = null;
        return obj;
    }       // end of pop() method


    public Object peek() {
        if(size==0){
            throw new IllegalStateException();
        }
        return arr[size-1];
    }      // end of peek() method

    public boolean isEmpty(){
        return (size==0);
    }
    public int size(){
        return size;
    }
    private void resize(){
        Object[] aa = arr;
        arr = new Object[2*aa.length];
        System.arraycopy(aa, 0, arr, 0, size);
    }     // end of resize() method
}      // end of ArrayStack class

public class StackImplementation {
    public static void main(String[] args) {

        ArrayStack fruitCrates=new ArrayStack(6);
        fruitCrates.push("Apples");
        fruitCrates.push("Kiwis");
        fruitCrates.push("Dragon Fruit");
        fruitCrates.pop();
        fruitCrates.push("Pomegrnate");
        fruitCrates.push("Grapes");
        fruitCrates.push("Peach");
        fruitCrates.push("Orange");
        fruitCrates.push("Guava");
        fruitCrates.push("Chikoo");
        fruitCrates.push("Malta");

        System.out.println(fruitCrates.isEmpty());
        System.out.println(fruitCrates.peek());
        System.out.println(fruitCrates.size());
    }     // end of main() method
}        //   end of program

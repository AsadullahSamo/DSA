/**
        Lecture 13 and 14
 */
package Stack;

interface Stack{
    void push(Object stack);
     Object pop();
     Object peek();
}       // end of interface Stack

class ArrayStack implements Stack{
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

    @Override
    public Object pop() {
        if (size==0){
            throw new IllegalStateException();
        }
        Object obj = arr[--size];
        arr[size] = null;
        return obj;
    }       // end of pop() method

    @Override
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


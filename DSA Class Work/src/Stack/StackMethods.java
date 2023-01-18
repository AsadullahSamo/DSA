package Stack;

import java.util.Arrays;

public class StackMethods {

    static class ArrayStack{

        private int size = 0;
        private Object a[];
        public ArrayStack(int cap){
            a = new Object[cap];
        }
        public Object peek(){
            if(size==0){
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
        public void push(Object obj){
            if (size==a.length){
                resize();
            }
             a[size++] = obj;
        }
        public void resize(){
            Object [] aa = a;
            a = new Object[2*aa.length];
            System.arraycopy(aa, 0, a, 0, size);
        }
        public int size(){
            return size;
        }
        public boolean equals(ArrayStack s){

            if (this.size != s.size)
                { return false; }
            for (int i=0; i<s.size; i++){
                if (!(this.a[i].equals(s.a[i]))){
                    return false;
                }
            }

            return true;

        }   // end of method equals()

        public Object popFromLast(){
            Object obj = a[0];
            a[0] = null;
            for (int i=0; i<size-1; i++){
                a[i] = a[i+1];
            }
            size--;
            return obj;
        }

        public String toString(){
            String stack = "[";
            int i = 0;
            while (i<size){
                if (i==size-1){
                    stack = stack.concat(String.valueOf(a[i]));
                    break;
                }
                stack = stack.concat(a[i] +" , ");
                i++;
            }
            stack = stack.concat("]");
            return stack;
        }
        public Object peekLast(){
            return a[0];
        }
        public Object peekMiddle(){
            return a[(size / 2)];
        }

        public void reverseStack(){
            for (int i=0, j=size-1; i<size/2; i++, j--){
                Object temp = this.a[i];
                this.a[i] = this.a[j];
                this.a[j] = temp;
            }

        }

    }    // end of class ArrayStack

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);
        stack.push("Asad");
        stack.push(5);
        stack.push(3.1);
        stack.push("Rise of the Tomb Raider");
        System.out.println(stack);

        // pop top element
        stack.pop();
        System.out.println(stack);

        // pop bottom element in stack
        stack.popFromLast();
        System.out.println(stack);


        ArrayStack stack2 = new ArrayStack(5);
        stack2.push("Asad");
        stack2.push(5);
        stack2.push(3.1);
        stack2.push("Rise of the Tomb Raider");



        System.out.println(stack.equals(stack2));

        System.out.println(stack.peekLast());
        stack.popFromLast();
        System.out.println(stack.peekLast());

        stack.push("Biohazard 7");
        stack.push("Java");
        System.out.println(stack);

        System.out.println(stack.peekMiddle());
        stack.push("Ruby On Rails");
        stack.push("SQL");
        stack.push("C#");
        stack.push("React JS");

        System.out.println(stack.peekMiddle());

        System.out.println(stack);


        // Reversing Stack 1
        stack.reverseStack();
        System.out.println(stack);

        // Reversing Stack 2
        stack2.reverseStack();
        System.out.println(stack2);

    }    // end of main() method

}        // end of program

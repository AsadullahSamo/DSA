package Stacks;

import java.sql.SQLOutput;

public class RemoveOuterParentheses {

    static class ArrayStack{
        private int size = 0;
        private char [] a;
        public ArrayStack(int cap){
            a = new char[cap];
        }

        public void resize(){
            char [] aa = a;
            a = new char[2*aa.length];
            System.arraycopy(aa, 0, a, 0, size);
        }
        public char pop(){
            if (size==0){
                throw new IllegalStateException();
            }
            char obj = a[--size];
            return obj;
        }
        public char peek(){
            return a[size-1];
        }
        public void push(char obj){
            if (size==a.length){
                resize();
            }
            a[size++] = obj;
        }
        public int size(){
            return size;
        }
        public String removeOuterParentheses(String s) {
            String str = "", str2 = "";
            char [] array = s.toCharArray();
            char [] array2 = new char[s.length()];
            int j = 0;
            int l = 0;
            for (int i=0; i<array.length; i++) {
                int count1 = 0, count2 = 0;
                do {
                        if (array[i] == '(') {
                            push(array[i]);
                            count1++;
                        } else {
                            push(array[i]);
                            count2++;
                        }
                        i++;
                }while (count1 != count2);
                i--;
                pop();
                l++;
                int size = size();

                while (size!=1) {
                    str = str.concat(String.valueOf(peek()));
                    pop();
                    size--;
                }
                pop();
                l++;
                for (int k=str.length()-1; k>=0; k--, j++){
                    array2[j] = str.charAt(k);
                }
                str = "";
            }
            for (j=0; j<array2.length-l; j++){
                str2 = str2.concat(String.valueOf(array2[j]));
            }


            return str2;
        }     // end of method()
    }   // end of ArrayStack

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(5);

        String s = "()()";
        System.out.println(arrayStack.removeOuterParentheses(s));

    }     // end of main() method
}        //  end of program

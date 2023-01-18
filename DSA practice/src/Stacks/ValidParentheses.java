package Stacks;

public class ValidParentheses {

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

        public boolean isValid(String s){

            char [] array = s.toCharArray();
            boolean flag = false;
            for (int i=0; i<array.length; i++){
                if (array[i]=='('){
                    int j = i;
                    while (array[i]!=')'){
                        i++;
                    }
                    int k = i;
                    int l = (j+k)/2+1;
                    int o = k;
                    for (int m=l; m<=o; m++, k--, j++){
                        if (array[j]=='(' && array[k]==')' || array[j]=='[' && array[k]==']' || array[j]=='{' && array[k]=='}'){
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                } else if (array[i]=='{'){
                    int j = i;
                    while (array[i]!='}'){
                        i++;
                    }
                    int k = i;
                    int l = (j+k)/2+1;
                    int o =k;
                    for (int m=l; o<=k; m++, k--, j++){
                        if (array[j]=='(' && array[k]==')' || array[j]=='[' && array[k]==']' || array[j]=='{' && array[k]=='}'){
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                } else if (array[i]=='['){
                    int j = i;
                    while (array[i]!=']'){
                        i++;
                    }
                    int k = i;
                    int l = (j+k)/2+1;
                    int o = k;
                    for (int m=l; m<=o; m++, k--, j++){
                        if (array[j]=='(' && array[k]==')' || array[j]=='[' && array[k]==']' || array[j]=='{' && array[k]=='}'){
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                }
            }    // end of for loop
            return flag;

        }    // end of isValid() method


    }    // end of class ArrayStack

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(5);
        String s = "(]";
        System.out.println(arrayStack.isValid(s));
    }
}

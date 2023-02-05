package Lab_09;

public class Q2 {

    static class LinkedStack<k> {
        static class Node<k>{
            Node<k> next;
            k val;

            public Node(k val) {
                this.val = val;
            }
        }   // end of class Node

        private Node<k> top;
        private int length = 0;

        public LinkedStack(){
            top = null;
            length = 0;
        }
        public void push(k data){
            Node<k> temp = new Node<k>(data);
            temp.next = top;
            top = temp;
            length++;
        }
        public k pop(){
            k result = top.val;
            top = top.next;
            length--;
            return result;
        }
        public k peek(){
            return top.val;
        }
        public int getSize(){ return  length; }
        public void display() {
            System.out.print("[");
            ;
            while (!isEmpty()) {
                if (getSize() == 1)
                    System.out.print(peek());
                else
                    System.out.print(peek() + ", ");
                pop();
            }
            System.out.println("]");
        }
            public boolean isEmpty(){
            return (length == 0);
        }
        public boolean search(k val){
            for (Node p = top; p!=null; p=p.next){
                if (p.val==val)
                    return true;
            }
            return false;
        }
    }     // end of class LinkedStack


    public static void main(String[] args) {

        LinkedStack<Integer> linkedStack = new LinkedStack<>();

        System.out.println(linkedStack.isEmpty());

        linkedStack.push(5);
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(34);

        System.out.println(linkedStack.peek());

        linkedStack.pop();
        System.out.println(linkedStack.peek());

        System.out.println("Size of stack is "+linkedStack.getSize());
        System.out.println("Stack is empty? "+linkedStack.isEmpty());
        System.out.println("Searching 2... "+linkedStack.search(2));

        linkedStack.display();

    }   // end of main()'
}

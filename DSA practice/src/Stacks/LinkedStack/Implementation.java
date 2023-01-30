package Stacks.LinkedStack;
class LinkedStack {

    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }

    }   // end of class Node

    private Node top;
    private int length;

    public LinkedStack(){
        top = null;
        length = 0;
    }
    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        int result = top.val;
        top = top.next;
        length--;
        return result;
    }
    public int peek(){
        return top.val;
    }
    public boolean isEmpty(){
        return (length == 0);
    }
    public boolean search(int val){
        for (Node p = top; p!=null; p=p.next){
            if (p.val==val)
                return true;
        }
        return false;
    }

}     // end of class LinkedStack

public class Implementation {
    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(5);
        linkedStack.push(10);
        linkedStack.push(15);

        System.out.println(linkedStack.search(5));

        System.out.println(linkedStack.peek());
        linkedStack.pop();
        System.out.println(linkedStack.peek());
        linkedStack.pop();
        System.out.println(linkedStack.peek());
        linkedStack.pop();

        System.out.println(linkedStack.isEmpty());

    }
}

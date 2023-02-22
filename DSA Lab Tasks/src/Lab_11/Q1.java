package Lab_11;

import java.util.Arrays;

class ArrayQueue {
    private int size = 0;
    private String[] a;

    public ArrayQueue(int cap) {
        a = new String[cap];
    }
    public void resize(){
        String [] aa = a;
        a = new String[2 * aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
    public void add(String str) {
        if (size==a.length){
            resize();
        }
            a[size++] = str;
    }
    public String remove(){
        for (int i=0; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        size--;
        return a[0];
    }
    public String peek(){
        return a[0];
    }
    public boolean isFull() {
        return size == a.length;
    }
    public int size(){
        return size;
    }
}      // end of class ArrayQueue
        // end of class Node

class LinkedQueue{
    static class Node{
        Node prev = this, next = this;
        private Object val;
        public Node(Object val){
            this.val = val;
        }
        public Node(Object val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head = new Node(null);

    public int size = 0;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public Object first(){
        if (size==0){
            throw new IllegalStateException();
        }
        return head.next.val;
    }
    public Object remove(){
        Object temp = head.next.val;
        head.next = head.next.next;
        head.prev.next = head;
        size--;
        return temp;
    }
    public void add(Object obj){
        head.prev.next = new Node(obj, head, head.prev);
        head.prev = head.prev.next;
        size++;
    }
}        // end of LinkedQueue

public class Q1 {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add("Request 1");
        arrayQueue.add("Request 2");
        arrayQueue.add("Request 3");
        arrayQueue.add("Request 4");
        arrayQueue.add("Request 5");
        arrayQueue.add("Request 6");
        System.out.println("Size of queue is "+arrayQueue.size());

        System.out.println(arrayQueue.peek());
        arrayQueue.remove();
        System.out.println(arrayQueue.peek());
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        System.out.println(arrayQueue.peek());

        System.out.println();
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.add("Request 1");
        linkedQueue.add("Request 2");
        linkedQueue.add("Request 3");
        linkedQueue.add("Request 4");
        linkedQueue.add("Request 5");
        linkedQueue.add("Request 6");
        System.out.println("Size of queue is "+linkedQueue.size());

        System.out.println(linkedQueue.first());
        linkedQueue.remove();
        System.out.println(linkedQueue.first());
        linkedQueue.remove();
        linkedQueue.remove();
        linkedQueue.remove();
        linkedQueue.remove();
        System.out.println(linkedQueue.first());


    }      // end of main() method
}         //  end of program

package Queue;

import jdk.jshell.spi.ExecutionControl;

public class Queue {

    static class Node{
        Node prev = this, next = this;
        Object obj;
        public Node(Object obj){
            this.obj = obj;
        }
        public Node(Object obj, Node next, Node prev){
            this.obj = obj;
            this.next = next;
            this.prev = prev;
        }
    }    // end of class Node

    static class LinkedQueue{
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
            return head.next.obj;
        }
        public Object remove(){
            Object temp = head.next.obj;
            head.next = head.next.next;
            head.prev.next = head;
            size--;
            return temp;
        }
        public void add(Object obj){
            head.prev.next = new Node(obj);
            head.prev = head.prev.next;
            size++;
        }
    }    // end of LinkedQueue class

    public static void main(String[] args) {

        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.add(5);
        linkedQueue.add(7);
        linkedQueue.add(8);

        System.out.println(linkedQueue.first());
        linkedQueue.remove();
        System.out.println(linkedQueue.first());
        linkedQueue.remove();
        System.out.println(linkedQueue.first());

    }
}

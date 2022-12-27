/**
 Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 Example: 01
 Input: head = [1,1,2]
 Output: [1,2]

 Example: 02
 Input: head = [1,1,2,3,3]
 Output: [1,2,3]
 */

package LinkedList;
public class RemoveDuplicatesFromSortedLists {

    static class Node{
        Node next;
        int data;
        public Node(){
        }

        public Node(int data){
            this.data = data;
        }
    }       // end of class Node

    public static void display(Node start){
        for (Node p = start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }       // end of display() method


    public static int lastElement(Node start) {
        Node p;
        for (p = start; p != null; p = p.next) {
            if (p.next==null){
                break;
            }
        }
        return p.data;
    }
    public static Node deleteDuplicates(Node head) {
        if (head==null){
            return null;
        }
        int lastElement = lastElement(head);
        for (Node p = head; p.next!=null; p=p.next){
            if (p.data==lastElement){
                System.out.println(p.data);
                p.next = null;
                break;
            }
            while (p.data == p.next.data) {
                p.next = p.next.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {

//        Node start = new Node();
//        Node p = start;
        Node start = new Node(1);
        Node p = start;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(1);
        p = p.next;

        p.next = new Node(2);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
//
        p.next = new Node(4);
        p = p.next;

        p.next = new Node(5);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(5);
        p = p.next;

        p.next = new Node(6);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(7);
        p = p.next;

        p.next = new Node(7);
        p = p.next;

        display(start);
        Node a = deleteDuplicates(start);
        System.out.println();
        display(a);

    }
}



/**
                Problem Description
 Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 Example: 01
 Input: head = [1,2,6,3,4,5,6], val = 6
 Output: [1,2,3,4,5]

 Example: 02
 Input: head = [], val = 1
 Output: []

 Example: 03
 Input: head = [7,7,7,7], val = 7
 Output: []
 */

package LinkedList;

public class RemoveLLElements {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }       // end of class Node

    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static Node removeElements(Node head, int val) {
        Node q = head;
        if (head==null){
            return null;
        }

        while (head.val==val){
            head = head.next;
            if(head==null){
                return head;
            }
        }
        for (Node p = head; p.next!=null; p=p.next){
            if (p.next.next==null && p.next.val==val){
                p.next = null;
                break;
            }
            while (p.next.val == val){
                p.next = p.next.next;
                if(p.next==null){
                    return head;
                }
            }
        }
        return head;

    }     // end of removeElements() method

    public static void main(String[] args) {

        Node start = new Node(5);
        Node p = start;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        display(start);
        Node a = removeElements(start, 1);
        display(a);
    }
}

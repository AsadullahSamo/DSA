/**
                Problem Description
 You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

 Example: 01
 Input: head = [1,3,4,7,1,2,6]
 Output: [1,3,4,1,2,6]
 Explanation:
 The above figure represents the given linked list. The indices of the nodes are written below.
 Since n = 7, node 3 with value 7 is the middle node, which is marked in red.

 Example: 02
 Input: head = [1,2,3,4]
 Output: [1,2,4]
 Explanation:
 The above figure represents the given linked list.
 For n = 4, node 2 with value 3 is the middle node, which is marked in red.

 Example: 03
 Input: head = [2,1]
 Output: [2]
 Explanation:
 The above figure represents the given linked list.
 For n = 2, node 1 with value 1 is the middle node, which is marked in red.
 Node 0 with value 2 is the only node remaining after removing node 1.
 */

package LinkedList;

public class DeleteMiddleNodeOfLL {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }       // end of class Node

    public static void display(Node start){
        for (Node p=start; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }       // end of display() method

    public static int counter(Node head){
        int counter = 0;
        for (Node p=head; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }      // end of counter() method
    public static Node middleNode(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node slow = head, fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node deleteMiddle(Node head) {
        Node middleNode = middleNode(head);

        for (Node p=head; p!=null; p=p.next){
            if (p.next==middleNode){
                p.next = p.next.next;
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        Node start = new Node(2);
        Node p = start;
        p.next = new Node(1);
        p = p.next;
//        p.next = new Node(3);
//        p = p.next;
//        p.next = new Node(4);
//        p = p.next;
//        p.next = new Node(1);
//        p = p.next;
//        p.next = new Node(2);
//        p = p.next;
//        p.next = new Node(6);
//        p = p.next;
        display(start);
        Node a = deleteMiddle(start);
        display(a);
    }        // end of main() method
}           //  end of program

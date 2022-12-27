/**
    Problem Description
 You are given the head of a linked list, and an integer k.

 Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 Example : 01
 Input: head = [1,2,3,4,5], k = 2
 Output: [1,4,3,2,5]

 Example : 02
 Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
 Output: [7,9,6,6,8,7,3,0,9,5]
*/

package LinkedList;

public class SwappingNodesOfLL {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }     // end of class Node

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static int counter(Node head){
        int counter = 0;
        for (Node p = head; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }      // end of display() method

    public static Node swapNodes(Node head, int k) {
        int counter = counter(head);
        int lastCounter = counter-k+1, count = 1, count2 = 1;
        // counter is kth node from beginning of list, and lastCounter is kth node from end of list
        Node p = head;
        Node q = head;
        while (p!=null){
            if (count==k){
                while (q!=null){
                    if (count2==lastCounter){
                       int temp = p.val;
                       p.val = q.val;
                       q.val = temp;
                       break;
                    }
                    q = q.next;
                    count2++;
                }
            }
            p = p.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args) {

        Node list1 = new Node(7);
        Node p = list1;
        p.next = new Node(9);
        p = p.next;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(8);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(0);
        p = p.next;
        p.next = new Node(9);
        p = p.next;
        p.next = new Node(5);
        p = p.next;

        display(list1);
        Node a = swapNodes(list1, 5);
        display(a);


    }
}

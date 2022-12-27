/**
                                Problem Description
 You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
 For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
 Return the head of the modified linked list.

 Example: 01
 Input: head = [0,3,1,0,4,5,2,0]
 Output: [4,11]
 Explanation:
 The above figure represents the given linked list. The modified list contains
 - The sum of the nodes marked in green: 3 + 1 = 4.
 - The sum of the nodes marked in red: 4 + 5 + 2 = 11.

 Example: 02
 Input: head = [0,1,0,3,0,2,2,0]
 Output: [1,3,4]
 Explanation:
 The above figure represents the given linked list. The modified list contains
 - The sum of the nodes marked in green: 1 = 1.
 - The sum of the nodes marked in red: 3 = 3.
 - The sum of the nodes marked in yellow: 2 + 2 = 4.
 */

package LinkedList;

public class MergeNodesInBetweenZeros {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }       // end of class Node

    public static Node mergeNodes(Node head) {
        Node p = head;
        Node start = new Node(0);
        Node q = start;
        while(p!=null){
            int sum = 0;
            while (p.val!=0){
                sum += p.val;
                p = p.next;
            }
            q.next = new Node(sum);
            q = q.next;
            p = p.next;
        }
        start = start.next.next;
        return start;
    }
    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node start = new Node(0);
        Node p = start;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(0);
        p = p.next;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(0);
        p = p.next;
//        display(start);

        display(start);
        Node a = mergeNodes(start);
        display(a);
    }
}

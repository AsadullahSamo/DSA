/**
            Problem Description
 In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

 For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
 The twin sum is defined as the sum of a node and its twin.

 Given the head of a linked list with even length, return the maximum twin sum of the linked list.

 Example: 01
 Input: head = [5,4,2,1]
 Output: 6
 Explanation: Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
 There are no other nodes with twins in the linked list.
 Thus, the maximum twin sum of the linked list is 6.

 Example: 02
 Input: head = [4,2,2,3]
 Output: 7
 Explanation:
 The nodes with twins present in this linked list are:
 - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
 - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
 Thus, the maximum twin sum of the linked list is max(7, 4) = 7.

 Example: 03
 Input: head = [1,100000]
 Output: 100001
 Explanation:
 There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
 */

package LinkedList;

public class TwinSum {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }       // end of class Node

    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static int pairSum(Node head) {

        Node slow = head, fast = head;
        // get MiddleNode
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middleNode = slow;

        // reverse MiddleNode
        Node current = middleNode;
        Node prev = null, next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        int maxSum = 0, sum = 0;
        while(prev!=null){
            sum = prev.data + head.data;
            head = head.next;
            prev = prev.next;
            if (sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        Node start = new Node(5);
        Node p = start;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(1);
        p = p.next;

        System.out.println(pairSum(start));
    }       // end of main() method
}           // end of program

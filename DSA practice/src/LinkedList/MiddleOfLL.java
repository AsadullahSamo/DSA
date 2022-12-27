/**
                Problem Description
 Given the head of a singly linked list, return the middle node of the linked list.
 If there are two middle nodes, return the second middle node.

 Example: 01
 Input: head = [1,2,3,4,5]
 Output: [3,4,5]
 Explanation: The middle node of the list is node 3.

 Example: 02
 Input: head = [1,2,3,4,5,6]
 Output: [4,5,6]
 Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
*/

package LinkedList;

public class MiddleOfLL {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }       // end of class Node
    public static Node middleNode(Node head) {
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }      // end of middleNode() method
    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
    }

    public static void main(String[] args) {

        Node start = new Node(1);
        Node p = start;
        for (int i=2; i<=4; i++){
            p.next = new Node(i);
            p =p.next;
        }


        display(start);
        System.out.println();
        System.out.println(middleNode(start).data);
    }
}

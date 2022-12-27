/**
                Problem Description
 */

package LinkedList;

public class RemoveNodesFromLL {

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

    public static Node removeNodes(Node head) {

        return head;
    }      //  end of removeNodes() method

    public static void main(String[] args) {

        Node start = new Node(5);
        Node p = start;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(13);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(8);
        p = p.next;
        display(start);

        Node a = removeNodes(start);
        display(a);
    }
}

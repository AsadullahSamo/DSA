package LinkedList;

public class SwapNodesInPairs {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val =val;
        }
    }     // end of class Node

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }         // end of display() method

    public static int counter(Node head){
        int counter = 0;
        for (Node p = head; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }         // end of display() method
    public static Node swapPairs(Node head) {
        int counter = counter(head);
        System.out.println("Counter is "+counter);
        if (head==null || head.next==null){
            return head;
        }
        Node p = head;

        if (counter%2==0) {
            while (p != null) {
                int temp = p.val;
                p.val = p.next.val;
                p.next.val = temp;
                p = p.next.next;
            }   // end of while loop
        } else if (counter%2!=0){
            while (p.next!= null) {
                int temp = p.val;
                p.val = p.next.val;
                p.next.val = temp;
                p = p.next.next;
            }   // end of while loop
        }
        return head;
    }     // end of swapPairs() method

    public static void main(String[] args) {

        Node start = new Node(1);
        Node p = start;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        display(start);
        Node a = swapPairs(start);
        display(a);
    }      // end of main() method
}         //  end of program

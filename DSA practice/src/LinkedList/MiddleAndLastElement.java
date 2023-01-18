package LinkedList;

public class MiddleAndLastElement {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }       // end of class Node

    public static int middleElement(Node head) {
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }      // end of middleNode() method

    public static int lastElement(Node head) {
        int lastElement = 0;
        for (Node p=head; p!=null; p=p.next){
            if (p.next==null);   {
                lastElement = p.data;
            }
        }
        return lastElement;
    }      // end of middleNode() method

    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node start = new Node(1);
        Node p = start;
        for (int i=2; i<=5; i++){
            p.next = new Node(i);
            p =p.next;
        }

        display(start);
        System.out.println(middleElement(start));
        System.out.println(lastElement(start));
    }
}

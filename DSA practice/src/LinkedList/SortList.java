package LinkedList;

public class SortList {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }

    public static Node sortList(Node head) {
        if (head==null){
            return head;
        }
        Node q = head, p = head;
        for (p = head; p!=null; p=p.next) {
            for (q = p; q != null; q = q.next){
                if (q.val < p.val) {
                    int temp = q.val;
                    q.val = p.val;
                    p.val = temp;
                }
            }
        }
        return head;
    }


    public static void main(String[] args) {

        Node head = new Node(4);
        Node p = head;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
//        p.next = new Node(0);
//        p = p.next;
//        p.next = new Node(1);
//        p = p.next;
        display(head);
        Node a = sortList(head);
        display(a);
    }
}

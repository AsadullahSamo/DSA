package LinkedList;

public class Insertion {
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }      // end of class Node

    public static void display(Node start){
        Node p = start;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
    }    // end of display() method

//    public static void insert(Node start, int target){
//        Node p = start;
//        while (p.next!=null){
//            if (p.next.data>target){
//                break;
//            }
//            p = p.next;
//        }
//        Node q = new Node(target);
//        q.next = p.next;
//        p.next = q;
//    }  // end of insert() method

    public static Node insert(Node start, int target){
        Node p = start;
        if (start==null || start.data>target){
            start = new Node(target);
            start.next = p;
        }
        return start;
    } // end of insert() method

    public static void main(String[] args) {

        Node start = new Node(4);
        Node p = start;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(8);
        p = p.next;

//        insert(start, 5);
//        insert(start, 7);
//        insert(start, 6);
        Node a = insert(start, 3);
        Node b = insert(start, 2);

        display(a);
        display(b);


    }    // end of main() method
}       //  end of program

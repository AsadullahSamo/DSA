/** Lecture 10 Work */
package LinkedList;

public class InsertionAndDeletion {

    static class Node{
        Node next;
        int data;
        public Node(){

        }
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }      // end of class Node

    public static void displayList(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }      // end of displayList() method

    // Insertion in between first and last node (Prerequisite: Sorted List)
    public static void insert(Node start, int x){
        Node p = start;
        while (p.next!=null){
            if (p.next.data>x){
                break;
            }
            p = p.next;     // Update Condition of while loop
        }      // end of while loop
        Node q = new Node(x);
        q.next = p.next;
        p.next = q;
    }      // end of insert

    // Insertion before first (if target<first || list is null)  (Prerequisite: Sorted List)
//    public static Node insert(Node start, int x){
//        Node p = start;
//        if (start==null || start.data>x) {
//            start = new Node(x);
//            start.next = p;
//        }
//        return start;
//    }

    // Delete Node from LL
    public static Node delete(Node start, int x){
        if (start.data>x || start==null){
            return start;
        }
        if (start.data==x){
            start = start.next;
            return start;
        }
        for (Node p=start; p.next!=null; p=p.next){
            if (p.next.data>x){
                break;
            }
            if (p.next.data==x){
                p.next = p.next.next;
                break;
            }
        }       // end of for loop
        return start;
    }

    public static void main(String[] args) {

        Node start = new Node(4);
        Node p = start;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(8);
        p = p.next;
        p.next = new Node(10);
        p = p.next;

        displayList(start);
        insert(start, 2);
        insert(start, 7);
        insert(start, 5);
        insert(start, 6);
        displayList(start);
//        displayList(start);

        delete(start, 6);
        delete(start, 8);
//        displayList(a);
    }       // end of main() method
}          //  end of program

package LinkedList;

public class ImplementationAndTraversal {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }    // end of class Node

    public static void main(String[] args) {

        Node start = new Node(11);
//        start.next = new Node(22);              // This is not feasible
//        start.next.next = new Node(33);
//        start.next.next.next = new Node(44);
        Node p = start;
//        p.next = new Node(22);           // Repeating statement so can be used in Loop
//        p = p.next;
//        p.next = new Node(33);
//        p = p.next;

        // Inserting data into LL
        for (int i=2; i<=5; i++){
            p.next = new Node(i*11);
            p = p.next;
        }       // to insert data in node

        int counter = 0;
        // Traversing OR retrieving data
        for (p = start; p!=null; p=p.next){
            System.out.print(p.data+" ");
            counter++;
        }   // end of for loop
        System.out.println("\nLoop runs "+counter+" times");

    }     // end of main() method
}        // end of program

/**
                Problem Description
 Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

 The first node is considered odd, and the second node is even, and so on.

 Example: 01
 Input: head = [1,2,3,4,5]
 Output: [1,3,5,2,4]

 Example: 02
 Input: head = [2,1,3,5,6,4,7]
 Output: [2,3,6,7,1,5,4]
 */

package LinkedList;

public class OddEvenLL {

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
    }         // end of counter() method

    public static Node oddEvenPair(Node head){

        Node p = head;
        Node q = new Node(1);
        Node r = q;
        Node s = new Node(2);
        Node t = s;
        int count = 1;
        display(p);
        int counter = counter(head);
        System.out.println("Counter is "+counter);

        for (p=head; p!=null; p=p.next){
                if (count % 2 == 0) {
                    r.next = new Node(p.val);
                    r = r.next;
                    count++;
                }
                else if(count%2!=0){
                    t.next = new Node(p.val);
                    t = t.next;
                    count++;
                }
            }

        display(q.next);
        display(s.next);
        counter = counter(s.next);
        count = 1;
        for (p = s.next; p!=null; p =p.next){
            if (count==counter){
                p.next = q.next;
            }
            count++;
        }
        return s.next;
    }     // end of oddEvenPair() method


    public static void main(String[] args) {

        Node start = new Node(2);
        Node p = start;
//        p.next = new Node(2);
//        p = p.next;
//        p.next = new Node(3);
//        p = p.next;
//        p.next = new Node(4);
//        p = p.next;
//        p.next = new Node(5);
//        p = p.next;
//        p.next = new Node(4);
//        p = p.next;
//        p.next = new Node(7);
//        p = p.next;
        display(start);
        Node a = oddEvenPair(start);
        display(a);


    }    // end of main() method
}        // end of program

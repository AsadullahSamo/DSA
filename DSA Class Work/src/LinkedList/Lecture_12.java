/**
        Lecture 12
        copy(), concat(), replace(), deleteLastNode()
 */

package LinkedList;

public class Lecture_12 {
    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }        // end of class Node

    public static void display(Node head){
        for (Node p=head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }       // end of display() method

    public static Node copy(Node head){
        Node p = head;
        Node q = new Node(p.val);
        Node temp = q;
        Node start = p;
        start = start.next;
        while(start!=null){
            temp.next = new Node(start.val);
            start = start.next;
            temp = temp.next;
        }    // end of while loop
        return q;
    }

    public static Node concat(Node p, Node q){
        Node start = p, i;
        for (i=start.next; i!=null; i=i.next){}
            i.next = q;
            return start;
    }       // end of concat() method

    public static Node deleteLastNode(Node head){
        Node p = head;
        while (p.next!=null){
            p = p.next;
            if (p.next.next==null){
                p.next = null;
            }
        }
        return head;
    }
    public static Node replace(Node list, int pos, int num){
        int counter = 1;
        Node p = list;
        while (p.next!=null) {
            if (counter == pos) {
                p.val = num;
                break;
            }
            p = p.next;
            counter++;
        }   // end of while loop
        return list;
    }
    public static void main(String[] args) {

            Node start = new Node(1);
            Node p = start;
            for (int i=2; i<=7; i++){
                p.next = new Node(i);
                p = p.next;
            }

            Node list2 = new Node(10);
            p = list2;
            for (int i=11; i<=17; i++){
                p.next = new Node(i);
                p = p.next;
            }

            display(start);
            Node q = copy(start);
            display(q);
//          Node a = concat(start, list2);
//          display(a);
          Node b = replace(list2, 3, -9);
          display(b);
          Node c = deleteLastNode(start);
          display(c);
          c = deleteLastNode(start);
          display(c);
        }       // end of main() method
    }          //  end of program

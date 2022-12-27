/**
                    Problem Description
 Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 Return the decimal value of the number in the linked list.

 Example: 01
 Input: head = [1,0,1]
 Output: 5
 Explanation: (101) in base 2 = (5) in base 10

 Example: 02
 Input: head = [0]
 Output: 0
 */

package LinkedList;

public class ConversionOfBinaryNumberInLLToInteger {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }     // end of class Node

    public static int getDecimalValue(Node head) {
        Node p;
        int counter = 0;
        for (p=head; p!=null; p=p.next){
            counter++;
        }
        int sum = 0;
        for (p=head; p!=null; p=p.next){
            if(p.data==0){
                sum += 0;
            } else {
                sum += Math.pow(2, counter-1);
            }
            counter--;
        }
        return sum;
    }

    public static void main(String[] args) {

        Node start = new Node(1);
        Node p = start;
        p.next = new Node(0);
        p = p.next;
        p.next = new Node(1);
        p = p.next;

        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.print("in binary = ");
        System.out.println(getDecimalValue(start));

        Node head = new Node(1);
        Node p1 = head;
        p1.next = new Node(1);
        p1 = p1.next;
        p1.next = new Node(1);
        p1 = p1.next;
        p1.next = new Node(0);
        p1 = p1.next;
        p1.next = new Node(0);
        p1 = p1.next;
        p1.next = new Node(1);
        p1 = p1.next;
        for (p=head; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.print("in binary = ");
        System.out.println(getDecimalValue(head));

    }
}

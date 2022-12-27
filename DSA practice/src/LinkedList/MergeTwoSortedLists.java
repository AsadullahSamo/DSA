/**
            Problem Description
 You are given the heads of two sorted linked lists list1 and list2.
 Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 Return the head of the merged linked list.

 Example: 01
 Input: list1 = [1,2,4], list2 = [1,3,4]
 Output: [1,1,2,3,4,4]

 Example: 02
 Input: list1 = [], list2 = []
 Output: []

 Example: 03
 Input: list1 = [], list2 = [0]
 Output: [0]
 */

package LinkedList;

public class MergeTwoSortedLists {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
        public Node(){ }

    }     // end of class Node

    public static void display(Node start){
        Node p;
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }   // end of display() method

    public static int counter(Node start){

        int counter = 0;
        if (start==null){
            return 0;
        }
        for (Node p=start; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node p, q;
        int counter = counter(list1);
        int count = 0;
        if (list1==null){
            for (p = list2; p != null; p = p.next) {
                q = p.next;
                while (q!=null){
                    if (q.data<=p.data){
                        int temp = q.data;
                        q.data = p.data;
                        p.data = temp;
                        break;
                    }
                    q = q.next;
                }
            }
            return list2;
        }

        else {
            System.out.println("Counter is " + counter);
            for (p = list1; p != null; p = p.next) {
                if (count == counter - 1) {
                    p.next = list2;
                }
                count++;
            }


            for (p = list1; p != null; p = p.next) {
                q = p.next;
                while (q != null) {
                    if (q.data <= p.data) {
                        int temp = q.data;
                        q.data = p.data;
                        p.data = temp;
                    }
                    q = q.next;
                }
            }
        }
        return list1;
    }      // end of mergeTwoLists() method

    public static void main(String[] args) {

        Node list1 = new Node(-10);
        Node p = list1;
        p.next = new Node(-10);
        p = p.next;
        p.next = new Node(-9);
        p = p.next;
        p.next = new Node(-4);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(6);
        p = p.next;

        Node list2 = new Node(-7);
        p = list2;
        display(list1);
        display(list2);

        Node a = mergeTwoLists(list1, list2);
        display(a);

//        Node list3 = new Node();
//        Node list4 = new Node(0);
//        Node b = mergeTwoLists(list3, list4);
//        display(b);

    }
}

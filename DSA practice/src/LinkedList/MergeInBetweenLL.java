/**
                        Problem Description
 You are given two linked lists: list1 and list2 of sizes n and m respectively.
 Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

 Example: 01
 Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
 Output: [0,1,2,1000000,1000001,1000002,5]
 Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place

 Example: 02
 Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
 Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
 */

package LinkedList;

public class MergeInBetweenLL {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }     // end of class Node

    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static int counter(Node head){
        int counter = 0;
        for (Node p = head; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }       // end of counter() method

    public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
        Node p;
        int counter = counter(list2)+a;
        int count = 0, count2 = 0;

        Node r = new Node(0);
        Node q = r;

        // to get list from node b
        for (p = list1; p!=null; p=p.next){
            if(p.val>b){
                q.next = new Node(p.val);
                q = q.next;
            }
        }

        for (p = list1; p.next!=null; p=p.next){
            // if reached at node point a then connect to list2
            if (count2==a-1){
                p.next = list2;
            }
            // when list2 becomes null connect it to rest of list1 starting from node b
            if (count==counter-2){
                p.next.next = r.next;
            }
            count++;
            count2++;
        }
        return list1;
    }      // end of mergeInBetween() method

    public static void main(String[] args) {

        Node list1 = new Node(0);
        Node p = list1;
//        p.next = new Node(1);
//        p = p.next;
        for (int i=1; i<=6; i++){
            p.next = new Node(i);
            p = p.next;
        }      // end of for loop
//        p.next = new Node(4);
//        p = p.next;
//        p.next = new Node(5);
//        p = p.next;
        display(list1);

        Node list2 = new Node(1000000);
        p = list2;
        for (int i=1000001; i<=1000004; i++){
            p.next = new Node(i);
            p = p.next;
        }     // end of for loop
        display(list2);

        Node a = mergeInBetween(list1, 2, 5, list2);
        display(a);

    }      // end of main() method
}         //  end of program

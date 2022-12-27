/**
            Problem Description
 Given the head of a singly linked list, return true if it is a palindrome or false otherwise

 Example: 01
 Input: head = [1,2,2,1]
 Output: true

 Example: 02
 Input: head = [1,2]
 Output: false
*/

package LinkedList;

public class PalindromeLL {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }       // end of class Node



    public static boolean isPalindrome(Node head) {
        Node slow = head, fast = head;
        // get Middle Node
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middleNode = slow;

        // reverse middleNode, and now it will look like this
//        1 -> 2  null <- 2 <-1
        //        1 -> 2  null <-3 <- 2 <-1
        Node current = middleNode;
        Node prev = null, next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
            while (prev!=null){
                if (head.data!=prev.data){
                    return false;
                }
                head = head.next;
                prev = prev.next;
            }
        return true;
    }
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
        p.next = new Node(2);
        p = p.next;
//        p.next = new Node(3);
//        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(1);
        p = p.next;

        display(start);
        System.out.println(isPalindrome(start));
    }
}

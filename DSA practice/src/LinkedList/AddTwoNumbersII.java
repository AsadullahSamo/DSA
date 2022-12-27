/**
                Problem Description
 You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example: 01
 Input: l1 = [7,2,4,3], l2 = [5,6,4]
 Output: [7,8,0,7]

 Example: 02
 Input: l1 = [2,4,3], l2 = [5,6,4]
 Output: [8,0,7]

 Example: 03
 Input: l1 = [0], l2 = [0]
 Output: [0]
 */

package LinkedList;

public class AddTwoNumbersII {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }       // end of class ListNode

    public static void display(ListNode start) {
        for (ListNode p = start; p != null; p = p.next) {
            System.out.print(p.val + "  ");
        }
        System.out.println();
    }       // end of display() method

    public static ListNode reverseLL(ListNode head) {
        ListNode current = head, prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static int counter(ListNode head) {
        int counter = 0;
        for (ListNode p = head; p != null; p = p.next) {
            counter++;
        }
        return counter;
    }     // end of counter() method

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        System.out.println("This is from method");
        ListNode reverseFirstList = reverseLL(l1);
        ListNode reverseSecondList = reverseLL(l2);
        ListNode r = new ListNode(1);
        ListNode s = r;

        ListNode p = reverseFirstList, q = reverseSecondList;
        int counter1 = counter(reverseFirstList);
        int counter2 = counter(reverseSecondList);

        if (counter1>counter2) {
            while (q != null) {
                if (p.val + q.val >= 10) {
                    p.next.val += 1;
                    s.next = new ListNode((p.val+q.val)%10);
                } else {
                    s.next = new ListNode(p.val + q.val);
                }
                s = s.next;
                p = p.next;
                q = q.next;
                s.next = new ListNode(p.val);
            }     // end of while loop
            while (p!=null) {
                if (p.val >= 10 && p.next!=null) {
                    p.next.val +=1;
                    s.next = new ListNode(p.val%10);
                } else if (p.val < 10 && p.next!=null){
                    s.next = new ListNode(p.val);
                }

                if (p.val >= 10 && p.next==null) {
                    int lastRemainder;
                    if (p.val==10){
                        lastRemainder = 1;
                    } else {
                        lastRemainder = p.val%10;
                    }
                    s.next = new ListNode(p.val%10);
                    s = s.next;
                    s.next = new ListNode(lastRemainder);
                } else if (p.val < 10 && p.next==null){
                    s.next = new ListNode(p.val);
                }
                s = s.next;
                p = p.next;
            }
        } else if (counter2>counter1){
            while (p != null) {
                if (p.val + q.val >= 10) {
                    q.next.val += 1;
                    s.next = new ListNode((p.val+q.val)%10);
                } else {
                    s.next = new ListNode(p.val + q.val);
                }
                s = s.next;
                p = p.next;
                q = q.next;
                s.next = new ListNode(q.val);
            }     // end of while loop
            while (q!=null) {
                if (q.val >= 10 && q.next!=null) {
                    q.next.val +=1;
                    s.next = new ListNode(q.val%10);
                } else if (q.val < 10 && q.next!=null){
//                    s = s.next;
                    s.next = new ListNode(q.val);
                }

                if (q.val >= 10 && q.next==null) {
                    int lastRemainder;
                    if (q.val==10){
                        lastRemainder = 1;
                    } else {
                        lastRemainder = q.val%10;
                    }
                    s.next = new ListNode(q.val%10);
                    s = s.next;
                    s.next = new ListNode(lastRemainder);
                } else if (q.val < 10 && q.next==null){
                    s.next = new ListNode(q.val);
                }
                s = s.next;
                q = q.next;
            }
        } else if (counter1==counter2) {
            while (p != null) {
                if (p.val + q.val >= 10 && p.next!=null) {
                    p.next.val += 1;
                    s.next = new ListNode((p.val+q.val)%10);

                } else if (p.next!=null && p.val+q.val<10){
                    s.next = new ListNode(p.val + q.val);
                }

                if (p.val + q.val >= 10 && p.next==null) {
                    s.next = new ListNode((p.val+q.val)%10);
                    s = s.next;
                    s.next = new ListNode(1);
                } else if (p.next==null && p.val+q.val<10){
                    s.next = new ListNode(p.val + q.val);
                    s = s.next;
                }
                s = s.next;
                p = p.next;
                q = q.next;
            }     // end of while loop
        }    // end of if else
        return reverseLL(r.next);
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(9);
        ListNode p = list1;
//        p.next = new ListNode(9);
//        p = p.next;
//        p.next = new ListNode(9);
//        p = p.next;
//        p.next = new ListNode(3);
//        p = p.next;
//        p.next = new ListNode(3);
//        p = p.next;

        ListNode list2 = new ListNode(9);
        p = list2;
        p.next = new ListNode(9);
        p = p.next;
        p.next = new ListNode(9);
        p = p.next;
//
//        p.next = new ListNode(9);
//        p = p.next;
//        p.next = new ListNode(9);
//        p = p.next;

        display(list1);
        display(list2);
        ListNode a = addTwoNumbers(list1, list2);
        display(a);
//        System.out.println(11%10);
    }
}

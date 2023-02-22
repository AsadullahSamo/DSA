package Stacks;

import java.util.Stack;

public class PalindromeLL {

    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    public static boolean isPalindrome(Node head){
        Stack<Integer> linkedList = new Stack<>();
        for (Node p=head; p!=null; p=p.next){
            if (linkedList.isEmpty()){
                linkedList.push(p.val);
            } else if(p.val==linkedList.peek()){
                linkedList.pop();
            } else {
                linkedList.push(p.val);
            }
            System.out.println(linkedList);
        }
        if(head.next==null){
            return true;
        }

        return linkedList.isEmpty();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node p = head;
        int [] array = {2, 2, 1};
        for (int i=0; i< array.length; i++){
            p.next = new Node(array[i]);
            p = p.next;
        }

        System.out.println(isPalindrome(head));
    }      // end of main()
}

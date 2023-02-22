package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveNodesFromLL {

    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }
    public static Node removeNodes(Node head) {
        Node p = head;
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(head.val);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (p=head.next; p!=null; p=p.next){
            if (stack1.isEmpty()) {
                stack1.push(p.val);
            }
            else if (p.val>stack1.peek()){
                while (!stack1.isEmpty()){
                    stack1.pop();
                }
                arrayList.add(p.val);
            } else {
                stack1.push(p.val);
            }
//            System.out.println("Stack1: "+stack1);
//            System.out.println("ArrayList: "+arrayList);
        }

        if (arrayList.size()==0){
            while (!stack1.isEmpty()){
                arrayList.add(0, stack1.peek());
                stack1.pop();
            }
        }

        Node start = new Node(arrayList.get(0));
        p = start;
            for (int i=1; i<arrayList.size(); i++){
                p.next = new Node(arrayList.get(i));
                p = p.next;
            }
        return start;
    }      // end of removeNodes()

    public static void main(String[] args) {

        Node head = new Node(5);
        int [] arr = {2, 13, 3, 8};
        Node p = head;
        for (int i=0; i< arr.length; i++){
            p.next = new Node(arr[i]);
            p = p.next;
        }

        System.out.println(removeNodes(head));

    }
}

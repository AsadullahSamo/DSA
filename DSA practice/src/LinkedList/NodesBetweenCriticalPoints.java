package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class NodesBetweenCriticalPoints {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        for (Node p=head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }
    public static int count(Node head){
        int count = 0;
        for (Node p=head; p!=null; p=p.next){
            count++;
        }
        return count;
    }
    public static int[] nodesBetweenCriticalPoints(Node head) {
        int [] arr = new int[2];
        int counter = 2;
        int count = count(head);
//        System.out.println("Count is "+count);
        if (count<3){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Node p=head, q = head.next; q.next!=null; q=q.next, p=p.next){
            if (q.val<p.val && q.val<q.next.val || q.val>p.val && q.val>q.next.val){
                arrayList.add(counter);
            }
                counter++;
        }
        System.out.println("Arraylist is "+arrayList);
        System.out.println("Size is "+arrayList.size());
        if (arrayList.size()==1 || arrayList.size()==0){
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }

        int maxDistance = arrayList.get(1) - arrayList.get(0);
        int minDistance = arrayList.get(1) - arrayList.get(0);
        for (int i=0; i<arrayList.size()-1; i++){
                minDistance = Math.min(minDistance, arrayList.get(i+1) - arrayList.get(i));
                maxDistance = Math.max(maxDistance, arrayList.get(i+1) - arrayList.get(0));
        }
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        Node p = head;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
//        p.next = new Node(2);
//        p = p.next;
//        p.next = new Node(7);
//        p = p.next;
        display(head);
        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(head)));
    }
}

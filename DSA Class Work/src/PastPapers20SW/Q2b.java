package PastPapers20SW;

class Node{
    Node next;
    int val;
    public Node(int val){
        this.val = val;
    }

    public boolean search(Node head, int val){
        for (Node p=head; p!=null; p=p.next){
            if (p.val==val)
                return true;
        }
        return false;
    }    // end of search()

    public int sum(Node head){
        int sum = 0;
        for (Node p=head; p!=null; p=p.next){
            sum += p.val;
        }
        return sum;
    }  // end of sum()

    public Node merge(Node list1, Node list2){
        Node p = list1;
        for (p=list1; p.next!=null; p=p.next){

        }  // end of for loop
        p.next = list2;
        return list1;
    }   // end of merge()

    public void print(Node head){
        for (Node p=head; p!=null; p=p.next){
            if (p.next==null)
                System.out.println(p.val+" -> null");
            else
                System.out.print(p.val+" -> ");
        }
    }   //  end of print()
}    // end of class Node

public class Q2b {
    public static void main(String[] args) {

        // List 1
        int [] array = {4, 15, 6, 7, 12, 36};
        Node list1 = new Node(array[0]);
        Node p = list1;
        for (int i=1; i<array.length; i++){
            p.next = new Node(array[i]);
            p = p.next;
        }

        // List 2
        int [] array2 = {3, 10, 4, 50};
        Node list2 = new Node(array2[0]);
        p = list2;
        for (int i=1; i<array2.length; i++){
            p.next = new Node(array2[i]);
            p = p.next;
        }

        list1.print(list1);
        list2.print(list2);

        System.out.println(list1.sum(list1));
        System.out.println(list2.search(list2, 10));

        Node a = list1.merge(list1, list2);
        a.print(a);

    }
}

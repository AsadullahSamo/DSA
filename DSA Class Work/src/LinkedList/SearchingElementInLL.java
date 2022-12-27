/** Lecture 10 Homework */
package LinkedList;

public class SearchingElementInLL {

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }     // end of class Node

    public static void display(Node start){
        Node p;
        System.out.print("List is: ");
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }

    public static void search(Node start, int target){
        boolean flag = false;
        Node p = start;
        int counter = 1;
        for (p=start; p!=null; p=p.next){
            if (target==p.data){
                flag = true;
                break;
            }
            counter++;
        }
        if (flag){
            System.out.println(target+" found at position "+counter);
        } else {
            System.out.println(target+" not found");
        }
    }       // end of search() method

    public static void main(String[] args) {

        Node start = new Node(2);
        Node p = start;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(15);
        p = p.next;
        p.next = new Node(17);
        p = p.next;

        display(start);
        search(start, 5);
        search(start, -5);
        search(start, 25);
        search(start, 17);
        search(start, 4);
    }        // end of main() method
}           //  end of program

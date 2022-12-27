/** Lecture 08 Homework */
package LinkedList;
public class SumAndAvg {
    public static void display(Node start){
        Node p;
        System.out.print("List is: ");
        for (p=start; p!=null; p=p.next){
            System.out.print(p.data+"  ");
        }
        System.out.println();
    }
    public static int sum(Node start){
        Node p;
        int sum = 0;
        for (p=start; p!=null; p = p.next){
            sum += p.data;
        }
        System.out.print("Sum is ");
        return sum;
    }   // end of sum()
    public static float avg(Node start){
        Node p;
        int sum = 0, counter = 0;
        float avg = 0;
        for (p=start; p!=null; p = p.next){
            sum += p.data;
            counter++;
        }
        avg = (float)sum/counter;
        System.out.print("Average is ");
        return avg;
    }       // end of avg()
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }     // end of class Node

    public static void main(String[] args) {

        Node start = new Node(2);
        Node p = start;

        // Inserting Data
        for (int i=2; i<=5; i++){
            p.next = new Node(i*2);
            p = p.next;
        }
        display(start);
       System.out.println(sum(start));
        System.out.println(avg(start));

        Node head = new Node(2);
        p = head;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(-6);
        p = p.next;
        p.next = new Node(15);
        p = p.next;
        p.next = new Node(0);
        p = p.next;

        display(head);
        System.out.println(sum(head));
        System.out.println(avg(head));

    }
}

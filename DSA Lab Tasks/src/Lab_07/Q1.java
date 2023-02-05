package Lab_07;

import java.util.Scanner;

class Node{
    Node next;
    String str;
    public Node(String str){
        this.str = str;
    }  // end of constructor
}    // end of class Node

class FireAir{

    public void print(Node head){
        for (Node p = head; p!=null; p=p.next){
            if (p.next==null)
                System.out.print(p.str+" -> null");
            else
                System.out.print(p.str+" -> ");
        }     // end of for loop
        System.out.println();
    }    // end of print()

    public int length(Node head){
        int count = 0;
        for (Node p = head; p!=null; p=p.next){
            count++;
        }
        return count;
    }     // end of length()


    public Node add(Node head){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position from 1 to "+(length(head)+1)+" : ");
        int pos = sc.nextInt();
        String s = sc.nextLine();
        System.out.print("Enter value: ");
        String string  = sc.nextLine();
        Node node = new Node(string);

        Node p = head;

        int length = length(head);

        // insertion at beginning
        if (pos == 1) {
            node.next = head;
            head = node;
            // insertion at end
        } else if (pos==length+1){
            for (p = head; p.next!=null; p=p.next){

            }   // end of for loop
            p.next = node;
            // insertion in middle
        } else {
            int count = 1;
            for (p = head; p.next!=null; p=p.next){
                if (count==pos-1){
                    node.next = p.next;
                    p.next = node;
                }
                count++;
            }    // end of for loop
        }       // end of if else

        System.out.println("Song added at position "+pos);
        return head;
    }    // end of add() method

    public Node delete(Node head){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position from 1 to "+length(head)+" : ");
        int pos = sc.nextInt();


        int length = length(head);
        Node p = head;

        if (pos==1){
            head = p.next;
        }
        else if (pos==length){
            for (p = head; p.next.next!=null; p=p.next){

            }
            p.next = null;
        }
        else {
            int count = 1;
            for (p = head; p!=null; p=p.next){
                if (pos==count+1){
                    p.next = p.next.next;
                }
                count++;
            }

        }   // end of if else
        System.out.println("Song deleted from position "+pos);
        return head;
    }    // end of delete()
    public void search(Node head){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name to search: ");
        String target = sc.nextLine();
        int pos = 1;
        for (Node p = head; p!=null; p=p.next){
            if (p.str.equals(target)){
                flag = true;
                break;
            }
            pos++;
        }
        if (flag)
            System.out.println("Song found at position "+pos);
        else
            System.out.println("Song not found");
    }     // end of search() method

}   // end of class FireAir

public class Q1 {

    public static void choices(){
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Display");
        System.out.println("2. Insert");
        System.out.println("3. Delete");
        System.out.println("4. Search");
    }   // end of choices method

    public static void main(String[] args) {

        FireAir fireAir = new FireAir();

        Node start = new Node("Days Go by");
        Node p = start;
        p.next = new Node("Tennis Court");
        p = p.next;
        p.next = new Node("Applause");
        p = p.next;



        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do{
            choices();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> fireAir.print(start);
                case 2 -> start = fireAir.add(start);
                case 3 -> start = fireAir.delete(start);
                case 4 -> fireAir.search(start);
            }
        }while (choice!=0);






    }      // end of main() method
}         //  end of program

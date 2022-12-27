package LinkedList;

import java.util.Arrays;

public class SpiralMatrix {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }      // end of class Node
    public static void display(Node start){
        for (Node p=start; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }      // end of display() method

    public static int counter(Node start){
        int counter = 0;
        for (Node p=start; p!=null; p=p.next){
            counter++;
        }
        return counter;
    }      // end of counter() method

    public static int[][] spiralMatrix(int m, int n, Node head) {

        int [][] spiralMatrixArray = new int[m][n];
        int i = 0, j=0;
        int length = m*n, counter = 0;
        Node p = head;
//        for (Node p=head; p!=null; p=p.next) {
        while (j < n) {
            if (p == null) {
                spiralMatrixArray[i][j] = -1;
            } else {
                spiralMatrixArray[i][j] = p.val;
                p = p.next;
            }
            j++;
            counter++;
        }      // end of while loop
        i++;
        j--;
        while(i<m) {
            if (p == null){
                spiralMatrixArray[i][j] = -1;
            } else {
                spiralMatrixArray[i][j] = p.val;
                p = p.next;
            }
            i++;
            counter++;
        }       // end of while loop
        System.out.println("n is "+n);
        System.out.println("m is "+m);
        i--;
        j--;
        System.out.println("j is "+j);
        System.out.println("i is "+i);
        if (p == null && counter>=length) {
            return spiralMatrixArray;
        }
        while(n>1) {
            if (p == null) {
                spiralMatrixArray[i][j] = -1;
            } else {
                spiralMatrixArray[i][j] = p.val;
                p = p.next;
            }
            j--;
            n--;
            counter++;
        }        // end of while loop
        j++;
        i--;
        if (i<0 || p==null){
            return spiralMatrixArray;
        }
        while(j<m+1) {
            if (p == null) {
                spiralMatrixArray[i][j] = -1;
            } else {
                spiralMatrixArray[i][j] = p.val;
                p = p.next;
            }
            j++;
            counter++;
        }      // end of while loop

//        }
        return spiralMatrixArray;

    }        // end of spiralMatrix() method

    public static void main(String[] args) {

        Node start = new Node(3);
        Node p = start;
        p.next = new Node(0);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(8);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        p.next = new Node(7);
        p = p.next;
        p.next = new Node(9);
        p = p.next;
        p.next = new Node(4);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(0);
        p = p.next;


        display(start);
        System.out.println(Arrays.deepToString(spiralMatrix(3, 5, start)));

    }     // end of main() method
}        //  end of program

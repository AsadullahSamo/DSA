package Lab_06;

public class LinkedList{
    class Node{
        char val;
        Node next, prev;
        public Node(char val){
            this.val = val;
        }
    }     // end of class Node
    Node head = null, tail = null;

    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.val+"  ");
            current = current.next;
        }
    }    // end of display

    public void addNode(char val) {
        Node node = new Node(val);
        if (head == null) {
            //Both head and tail will point to newNode
            head = tail = node;
            //head's previous will point to null
            head.prev = null;
            //tail's next will point to null, as it is the last node of the list
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        tail.next = null;
    }    // end of addNode() method

    public void deleteByPosition(){

    }   // end of deletePosition() method

    public static void main(String [] args) {

        LinkedList l1 = new LinkedList();
        l1.addNode('c');
        l1.addNode('d');
        l1.addNode('e');
        l1.addNode('f');
        l1.display();


    }
}
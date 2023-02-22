package Lab_12;

public class Q1 {

    int size;
    Node root;
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }     //  end of class Node
    public boolean isEmpty(){
        return root==null;
    }
    public void addNode(int data){

        if (isEmpty()){
            Node newNode  = new Node(data);
            size++;
            return;
        }
        Node tempNode = root;
        while (data<=left){

        }
    }

    public static void main(String[] args) {



    }
}

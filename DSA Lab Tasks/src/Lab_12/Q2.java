package Lab_12;

public class Q2 {

    static class BST{
      Node root;

        static class Node{
            String val;
            Node left, right;
            public Node(String val){
                this.val =val;
            }
        }     // end of class Node

        public void insert(String val){
            root = insert(root, val);
        }
        public Node insert(Node root, String val){
            if (root==null){      // base condition to stop recursive call
                root = new Node(val);
                return root;
            }
            if (val.compareTo(root.val) < 0){
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }      // end of insert

        public void inOrder(){
            inOrder(root);
        }
        public void inOrder(Node root){
            if (root==null){      // base condition for recursive call
                return;
            }
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
}       // end of class BST
    
    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert("A");
        bst.insert("B");
        bst.insert("C");
        bst.insert("D");
        bst.insert("E");
        bst.insert("F");
        bst.insert("G");
        bst.insert("H");
        bst.insert("I");
        bst.insert("J");
        bst.insert("K");
        bst.insert("L");
        bst.insert("M");
        bst.insert("N");
        bst.insert("O");
        bst.insert("P");

        bst.inOrder();

    }
}




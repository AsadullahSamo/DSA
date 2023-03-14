package Trees;

class BST{
    Node root;

    static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val =val;
        }
    }     // end of class Node

    public void insert(int val){
        root = insert(root, val);
    }
    public Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if (val<root.val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }      // end of insert

    public void inOrder(){
        inOrder(root);
    }
    public Node search(Node root, int val){
        if (root==null || root.val == val){
            return root;
        }
        if (val < root.val){
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }        // end of method search()
    public void inOrder(Node root){
        if (root==null){      // base condition for recursive call
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}       // end of class BST
public class BinarySearchTree {

    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(6);
        bst.insert(8);
        bst.insert(22);
        bst.insert(3);
        bst.insert(7);
        bst.insert(5);
        bst.insert(12);
        bst.insert(10);
        bst.insert(9);
        bst.insert(20);
        bst.insert(35);
        bst.insert(40);
        bst.insert(42);

        bst.inOrder();


    }
}




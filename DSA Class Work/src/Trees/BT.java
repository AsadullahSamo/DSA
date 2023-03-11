package Trees;

import java.util.ArrayList;

public class BT {
    Object root;
    BT left, right;
    public BT(Object root){
        this.root = root;
    }    // end of one arg constructor
    public BT(Object root, BT left, BT right){
        this.root = root;
        this.left = left;
        this.right = right;
    }  // end of three args constructor
    // getters
    public Object getRoot() {
        return root;
    }
    public BT getLeft() {
        return left;
    }
    public BT getRight() {
        return right;
    }

    public boolean isLeaf(){
        return (this.left==null && this.right==null);
    }

    public String inOrder(){      // Left Root Right
        StringBuffer stringBuffer = new StringBuffer();
        if (left!=null)
            stringBuffer.append(left.inOrder() + " , ");
        stringBuffer.append(root);
        if (right!=null)
            stringBuffer.append(" , " + right.inOrder());
        return String.valueOf(stringBuffer);
    }   // end of inOrder()

    public String preOrder(){      // Root Left Right
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(root);
        if (left!=null)
            stringBuffer.append(" , "+ left.preOrder());
        if (right!=null)
            stringBuffer.append(" , " + right.preOrder());
        return String.valueOf(stringBuffer);

    }   // end of inOrder()

    public String postOrder(){      // Left Right Root
        StringBuffer stringBuffer = new StringBuffer();
        if (left!=null) {
            stringBuffer.append(left.postOrder() + " , ");
        }
        if (right!=null)
            stringBuffer.append(right.postOrder() + " , ");
        stringBuffer.append(root);
        return String.valueOf(stringBuffer);
    }   // end of inOrder()

    public ArrayList<Object> getArrayList(){
        String str = inOrder();       // Store inorder string into str
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!=' ' && str.charAt(i)!=','){
                arrayList.add(str.charAt(i));
            }
        }
        return arrayList;
    }    // end of getArrayList()
    public boolean search(Object value) {
        boolean inLeft = false, inRight = false;
        if (root == null){
            return false;
        }
        if (root.equals(value)){
            return true;
        }
        if (left!=null) {
            inLeft = left.search(value);
        }
        if (right!=null) {
            inRight = right.search(value);
        }
        if (inLeft || inRight){
            return true;
        }
        return false;
    }
    public int sum(){
        int sum = 0;
        if (root==null){
            return 0;
        }
        if (left==null && right==null){
            return (int) root;
        }
        if (left!=null){
            sum += left.sum();
        }
        if (right!=null){
            sum += right.sum();
        }
        return sum;
    }       // end of sum() method
    public int size(){
        int size = 1;
        if (root==null){
            return 0;
        }
        if (left!=null) {
            size += left.size();
        }
        if (right!=null){
            size += right.size();
        }
        return size;
    }
//    public int sum(){
//        if (root==null){
//            return 0;
//        }
//        int sum = (int)root;
//        if (left==null && right==null){
//            return (int) root;
//        }
//        if (left!=null){
//            sum += left.sum();
//        }
//        if (right!=null){
//            sum += right.sum();
//        }
//        return sum;
//    }
    public int height(){
        int leftSubtree = 1, rightSubtree = 1;
        if (root==null){
            return 0;
        }
        if (left==null && right ==null){
            return 0;
        }
        if (left!=null){
            leftSubtree += left.height();
        }
        if (right!=null){
            rightSubtree += right.height();
        }
        return Math.max(leftSubtree, rightSubtree);
    }        // end of height

    public static void main(String[] args) {

        BT t7 = new BT('H');
        BT t1 = new BT('D', t7, null);


        BT t2 = new BT('E');
        BT t3 = new BT('B', t1, t2);

        BT t4 = new BT('F');
//        BT t0 = new BT('G');
        BT t5 = new BT('C', null, t4);

        BT t6 = new BT('A', t3, t5);

        // Inorder
        System.out.println("Inorder: " + t6.inOrder());
        // Preorder
        System.out.println("Preorder: " + t6.preOrder());
        // Postorder
        System.out.println("Postorder: " + t6.postOrder());

        System.out.println("Left node of B is "+t3.getLeft().root);

        System.out.println("D is in tree? " + t6.search('D'));

        System.out.println("G is in tree? " + t6.search('G'));
        System.out.println("H is in tree? " + t6.search('H'));
        System.out.println("Size of tree is "+t6.size());

        System.out.println("Height of tree is "+t6.height());

        System.out.println("B is leaf? "+t3.isLeaf());
        System.out.println("E is leaf? "+t2.isLeaf());



    }   // end of main() method
}


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
    public boolean search(Object node){
        ArrayList<Object> arrayList = getArrayList();
        for (int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(i)==node){
                return true;
            }
        }
        return false;
    }    // end of search
    public int size(){
        ArrayList<Object> arrayList = getArrayList();
        return arrayList.size();
    }

//    public boolean isFull(BT root){
//        //2^(h+1) - 1
//        int nodes=1;
//        int t = height(root) + 1;
////        System.out.println("t" + t)
//        for(int i=0;i<t;i++){
//            nodes*=2;
//        }
//        nodes--;
//
////        System.out.println("Nodes" + nodes);
//        if(size()==nodes){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }     // end of isFull()
    public int height(BT root){
        if(size()==1){
            return 0;
        }
        BT  temp = root;
        int leftSubtreeSize = 0, rightSubtreeSize = 0;
        while (root.getLeft()!=null){
            leftSubtreeSize++;
            root = root.getLeft();
        }
        while (temp.getRight()!=null){
            rightSubtreeSize++;
            temp = temp.getRight();
        }
        return Math.max(leftSubtreeSize, rightSubtreeSize);
    }        // end of height

    public static void main(String[] args) {

        BT t1 = new BT('D');
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

        System.out.println("Left node of B is "+t6.getLeft().getLeft().preOrder());

        System.out.println(t6.search('D'));

        System.out.println(t6.search('G'));
        System.out.println("Size of tree is "+t6.size());

        System.out.println("Height of tree is "+t6.height(t6));




    }   // end of main() method
}


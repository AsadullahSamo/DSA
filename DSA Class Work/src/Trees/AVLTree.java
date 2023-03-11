package Trees;

class AVLT{

    private int key, height;
    AVLT left, right;

    private AVLT(){
        left = right = this;
        height = -1;
    }     // end of private constructor (will be called only within the scope of class)

    private AVLT(int key, AVLT left, AVLT right){
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }      // end of private parameterized constructor

    public static AVLT NIL = new AVLT();

    public AVLT(int key){
        this.key = key;
        left = right = NIL;
    }

    public int size(){
        if (this==NIL){
            return 0;
        }
        return (1 + left.size() + right.size());
    }    // end of size() method

    public boolean add(int key){
        int oldSize = size();
        grow(key);
        return (size() > oldSize);
    }

    public AVLT grow(int key){
        if (this==NIL){      // if tree is empty, make it(key) root
            return new AVLT(key);
        }
        if (key == this.key){       // if key is already present, return
            return this;
        }
        if (key < left.key){
            left = left.grow(key);
        } else {
            right = right.grow(key);
        }
        // rebalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public String toString(){
        if (this==NIL){
            return " ";
        }
        return (left.toString() + " " + key + right.toString());
    }

}     // end of class AVLT

public class AVLTree {
    public static void main(String[] args) {


        AVLT avlt = new AVLT(2000);

        avlt.add(1000);
        avlt.add(3000);
        avlt.add(1500);
        avlt.add(1750);
        avlt.add(2500);
        avlt.add(1900);
        avlt.add(3100);
        avlt.add(2100);
        avlt.add(2350);
        avlt.add(1700);
        avlt.add(1200);
        avlt.add(2);

        System.out.println(avlt.toString());

    }     // end of program
}        //  end of main() method

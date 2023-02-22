/**
        Solution: if(1 disc)
        Simply move that disc from A to C

        Solution:   (if more than one discs)
        Step 1:   Move n-1 discs from A to B
        Step 2:   Move a disc from A to C
        Step 3:   Move n-1 discs from B to C
 */

package Recursion;

public class TowerOfHanoi {

    public static void print(int n, char x, char y, char z){
        if (n==1){
            System.out.println(x+" -> "+z);
        } else {
            print(n-1, x, y, z);
            System.out.println(x+" -> "+y);
            print(n-1, y, z, x);
        }

    }      // end of print()
    public static void main(String[] args) {

        int numOfTowers;
        if (args.length>0){
            numOfTowers = Integer.parseInt(args[0]);
            print(numOfTowers, 'A', 'B', 'C');
        }

    }
}

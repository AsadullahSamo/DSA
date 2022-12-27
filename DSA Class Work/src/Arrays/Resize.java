package Arrays;

import java.util.Arrays;

public class Resize {

    public static int[] resie(int [] arr, int n){
        if (n<=arr.length){
            throw new IllegalArgumentException();
        }
        int [] aa = new int[n];
        System.arraycopy(arr, 0, aa, 0, arr.length);
        return aa;
    }       // end of resie() method

    public static void main(String[] args) {

        int [] arr = {1, 4, 6, 9, 6, 8, 78};
        System.out.println(Arrays.toString(resie(arr, 10)));

    }       // end of main() method
}          //  end of program

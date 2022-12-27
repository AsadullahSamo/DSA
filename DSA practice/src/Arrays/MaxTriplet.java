package Arrays;
import java.util.Arrays;

public class MaxTriplet {

    public static void maxProduct(int [] arr){
        Arrays.sort(arr);
        int size = arr.length;
        int max = 0;
        int max1 = arr[0]*arr[1]*arr[2];                      // Max product maybe of first three elements
        int max2 = arr[size-1]*arr[size-2]*arr[size-3];      // or last three elements
        int max3 = arr[0]*arr[1]*arr[size-1];               // or first two elements and last element (as first two maybe negative and -*-=+)

        if(max1 > max2 && max1 > max3)
            System.out.println("Triplet having max product is ("+arr[0]+", "+arr[1]+", "+arr[2]+")");
        else if(max2 > max1 && max2 > max3)
            System.out.println("Triplet having max product is ("+arr[size-1]+", "+arr[size-2]+", "+arr[size-3]+")");
        else if(max3 > max1 && max3 > max2)
            System.out.println("Triplet having max product is ("+arr[0]+", "+arr[1]+", "+arr[size-1]+")");
    }      // end of maxProduct() method

    public static void main(String[] args) {

        int [] arr1 = {-4, 1, -8, 9, 6};
        maxProduct(arr1);
        int [] arr2 = {1, 7, 2, -2, 5};
        maxProduct(arr2);
    }
}

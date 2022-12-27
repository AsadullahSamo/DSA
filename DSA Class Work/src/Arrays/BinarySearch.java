package Arrays;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] arr, int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int p = 0, q=arr.length-1, i = 0;
        while (p<=q){
            i= (p+q)/2;
            if(arr[i]==target){
                return i;
            }

            if(arr[i]<target){
                p = i+1;
            } else {
                q = i-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] array = {4, 56, 7, 8, -1, 14, 25, 98, 101, 65, 74, 16, -30, -90, 100};
        System.out.println(binarySearch(array, 0));
    }
}

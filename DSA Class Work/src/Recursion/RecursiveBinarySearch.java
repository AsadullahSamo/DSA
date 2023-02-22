package Recursion;

public class RecursiveBinarySearch {

    public static int binarySearch(int [] arr, int p, int q, int target){

        if (q>=1) {
            int mid = (p + q) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, p, q - 1, target);
            } else {
                return binarySearch(arr, p + 1, q, target);
            }
        }
        // if element not found
        return -1;
    }

    public static void main(String[] args) {

        int [] array = {4, 56, 7, 8, -1, 14, 25, 98, 101, 65, 74, 16, -30, -90, 100};
        System.out.println(binarySearch(array, 0, (array.length/2)-1, 23));

        System.out.println(binarySearch(array, 0, (array.length/2)-1, 101));

    }
}

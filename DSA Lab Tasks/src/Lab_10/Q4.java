package Lab_10;

public class Q4 {

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

        int [] array = {1, 4, 5, 6, -8, 9, 45, 65, 2, 0};
        System.out.println(binarySearch(array, 0, (array.length/2)-1, -7));
        System.out.println(binarySearch(array, 0, (array.length/2)-1, 45));
        System.out.println(binarySearch(array, 0, (array.length/2)-1, 5));
    }
}

package Arrays;

public class Insert_Position {

    public static void insert(int [] arr, int k){
        for (int i=0; i< arr.length; i++){
            if (arr[i]==k){
                System.out.println("Array found at index "+i);
                return;
            }
            if (arr[i]>k){
                System.out.println("Element should be inserted at index "+i+" to sort array");
                return;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        insert(arr1, 3);
        int [] arr2 = {1, 2, 3, 4, 5, 7, 9, 11};
        insert(arr2, 10);
    }
}

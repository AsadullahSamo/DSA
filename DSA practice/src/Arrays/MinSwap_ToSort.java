package Arrays;

public class MinSwap_ToSort {

    public static int minSwaps(int [] arr){

        int swaps = 0;
        int size = arr.length;
//        for (int i=0; i< arr.length; i++){
            if(arr[0]>arr[size-1]){
                int temp = arr[0];
                arr[0] = arr[size-1];
                arr[size-1] = temp;
                swaps +=2;
            }

        //}
        for (int i=0; i< arr.length/2; i++){
            for (int j=i+1; j< arr.length-1; j++){
                if(arr[j]>arr[size-1]){
                    int temp = arr[j];
                    arr[j] = arr[size-1];
                    arr[size-1] = temp;
                    swaps++;
                }
            }
            size--;
        }
        return swaps;
    }

    public static void main(String[] args) {

        int [] arr1 = {4, 3, 2, 1};
        System.out.println(minSwaps(arr1));
        int [] arr2 = {1, 5, 4, 3, 2};
        System.out.println(minSwaps(arr2));
        int [] arr3 = {5, 1, 3, 2};
        System.out.println(minSwaps(arr3));
        int [] arr4 = {1, 3, 2};
        System.out.println(minSwaps(arr4));
        System.out.println(arr4.getClass());
    }
}

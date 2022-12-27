package Arrays;

public class MinMax_Element {

    public static void minMaxInteger(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max = "+max+ ", min = "+min);
    }

    public static void main(String[] args) {

        int [] arr1 = {4, 2, 0, 8, 20, 9, 2};
        int [] arr2 = {-8, -3, -10, -32, -1};


        minMaxInteger(arr1);
        minMaxInteger(arr2);
    }
}

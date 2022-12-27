package Arrays;

public class Minimum_Length_Unsorted_Subarray {

    public static void findSubarray(int [] arr){
        int maxFromLeft = 0, maxFromRight = 0;
        for (int i=0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1] || arr[i]==arr[i+1] && i!=0){
                maxFromLeft = i;
                break;
            }
        }
        for (int i=arr.length-1; i>0; i--){
            if(arr[i]<arr[i-1] || arr[i]==arr[i-1] && i!= (arr.length-1)){
                maxFromRight = i+1;
                break;
            }
        }
        System.out.println("Subarray lies between index "+maxFromLeft+" to "+maxFromRight);
        System.out.println("Length is "+(maxFromRight-maxFromLeft));
    }

    public static void main(String[] args) {

        int [] arr1 = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        findSubarray(arr1);
        int [] arr2 = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        findSubarray(arr2);
        int [] arr3 = {2, 6, 4, 8, 10, 9, 15};
        findSubarray(arr3);
        int [] arr4 = {1, 2, 3, 4};
        findSubarray(arr4);
        int [] arr5 = {1};
        findSubarray(arr5);
        int [] arr6 = {1, 2, 3, 3, 3};
        findSubarray(arr6);

    }


}

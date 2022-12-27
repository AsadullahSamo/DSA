package Arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static int[] mergeSort(int [] a, int [] b){
        int [] newArray = new int[a.length+b.length];
        int k = 0;
        for (int i=0; i< newArray.length; i++){
            if(i<a.length) {
                newArray[i] = a[i];
            } else {
                newArray[i] = b[k];
                k++;
            }
        }
        Arrays.sort(newArray);
        return newArray;
    }

    public static float median(int [] a, int [] b){
        int [] arr = mergeSort(a, b);
        int p = 0, q = arr.length-1, i = (p+q)/2;
        if(arr.length%2!=0){
            return (float)arr[i];
        } else {
            System.out.println(arr[i]+" "+arr[i+1]);
            return (float)(arr[i]+arr[i+1])/2;
        }

    }

    public static void main(String[] args) {

        int [] a = {1, 3},  b = {2, -1, 0, 87};

//        for (int i=a.length, j=0; i< newArray.length; i++, j++){
//            newArray[i] = b[j];
//        }

        System.out.println(Arrays.toString(mergeSort(a, b)));
////        System.out.printf("%.5f\n", median(nums1, nums2));
//        int [] nums3 = {1, 2},  nums4 = {3, 4};
//        System.out.printf("%.5f\n", median(nums3, nums4));
    }

}

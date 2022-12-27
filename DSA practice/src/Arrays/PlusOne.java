package Arrays;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int [] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
    public static void main(String[] args) {

//        int [] arr1 = { };
//        System.out.println(Arrays.toString(plusOne(arr1)));
        //int [] arr2 = {9};
        //System.out.println(Arrays.toString(plusOne(arr2)));
        int [] arr3 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr3)));
        int [] arr4 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(arr4)));
        int [] arr5 = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr5)));

    }
}

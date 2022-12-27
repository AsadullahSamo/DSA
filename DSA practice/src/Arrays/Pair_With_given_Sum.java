package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Pair_With_given_Sum {
    public static void main(String[] args) {

        int [] arr = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target ");
        int target = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }



        System.out.println("nums = "+ Arrays.toString(arr));
        System.out.println("target = "+target);

        for (int i=0; i<5; i++){
            for (int j=i+1; j<6; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found ("+arr[i]+", "+arr[j]+")");
                }
            }
        }

            System.out.println("Pair not found");

    }
}

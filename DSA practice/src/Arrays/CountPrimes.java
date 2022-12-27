package Arrays;

import java.util.Scanner;

public class CountPrimes {
    static Scanner sc = new Scanner(System.in);

    public static int countPrimes(int [] arr){
        int numberOfPrimes = 0;
        boolean flag = true;
        for (int j=0; j< arr.length; j++){
            int num = arr[j];
            for (int i=2; i<=num/2; i++){
                if(num==1){
                    flag = false;
                } else if(num%i==0){
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if(flag){
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }

    public static void main(String[] args) {

        int [] arr = {1, 3, 4, 5, 7};
        System.out.println(countPrimes(arr));
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(countPrimes(arr2));
        int [] arr3 = {4, 8, 3, 7, 9, 11, 13, 17, 2, 6, 8, 41, 41};
        System.out.println(countPrimes(arr3));

    }
}

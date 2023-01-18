package Stacks;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscount {

    public static int min(int [] array){
        int min = array[0];
        for (int i=0; i< array.length-1; i++){
            if (array[i+1]<array[i]){
                min = array[i+1];
            }
        }
        return min;
    }

    public static int[] finalPrices(int[] prices){
        int min = min(prices), index = 0;
        boolean flag = false;
        int [] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++){
            for (int j=i+1; j< prices.length; j++){
                if (prices[i]>=prices[j] && j>i){
                    answer[i] = prices[i] - prices[j];
                }
            }
        }

        for (int i= prices.length-1; i>0; i--){
            if (prices[i]<prices[i-1]){
                index = i;
                break;
            }
        }
        for (int i=index; i<prices.length; i++){
            answer[i] = prices[i];
        }
        return answer;
    }     // end of finalPrices() method

    public static void main(String[] args) {

        int [] array1 = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(array1)));
        int [] array2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(finalPrices(array2)));
        int [] array3 = {10, 1, 1, 6};
        System.out.println(Arrays.toString(finalPrices(array3)));
        int [] array4 = {8,7,4,2,8,1,7,7,10,1};
        System.out.println(Arrays.toString(finalPrices(array4)));




    }
}

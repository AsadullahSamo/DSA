package Arrays;

public class Count_Frequency {

    public static void frequency(int num, int [] arr){
        int occurence = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==num)
                occurence++;
        }
        System.out.println(num+" appears "+occurence+" times ");
    }

    public static void main(String[] args) {

        int [] arr = {15, 6, 7, 10, 12, 20, 10, 28, 10};
        frequency(10, arr);

    }
}

package Arrays;

public class Duplicates {

    public static boolean duplicate(int [] arr){
        boolean flag;
        int count = 1;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        if(count>=2){
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 1};
        System.out.println(duplicate(arr1));
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(duplicate(arr2));
    }
}

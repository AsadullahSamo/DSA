package Arrays;

public class SingleNumber {

    public static int singleNum(int[] arr) {

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                }
            }
            if (flag == true) {
                return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {


        int [] arr1 = {2, 1, 5, 3, 1, 5, 2};
        System.out.println(singleNum(arr1));
    }
}

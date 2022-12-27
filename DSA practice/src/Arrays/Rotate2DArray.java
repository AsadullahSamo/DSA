package Arrays;

public class Rotate2DArray {

    public static void rotate2DArray(int [][] matrix){
        System.out.print("[");
        for (int i=0; i< matrix.length; i++){
            System.out.print("[");
            for (int j=matrix[i].length-1; j>=0; j--){
                if(j==0) {
                    System.out.print(matrix[j][i]);
                } else {
                    System.out.print(matrix[j][i] + ",");
                }
            }
                if(i== matrix.length-1){
                    System.out.print("]");
                } else {
                    System.out.print("],");
                }
        }
        System.out.print("]");
    }
    public static void print2DArray(int [][] arr){

        for (int i=0; i< arr.length; i++){

            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[j][i]+" ");
            }

        }

    }
    public static void main(String[] args) {

        int [][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {3, 4, 5, 6}};
//        rotate2DArray(arr);
        int [][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        rotate2DArray(matrix2);
        int [][] matrix3 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate2DArray(matrix3);
//        print2DArray(arr);
    }
}

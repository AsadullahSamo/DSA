package Arrays;

public class Search2DArray {

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++){
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix1, 3));

        System.out.println(searchMatrix(matrix1, 13));
    }
}

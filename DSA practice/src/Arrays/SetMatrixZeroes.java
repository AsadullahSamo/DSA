package Arrays;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){

                if (matrix[i][j]==0){

                  for (int k=0; k< matrix.length; k++){
                        matrix[k][j] = 0;
                  }
                  for (int k=0; k< matrix.length; k++){
                        matrix[i][k] = 0;
                  }

                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {

        int [][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        System.out.println(matrix[0].length);
//        setZeroes(matrix);

        int [][] matrix2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix2);

    }

}

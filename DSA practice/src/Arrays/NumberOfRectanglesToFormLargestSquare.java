package Arrays;

import java.util.Arrays;

public class NumberOfRectanglesToFormLargestSquare {

    public static int countGoodRectangles(int[][] rectangles) {
        int maxRectangles = 0;
        int [] array = new int[rectangles.length];
        for (int i=0; i<rectangles.length; i++){
                array[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        Arrays.sort(array);
        int i=array.length-1;
        if(array.length==1){
            return 1;
        }
        while (array[i]==array[array.length-1] ){
            maxRectangles++;
            i--;
        }
        return maxRectangles;
    }

    public static void main(String[] args) {

        int [][] matrix1 = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.out.println(countGoodRectangles(matrix1));
        int [][] matrix2 = {{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        System.out.println(countGoodRectangles(matrix2));
        int [][] matrix3 = {{3, 1}};
        System.out.println(countGoodRectangles(matrix3));

    }     // end of main() method
}        //  end of program

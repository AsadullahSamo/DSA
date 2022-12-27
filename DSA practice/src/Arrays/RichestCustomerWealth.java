package Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum>wealth){
                wealth = sum;
            }
        }
        return wealth;
    }

    public static void main(String[] args) {

        int [][] matrix1 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(matrix1));
        int [][] matrix2 = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(matrix2));
        int [][] matrix3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(matrix3));

    }
}

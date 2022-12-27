package Arrays;

public class FinalValueAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i=0; i<operations.length; i++){
            switch (operations[i]){
                case "--X" -> --x;
                case "X--" -> x--;
                case "++X" -> ++x;
                case "X++" -> x++;
            }
        }

        return x;
    }    // end of function

    public static void main(String[] args) {

        String [] operationsSet1 = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operationsSet1));
        String [] operationsSet2 = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operationsSet2));
        String [] operationsSet3 = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(operationsSet3));
    }
}

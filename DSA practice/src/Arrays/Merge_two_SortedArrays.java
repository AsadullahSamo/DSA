package Arrays;

public class Merge_two_SortedArrays {
    public static void main(String[] args) {

        int [] arr1 = {1, 3, 7, 9};
        int [] arr2 = {2, 4, 6, 8};

        // Merging arrays
        int [] mergedArray = new int[arr1.length+ arr2.length];
        for (int i=0; i< mergedArray.length; i++){
            if (i< arr1.length) {
                mergedArray[i] = arr1[i];
            } else {
                mergedArray[i] = arr2[i- arr1.length];
            }
        }

        for (int i=0; i< mergedArray.length; i++){
            System.out.print(mergedArray[i]+"  ");
        }
        System.out.println();

        for (int i=0; i<mergedArray.length; i++){
            for (int j=i+1; j<mergedArray.length; j++) {
                if (mergedArray[i] > mergedArray[j]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }

        for (int i=0; i< mergedArray.length; i++){
            System.out.print(mergedArray[i]+"  ");
        }


    }    // end of main()
}        // end of program

package Arrays;

public class SelfCrossing {

    public static boolean isSelfCrossing(int[] distance) {
        int north = distance[0], west = distance[1], south = distance[2], east = distance[3];
        if(south>west){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {

        int [] array1 = {2, 1, 1, 2};
        System.out.println(isSelfCrossing(array1));
        int [] array2 = {1, 2, 3, 4};
        System.out.println(isSelfCrossing(array2));
        int [] array3 = {1, 1, 1, 1};
        System.out.println(isSelfCrossing(array3));
        int [] array4 = {1, 1, 2, 1, 1};
        System.out.println(isSelfCrossing(array4));

    }
}

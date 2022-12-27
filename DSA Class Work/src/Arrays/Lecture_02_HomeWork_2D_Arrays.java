package Arrays;
import java.util.Scanner;

public class Lecture_02_HomeWork_2D_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] names = new String[5];
        String [] roll_no = new String[5];
        int [] OOPMarks = new int[5];
        String [][] classData = new String[5][3];

        // To insert data
        for (int i=0; i<5; i++){
            System.out.println("Enter name, roll number and marks");
            names[i] = sc.next();
            roll_no[i] = sc.next();
            OOPMarks[i] = sc.nextInt();
        }

        // Loop to insert data from one D arrays to 2D array
        for (int i=0; i< 5; i++){
                classData[i][0] = names[i];
                classData[i][1] = roll_no[i];
                classData[i][2] = String.valueOf(OOPMarks[i]);
        }     // end of for loop

        // Loop to retreive data
        for (int i=0; i<5; i++){
            for (int j=0; j<3; j++){
                System.out.println(classData[i][j]);
            }
        }

    

    }
}

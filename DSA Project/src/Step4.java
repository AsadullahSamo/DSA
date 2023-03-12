import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Step4 {

    public void getRecentEventForEachCountry() throws SQLException, ClassNotFoundException, IOException {
        Step3 step3 = new Step3();
        Stack<Object>[] stack = step3.getStack();      // call getStack() from step3 class
        LinkedList<Object> linkedList = new LinkedList<>();

        for (int i=0; i<stack.length; i++){
            linkedList.add(stack[i].peek());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of country to get its recent event: ");
        String country = sc.nextLine();
        int index = step3.getIndex(country);
        if(index!=-1) {
            System.out.println("Recent earthquake is " + linkedList.get(index));
        }
    }     // end of getRecentEventForEachCountry() method

    public void getEarthquakesForParticularMagnitudeRange() throws SQLException, IOException, ClassNotFoundException {
        Step3 step3 = new Step3();
        Stack<Object>[] stack = step3.getStack();      // call getStack() from step3 class
        LinkedList<Object> linkedList = new LinkedList<>();

        for (int i=0; i<stack.length; i++){
            linkedList.add(stack[i].peek());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the magnitude to get earthquakes above this magnitude: ");
        double userMag = sc.nextDouble();


        for (int i=0; i<linkedList.size(); i++){
            String str = linkedList.get(i).toString();
            double magnitude = Double.parseDouble(str.substring(str.length()-3));      // As magnitude is at last of every string in node, we extracted it using substring from last
            if (magnitude > userMag){
                System.out.println(linkedList.get(i));
            }
        }    // end of for loop

    }     // end of getEarthquakesForParticularMagnitudeRange() method

}        // end of class

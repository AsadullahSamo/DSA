import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Step4 {

    public void getRecentEvent() throws SQLException, ClassNotFoundException, IOException {
        Step3 step3 = new Step3();
        Stack<Object>[] stack = step3.getStack();
        LinkedList<Object> linkedList = new LinkedList<>();

        for (int i=0; i<stack.length; i++){
            linkedList.add(stack[i].peek());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of country to get its recent event: ");
        String country = sc.nextLine();
        int index = step3.index(country);
        if(index!=-1) {
            System.out.println("Recent earthquake is " + linkedList.get(index));
        }
    }     // end of method

}        // end of class

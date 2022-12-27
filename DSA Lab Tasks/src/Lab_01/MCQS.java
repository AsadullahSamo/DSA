package Lab_01;

import java.util.Scanner;

public class MCQS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String question = "", choiceOne = "", choiceTwo = "", choiceThree = "";
        String answer;

        choiceOne = "James Gosling"; choiceTwo = "Elon Musk"; choiceThree = "Bjarne Stroustrup";

        System.out.println("Java is developed by ");
        System.out.println("A " +choiceOne);
        System.out.println("B " +choiceTwo);
        System.out.println("C " +choiceThree);

        answer = sc.next();


        if(answer.equals("a") || answer.equals("A")){
            System.out.println("Cngratulations, you gave correct answer!");
        } else {
            System.out.println("Sorry, Correct answer is "+choiceOne);
        }

    }
}

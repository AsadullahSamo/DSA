package Lab_01;

import java.util.Scanner;

public class Employee_Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hours, money, salary;

        System.out.print("Enter number of hours per week: ");
        hours = sc.nextInt();
        System.out.print("Enter amount of money per hour: ");
        money = sc.nextInt();

        salary = hours * money;
        System.out.println("$"+money+"per hour X "+hours+" hours per week = $"+salary);
        System.out.println("Gross yearly Salary is $"+salary+"*"+ 52+" = "+salary*52);

    }
}

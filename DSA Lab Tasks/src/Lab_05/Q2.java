package Lab_05;
class Employee {
    String firstName;
    String lastName;
    int salary;

    public void setDetails(String firstName, String lastName, int salary) {
        if (salary<0){
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

}      // end of class Employee

public class Q2 {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setDetails("John", "Doe", 55000);
        employee2.setDetails("John", "Dalton", 25000);

        System.out.println("Salary of employee 1 is "+employee1.getSalary());
        System.out.println("Salary of employee 2 is "+employee2.getSalary());

        employee1.salary += (employee1.salary * 10)/100;
        employee2.salary += (employee2.salary * 10)/100;

        System.out.println("Salary of employee 1 after raise of 10% is "+employee1.getSalary());
        System.out.println("Salary of employee 2 after raise of 10% is "+employee2.getSalary());


        System.out.print("Name of employee 1 is "+employee1.getFirstName()+" "+employee1.getLastName());
        System.out.println();

        System.out.print("Name of employee 2  is "+employee2.getFirstName()+" "+employee2.getLastName());
        System.out.println();

        Employee e = new Employee();
        e.setDetails("B", "c", -5);
        System.out.println(e.getSalary());


    }     // end of main() method
}        //  end of program

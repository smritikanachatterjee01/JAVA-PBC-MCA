// 11. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the user and display the gross_salary.
import java.util.Scanner;
class Employee {
int emp_id;
String emp_name;
double basic_salary;
public Employee(int emp_id, String emp_name, double basic_salary) {
this.emp_id = emp_id;
this.emp_name = emp_name;
this.basic_salary = basic_salary;
}
public double calculateGrossSalary() {
double hra = 0.2 * basic_salary;
double da = 0.5 * basic_salary;
double gross_salary = basic_salary + hra + da;
return gross_salary;
}
public void displayEmployeeDetails() {
System.out.println("Employee ID: " + emp_id);
System.out.println("Employee Name: " + emp_name);
System.out.println("Basic Salary: " + basic_salary);
System.out.println("Gross Salary: " + calculateGrossSalary());
}
}
public class Main { // Or public class Employee if you kept the original filename
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter Employee ID: ");
int emp_id = input.nextInt();
input.nextLine(); // Consume newline
System.out.println("Enter Employee Name: ");
String emp_name = input.nextLine();
System.out.println("Enter Basic Salary: ");
double basic_salary = input.nextDouble();
Employee emp = new Employee(emp_id, emp_name, basic_salary);
emp.displayEmployeeDetails();
input.close();
}
}
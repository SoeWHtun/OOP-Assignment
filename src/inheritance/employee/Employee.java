package inheritance.employee;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Employee {
	 public static Employee[] employeeDB = new Employee[100];
     public String name;
     public int id;
     public double basicSalary;
     private static int employeeCount;
     static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
     static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
     public Employee() {
    	 employeeCount++;
     }
     public Employee(String name,int id,double basicSalary) {
    	 this.name=name;
    	 this.id=id;
    	 this.basicSalary=basicSalary;
    	 employeeCount++;
     }
     
     public static int getEmployeeCount() {
    	 return employeeCount;
     }

     public double calculateSalary() {
    	 return 0.0;
     }
     public void displayDetails() {
    	 System.out.println("Employee name : "+name);
    	 System.out.println("Employee ID : "+id);
    	 System.out.println("Basic Salary : "+basicSalary);
    	 System.out.println("Total Salary : "+calculateSalary());
    	 System.out.println();
     }
}

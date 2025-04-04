package exercise;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
     String name;
     String email;
     String phone;
     String department;
     double salary;
     static int count = 0;
     static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
     static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
     
     public Employee(String name,String email,String phone,String department,double salary) {
    	 this.name=name;
    	 this.email=email;
    	 this.phone=phone;
    	 this.department=department;
    	 this.salary=salary;
    	 count++;
     }
     @Override
     public String toString() {
    	 return "Name : "+this.name+" | "+"Email : "+this.email+" | "+"Phone : "+this.phone+" | "+"Department : "+this.department+" | "+"Salary : "+this.salary+" | ";
     }
     public static Employee getEmployeeInfo()throws IOException {
    	 System.out.print("Enter Name: ");
         String name = bufferedReader.readLine();
         System.out.print("Enter Email: ");
         String email = bufferedReader.readLine();
         System.out.print("Enter Phone: ");
         String phone = bufferedReader.readLine();
         System.out.print("Enter Department: ");
         String department = bufferedReader.readLine();
         System.out.print("Enter Salary: ");
         double salary = Double.parseDouble(bufferedReader.readLine());
         System.out.println();

         return new Employee(name, email, phone, department, salary);
     }
}

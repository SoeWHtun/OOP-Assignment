package exercise;
import java.io.IOException;
public class EmployeeManagement {
	static Employee[] employees = new Employee[100];
	
	public static void main(String[] args)throws IOException {
		employees[0]=Employee.getEmployeeInfo();
		employees[1]=Employee.getEmployeeInfo();
		displayEmployees();
		double totalSalary=0;
		for (int i = 0; i < Employee.count; i++) {
            totalSalary += employees[i].salary;
		}
		 System.out.println("Total Employees: " + Employee.count);
	     System.out.println("Average Salary: " + (totalSalary / Employee.count));
    }

    public static void displayEmployees() {
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(employees[i].toString());
        }
    }

}

package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeManagement {
	static Employee[] employees = new Employee[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	static int employeeCount = 0;

	public static void main(String[] args) throws IOException {
		String result;
		do {
			employees[employeeCount] = Employee.getEmployeeInfo();
			employeeCount++;
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
		} while (result.equals("yes"));
		displayEmployees();
		if (Employee.count > 0) {
			double totalSalary = 0;
			for (int i = 0; i < Employee.count; i++) {
				totalSalary += employees[i].salary;
			}
			System.out.println("Total Employees: " + Employee.count);
			System.out.println("Average Salary: " + (totalSalary / Employee.count));
		} else {
			System.out.println("No Employee added");
		}

	}

	public static void displayEmployees() {
		for (int i = 0; i < Employee.count; i++) {
			System.out.println(employees[i].toString());
		}
	}

}

package inheritance.employee;

import java.io.IOException;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		FullTimeEmployee.getEmployeeInfo();
		PartTimeEmployee.getEmployeeInfo();
		ContractEmployee.getEmployeeInfo();
		for(int i=0;i<Employee.getEmployeeCount();i++) {
			Employee.employeeDB[i].displayDetails();
		}
	}

}

package inheritance.employee;

import java.io.IOException;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	private static int partEmployeeCount;
	
	public PartTimeEmployee(String name, int id, double basicSalary, int hoursWorked, double hourlyRate) {
		super(name,id,0.0);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		partEmployeeCount++;
	}

	public static void getEmployeeInfo() throws IOException {
		System.out.print("Enter employee name : ");
		String name = bufferedReader.readLine();
		System.out.print("Enter employee id : ");
		int id = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter hours worked : ");
		int hoursWorked = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter hourly rate : ");
		double hourlyRate = Double.parseDouble(bufferedReader.readLine());
		System.out.println();

		employeeDB[Employee.getEmployeeCount()]= new PartTimeEmployee(name, id, 0, hoursWorked, hourlyRate);
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public static int getEmployeeCount() {
		return partEmployeeCount;
	}

    @Override
	public double calculateSalary() {
		return getHoursWorked() * getHourlyRate();
	}


}

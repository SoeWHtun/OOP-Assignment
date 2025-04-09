package inheritance.employee;

import java.io.IOException;

public class FullTimeEmployee extends Employee{
	private double allowance;
	private double bonus;
	private static int fullEmployeeCount;
	
	public FullTimeEmployee(String name, int id, double basicSalary, double allowance, double bonus) {
		super(name,id,basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;
		fullEmployeeCount++;
	}

	public static void getEmployeeInfo() throws IOException {
		System.out.print("Enter employee name : ");
		String name = bufferedReader.readLine();
		System.out.print("Enter employee id : ");
		int id = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter employee basic salary : ");
		double basicSalary = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Enter allowance : ");
		double allowance = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Enter bonus : ");
		double bonus = Double.parseDouble(bufferedReader.readLine());
		System.out.println();

		employeeDB[Employee.getEmployeeCount()]= new FullTimeEmployee(name, id, basicSalary, allowance, bonus);
	}

	public double getAllowance() {
		return allowance;
	}

	public double getBonus() {
		return bonus;
	}

	public static int getEmployeeCount() {
		return fullEmployeeCount;
	}

	@Override
	public double calculateSalary() {
		return basicSalary + getAllowance() + getBonus();
	}

}

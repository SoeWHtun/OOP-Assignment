package inheritance.employee;

import java.io.IOException;

public class ContractEmployee extends Employee {
	private int contractDuration;
	private double contractAmount;
	private static int contractEmployeeCount;
		public ContractEmployee(String name, int id, double basicSalary, int contractDuration, double contractAmount) {
		super(name,id,0.0);
		this.contractDuration = contractDuration;
		this.contractAmount = contractAmount;
		contractEmployeeCount++;
	}
		
	public static void getEmployeeInfo() throws IOException {
		System.out.print("Enter employee name : ");
		String name = bufferedReader.readLine();
		System.out.print("Enter employee id : ");
		int id = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter contract duration : ");
		int contractDuration = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter contract amount : ");
		double contractAmount = Double.parseDouble(bufferedReader.readLine());
		System.out.println();

		employeeDB[Employee.getEmployeeCount()] = new ContractEmployee(name, id, 0, contractDuration, contractAmount);
	}
	public int getContractDuration() {
		return contractDuration;
	}

	public double getContractAmount() {
		return contractAmount;
	}

	public static int getEmployeeCount() {
		return contractEmployeeCount;
	}

    @Override
	public double calculateSalary() {
		return getContractAmount() / getContractDuration();
	}



}

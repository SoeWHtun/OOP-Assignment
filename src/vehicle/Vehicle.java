package vehicle;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Vehicle {
	public String brand;
	public int model;
	public static int vehicleCount;
	public static Vehicle[] vehicles = new Vehicle[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public Vehicle() {
		vehicleCount++;
	}

	public Vehicle(String brand, int model) {
		this.brand = brand;
		this.model = model;
		vehicleCount++;
	}

	public void displayInfo() {

	}
}

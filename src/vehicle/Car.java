package vehicle;

import java.io.IOException;

public class Car extends Vehicle {
	private int door;
	private int carCount;

	public Car(String brand, int model, int door) {
		super(brand, model);
		this.door = door;
		carCount++;
	}

	public static void getInfo() throws IOException {
		System.out.print("Enter the brand name : ");
		String brand = bufferedReader.readLine();
		System.out.print("Enter the model : ");
		int model = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter door (2/4) : ");
		int door = Integer.parseInt(bufferedReader.readLine());

		vehicles[Vehicle.vehicleCount] = new Car(brand, model, door);
	}

	public int getDoor() {
		return door;
	}

	public int getCarCount() {
		return carCount;
	}

	@Override
	public void displayInfo() {
		System.out.println("Car");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Door : " + getDoor());
	}
}

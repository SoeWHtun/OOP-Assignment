package vehicle;

import java.io.IOException;

public class Truck extends Vehicle {
	private double payloadCapacity;
	private int truckCount;

	public Truck(String brand, int model, double payloadCapacity) {
		super(brand, model);
		this.payloadCapacity = payloadCapacity;
		truckCount++;
	}

	public static void getInfo() throws IOException {
		System.out.print("Enter the brand name : ");
		String brand = bufferedReader.readLine();
		System.out.print("Enter the model : ");
		int model = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter the payload capacity : ");
		double payloadCapacity = Double.parseDouble(bufferedReader.readLine());

		vehicles[Vehicle.vehicleCount] = new Truck(brand, model, payloadCapacity);
	}

	public double getPayloadCapacity() {
		return payloadCapacity;
	}

	public int getTruckCount() {
		return truckCount;
	}

	@Override
	public void displayInfo() {
		System.out.println("Truck");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Payload Capacity : " + getPayloadCapacity());
	}
}
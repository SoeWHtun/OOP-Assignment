package vehicle;

import java.io.IOException;

public class Motorcycle extends Vehicle {
	private boolean hasSidecar;
	private int motorcycleCount;

	public Motorcycle(String brand, int model, boolean hasSidecar) {
		super(brand, model);
		this.hasSidecar = hasSidecar;
		motorcycleCount++;
	}

	public static void getInfo() throws IOException {
		System.out.print("Enter the brand name : ");
		String brand = bufferedReader.readLine();
		System.out.print("Enter the model : ");
		int model = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter if the motorcycle has side car (true/false) : ");
		boolean hasSidecar = Boolean.parseBoolean(bufferedReader.readLine());

		vehicles[Vehicle.vehicleCount] = new Motorcycle(brand, model, hasSidecar);
	}

	public boolean getSidecar() {
		return hasSidecar;
	}

	public int getMotorcycleCount() {
		return motorcycleCount;
	}

	@Override
	public void displayInfo() {
		System.out.println("Motorcycle");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Side Car : " + getSidecar());
	}
}
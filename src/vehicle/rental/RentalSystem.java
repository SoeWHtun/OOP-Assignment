package vehicle.rental;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class RentalSystem {
	public static Vehicle[] vehicles = new Vehicle[100];
	public static Rental[] rentals = new Rental[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		int choice;
		do {

			System.out.println("Welcome From Car and Motorcycle Rental System");
			System.out.println("1. Add a Vehicle to the system");
			System.out.println("2. Rent Vehicle");
			System.out.println("3. Show Sale Report");
			System.out.println("4. Display Available Vehicle");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(bufferedReader.readLine());

			switch (choice) {
			case 1 -> addVehicle();
			case 2 -> rentVehicle();
			case 3 -> showSalesReport();
			case 4 -> displayVehicles();
			case 5 -> System.out.println("Thank you for using the Car and Motorcycle Rental System. Goodbye!");
			default -> System.out.println("Invalid choice! Please select a valid option.");
			}

		} while (choice != 5);
		System.out.println();

	}

	public static void addVehicle() throws IOException {
		System.out.print("Enter vehicle type (car/motorcycle): ");
		String type = bufferedReader.readLine().toLowerCase();
		System.out.print("Enter owner name: ");
		String owner = bufferedReader.readLine();
		System.out.print("Enter model: ");
		String model = bufferedReader.readLine();
		System.out.print("Enter license number: ");
		String license = bufferedReader.readLine();
		System.out.print("Enter price per day: ");
		double price = Double.parseDouble(bufferedReader.readLine());

		if (type.equals("car")) {
			System.out.print("Enter number of seats: ");
			int seats = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter type of car (luxury,carry,trip van): ");
			String ctype = bufferedReader.readLine().toUpperCase().replace(" ", "_");
			CarType carType = CarType.valueOf(ctype);
			vehicles[Vehicle.vehicleCount] = new Car(owner, model, license, price, seats, carType);
			System.out.println();
			System.out.println("Car added successfully!");
			System.out.println();

		} else if (type.equals("motorcycle")) {
			System.out.print("Enter engine capacity: ");
			double cc = Double.parseDouble(bufferedReader.readLine());
			vehicles[Vehicle.vehicleCount] = new Motorcycle(owner, model, license, price, cc);
			System.out.println();
			System.out.println("Motorcycle added successfully!");
			System.out.println();

		} else {
			System.out.println("Invalid vehicle type.");
		}
	}

	public static void rentVehicle() throws IOException {
		System.out.print("Enter vehicle type (car/motorcycle): ");
		String type = bufferedReader.readLine().toLowerCase();

		VehicleType vehicleType;
		if (type.equals("car")) {
			vehicleType = VehicleType.CAR;
		} else if (type.equals("motorcycle")) {
			vehicleType = VehicleType.MOTORCYCLE;
		} else {
			System.out.println("Invalid type.");
			return;
		}

		System.out.print("Enter license number: ");
		String license = bufferedReader.readLine();
		System.out.print("Enter number of days to rent: ");
		int days = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			if (vehicles[i] != null && vehicles[i].licenseNo.equalsIgnoreCase(license)) {
				double total = vehicles[i].pricePerDay * days;
				rentals[Rental.rentalCount] = new Rental(Rental.rentalCount++, vehicleType, vehicles[i], days, total);
				vehicles[i] = null;
				System.out.println();
				System.out.println("Vehicle rented successfully! Total price: $" + total);
				System.out.println();

			}
		}

	}

	public static void showSalesReport() {
		int rentedCars = 0;
		int rentedMotorcycles = 0;
		int availableCars = Car.carCount;
		int availableMotorcycles = Motorcycle.motorcycleCount;
		double carRevenue = 0;
		double bikeRevenue = 0;

		for (int i = 0; i < Rental.rentalCount; i++) {
			if (rentals[i] != null) {
				if (rentals[i].getVehicleType() == VehicleType.CAR) {
					rentedCars++;
					availableCars--;
					carRevenue += rentals[i].getTotalPrice();
				} else if (rentals[i].getVehicleType() == VehicleType.MOTORCYCLE) {
					rentedMotorcycles++;
					availableMotorcycles--;
					bikeRevenue += rentals[i].getTotalPrice();
				}
			}
		}
		System.out.println();
		System.out.println("Sale Report:");
		System.out.println("Motorcycles Rented: " + rentedMotorcycles);
		System.out.println("Motorcycles Remaining: " + availableMotorcycles);
		System.out.println("Cars Rented: " + rentedCars);
		System.out.println("Cars Remaining: " + availableCars);
		System.out.println("Revenue from Motorcycles: $" + bikeRevenue);
		System.out.println("Revenue from Cars: $" + carRevenue);
		System.out.println();
	}

	public static void displayVehicles() {
		System.out.println();
		System.out.println("Available Vehicles:");
		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			if (vehicles[i] != null) {
				System.out.println("- " + vehicles[i].model + " (License No: " + vehicles[i].licenseNo + ", Price: $"
						+ vehicles[i].pricePerDay + "/day)");
			}
		}
		System.out.println();

	}

}

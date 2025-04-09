package vehicle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VehicleRegisterService {
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		String result;
		do {
			System.out.println("Vehicle Register Service");
			System.out.println("1. Car");
			System.out.println("2. Truck");
			System.out.println("3. Motorcycle");
			System.out.print("Enter your choice : ");
			int choice = Integer.parseInt(bufferedReader.readLine());
			switch (choice) {
			case 1:
				Car.getInfo();
				break;
			case 2:
				Truck.getInfo();
				break;
			case 3:
				Motorcycle.getInfo();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue (yes/no) : ");
			result = bufferedReader.readLine();
			System.out.println();
		} while (result.equals("yes"));
		for (int i = 0; i < Vehicle.vehicleCount; i++) {
			Vehicle.vehicles[i].displayInfo();
			System.out.println();
		}
	}

}

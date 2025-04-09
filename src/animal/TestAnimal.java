package animal;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestAnimal {
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		String result;
		do {
			Animal.inputData();
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
			System.out.println();
		} while (result.equals("yes"));
		System.out.println("Total number of animals :" + Animal.getAnimalCount());
		System.out.println();
		displayAnimalInfo();
	}

	public static void displayAnimalInfo() {
		for (int i = 0; i < Animal.getAnimalCount(); i++) {
			System.out.println("Animal " + (i + 1));
			System.out.println("Name : " + Animal.animals[i].getAnimalName());
			System.out.println("Age : " + Animal.animals[i].getAnimalAge());
			System.out.println("Species : " + Animal.animals[i].getAnimalSpecies());
			System.out.println();

		}
	}
}

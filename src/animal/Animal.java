package animal;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Animal {
	private String name;
	public static Animal[] animals = new Animal[100];
	private int age;
	private String species;
	private static int animalCount;
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		animalCount++;
	}

	public static void inputData() throws IOException {
		System.out.print("Enter animal name : ");
		String name = bufferedReader.readLine();
		System.out.print("Enter animal age : ");
		int age = Integer.parseInt(bufferedReader.readLine());
		System.out.print("Enter animal species : ");
		String species = bufferedReader.readLine();

		animals[getAnimalCount()] = new Animal(name, age, species);

	}

	public static int getAnimalCount() {
		return animalCount;
	}

	public String getAnimalName() {
		return name;
	}

	public int getAnimalAge() {
		return age;
	}

	public String getAnimalSpecies() {
		return species;
	}

}

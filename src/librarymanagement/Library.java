package librarymanagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Library {
	public static Book[] books;
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public Library() {
		books = new Book[100];
	}

	public static void addBook() throws IOException {
		System.out.print("Enter details for a new book : ");
		String title = bufferedReader.readLine();
		System.out.print("Subtitle(or press Enter to skip) : ");
		String subtitle = bufferedReader.readLine();
		if (subtitle.isEmpty()) {
			books[Book.getTotalBooks()] = new Book(title);
		} else {
			books[Book.getTotalBooks()] = new Book(title, subtitle);
		}
	}

	public void displayAllBooks() {
		System.out.println("Library Inventory : ");
		for (int i = 0; i < Book.getTotalBooks(); i++) {
			books[i].displayInfo();
		}
		System.out.println("Total number of books created: " + Book.getTotalBooks());
	}
}

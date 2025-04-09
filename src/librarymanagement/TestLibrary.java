package librarymanagement;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestLibrary {
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		String result;
		Library library = new Library();
		do {
			Library.addBook();
			System.out.print("Do you want to continue (yes/no) : ");
			result = bufferedReader.readLine();
			System.out.println();
		} while (result.equals("yes"));
		library.displayAllBooks();

	}

}

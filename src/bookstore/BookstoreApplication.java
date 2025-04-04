package bookstore;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BookstoreApplication {
    static Book[] books = new Book[50];
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    static int bCount =0;
	public static void main(String[] args) throws IOException{
		String result;
		do {
			books[bCount]=Book.getBookInfo();
			bCount++;
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
		}while(result.equals("yes"));
		int choice;
		System.out.println();
		while (true) {
			System.out.println();
            System.out.println("Bookstore Application");
            System.out.println("1. Display all books");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Purchase a book");
            System.out.println("4. Add stock to a book");
            System.out.print("Enter your choice in number : ");
            choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1:
                	System.out.println();
                    displayBook();
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String search = bufferedReader.readLine();
                    searchBookByTitle(search);
                    break;
                case 3:
                    System.out.print("Enter book title to purchase: ");
                    String purTitle = bufferedReader.readLine();
                    System.out.print("Enter quantity to purchase: ");
                    int purQuantity = Integer.parseInt(bufferedReader.readLine());
                    purchaseBook(purTitle,purQuantity);
                    break;
                case 4:
                    System.out.print("Enter book title to add stock: ");
                    String stockTitle = bufferedReader.readLine();
                    System.out.print("Enter quantity to add: ");
                    int addQuantity = Integer.parseInt(bufferedReader.readLine());
                    addStock(stockTitle, addQuantity);
                    break;
                default:
                    System.out.println("Invalid");
            }System.out.println();
        }
		
	}
	public static void displayBook() {
		for(int i=0;i<Book.bookCount;i++) {
			System.out.println(books[i].toString());
		}
	}
	public static void searchBookByTitle(String title) {
        for (int i=0;i<Book.bookCount;i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book found \n" + books[i].toString());
                return;
            }
        }System.out.println("Book not found");
        
    }

    public static void purchaseBook(String title, int quantity) {
        for (int i=0;i<Book.bookCount;i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if (books[i].quantity >= quantity) {
                    books[i].updateStock(-quantity);
                    double totalCost = books[i].price*quantity;
                    System.out.println("Total cost : " + totalCost);
                } else {
                    System.out.println("Not enough stock");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void addStock(String title, int quantity) {
        for (int i = 0; i < Book.bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                books[i].updateStock(quantity);
                System.out.println("Updated Stock :"+books[i].quantity);
                return;
            }
        }
        System.out.println("Book not found.");
    }

}

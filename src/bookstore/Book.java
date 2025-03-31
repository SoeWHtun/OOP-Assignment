package bookstore;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Book {
       String title;
       String author;
       double price;
       int quantity;
       static int bookCount=0;
       
       public Book(String title,String author,double price,int quantity) {
    	   this.title=title;
    	   this.author=author;
    	   this.price=price;
    	   this.quantity=quantity;
    	   bookCount++;
       }
       
       @Override
       public String toString() {
    	   return "Book title : "+this.title+" | "+"Author : "+this.author+" | "+"Price : "+this.price+" | "+"Quantity : "+this.quantity+" | ";
       }
       
       public int updateStock(int num) {
    	  return this.quantity+=num;
    	   
       }
      
       public static Book getBookInfo()throws IOException {
    	 InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      	 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      	 System.out.print("Enter the title of the book : ");
      	 String title = bufferedReader.readLine();
      	 System.out.print("Enter the author name : ");
      	 String author = bufferedReader.readLine();
      	 System.out.print("Enter the price of the book : ");
      	 double price = Double.parseDouble(bufferedReader.readLine());
      	 System.out.print("Enter the quantity of the book : ");
     	 int quantity = Integer.parseInt(bufferedReader.readLine());
      	 System.out.println();
      	 
      	 return new Book(title,author,price,quantity);
       }
       
      
	
}

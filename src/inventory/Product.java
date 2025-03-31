package inventory;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Product {
       String name;
       String category;
       int quantity;
       double pricePerUnit;
       static int productCount=0;
       
     public Product(String name,String category,int quantity,double pricePerUnit) {
    	 this.name=name;
    	 this.category=category;
    	 this.quantity=quantity;
    	 this.pricePerUnit=pricePerUnit;
    	 productCount++;
     }
     public double totalValue() {
    	 return this.pricePerUnit*this.quantity;
    	 
     }
     @Override
     public String toString() {
    	 return "Product Name : "+this.name+" | "+"Category : "+this.category+" | "+"Quantity : "+this.quantity+" | "+"Price Per Unit : "+this.pricePerUnit+" | ";
     }
     public static Product getProductInfo()throws IOException {
    	 InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    	 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    	 System.out.print("Enter the name of the product : ");
    	 String name = bufferedReader.readLine();
    	 System.out.print("Enter the catrgory : ");
    	 String category = bufferedReader.readLine();
    	 System.out.print("Enter the quantity : ");
    	 int quantity = Integer.parseInt(bufferedReader.readLine());
    	 System.out.print("Enter the price per unit : ");
    	 double pricePerUnit = Double.parseDouble(bufferedReader.readLine());
    	 System.out.println();
    	 
    	 return new Product(name,category,quantity,pricePerUnit);
     }
}


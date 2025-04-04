package inventory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductManagement {
    static Product[] products = new Product[100];
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    static int pCount =0;
	public static void main(String[] args)throws IOException {
		String result;
		do {
			products[pCount]=Product.getProductInfo();
			pCount++;
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
		}while(result.equals("yes"));
		System.out.println();
		displayTotalValue();
		System.out.println();
		displayProductInfo();
		System.out.println();
		findHighestQuantity();
		System.out.println();
		totalInventoryValue();	
	}
	public static void displayTotalValue() {
		for(int i = 0;i < Product.productCount;i++) {
    		System.out.println("Product "+(i+1)+" total value : "+products[i].totalValue());
    	}
	}
    public static void displayProductInfo() {
    	for(int i = 0;i < Product.productCount;i++) {
    		System.out.println(products[i].toString());
    	}
    }
    public static void findHighestQuantity() {
    	Product highest = products[0];
    	for(int i=1;i<Product.productCount;i++) {
    		if(products[i].quantity>highest.quantity) {
    			highest=products[i];
    		}
    	System.out.println("The product with highest quantity : "+highest.name+" | Quantity : "+highest.quantity);
    	}
    	
    }
    public static void totalInventoryValue() {
    	double total=0;
    	for(int j=0;j<Product.productCount;j++) {
    		total+=products[j].totalValue();
    	}
    	System.out.println("The total value of the whole inventory : "+total);
    }
}

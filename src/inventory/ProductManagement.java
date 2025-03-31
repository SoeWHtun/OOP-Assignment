package inventory;
import java.io.IOException;

public class ProductManagement {
    static Product[] products = new Product[100];
	public static void main(String[] args)throws IOException {
		products[0]=Product.getProductInfo();
		products[1]=Product.getProductInfo();
		System.out.println("Product 1 total value : "+products[0].totalValue());
		System.out.println("Product 2 total value : "+products[1].totalValue());
		System.out.println();
		displayProductInfo();
		System.out.println();
		findHighestQuantity();
		System.out.println();
		totalInventoryValue();
		

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

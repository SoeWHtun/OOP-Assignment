package bank;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MoneySaverApplication {

	public static void main(String[] args)throws IOException {
		 InputStreamReader inputStreamReader = new InputStreamReader(System.in);
         BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
         System.out.print("Enter initial deposit amount : ");
         double balance = Double.parseDouble(bufferedReader.readLine());
         System.out.print("Set password : ");
         String password = bufferedReader.readLine();
         MoneySaver moneySaver = new MoneySaver(balance,password);
        
         while(true) {
        	 System.out.println();
        	 System.out.println("Money Saver");
        	 System.out.println("1. Check Deposit");
        	 System.out.println("2. Withdraw");
        	 System.out.println("3. Deposit");
        	 System.out.println("Enter your choice");
        	 int choice = Integer.parseInt(bufferedReader.readLine());
        	 switch(choice) {
        	 case 1:
        		 System.out.println();
        		 System.out.println("Enter password");
        		 String pw = bufferedReader.readLine();
        		 moneySaver.checkBalance(pw);
        		 break;
        	 case 2:
        		 System.out.println();
        		 System.out.println("Enter password");
        		 String pw1 = bufferedReader.readLine();
        		 System.out.println("Enter withdraw amount");
        		 double amount = Double.parseDouble(bufferedReader.readLine());
        		 moneySaver.withdraw(pw1, amount);
        		 break;
        	 case 3:
        		 System.out.println();
        		 System.out.println("Enter deposit amount");
        		 double amount1 = Double.parseDouble(bufferedReader.readLine());
        		 moneySaver.deposit(amount1);
        		 break;
             default:
            	 System.out.println();
            	 System.out.println("Invalid Choice");
        	 }
         }
	}

}

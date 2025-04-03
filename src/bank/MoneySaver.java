package bank;

public class MoneySaver {
     double balance;
     String password;
     
     public MoneySaver(double balance,String password) {
    	 this.balance=balance;
    	 this.password=password;
     }
     public boolean checkPassword(String password) {
    	 return this.password.equals(password);
     }
     public void checkBalance(String password) {
    	 if(this.checkPassword(password)) {
    		 System.out.println("Balance : "+this.balance);
    	 }else {
    		 System.out.println("Wrong password");
    	 }
     }
     public void withdraw(String password,double amount) {
    	 if(this.checkPassword(password)) {
    		 if(amount<this.balance) {
    			 this.balance-=amount;
    			 System.out.print("Remaining balance "+this.balance);
    		 }else {
    			 System.out.println("Not enough balance");
    		 }
    	 }else {
    		 System.out.println("Wrong password");
    	 }
     }
     public void deposit(double amount) {
    	 this.balance+=amount;
		 System.out.print("Remaining balance "+this.balance);
     }
}

package feedback;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CustomerFeedback {
          String name;
          String email;
          String feedback;
          int rating;
          static int feedbackCount=0;
          
  public CustomerFeedback(String name,String email,String feedback,int rating) {
	  this.name=name;
	  this.email=email;
	  this.feedback=feedback;
	  this.rating=rating;
	  feedbackCount++;
  }
  @Override
  public String toString() {
	  return "Customer name : "+this.name+" | "+"Email : "+this.email+" | "+"Feedback : "+this.feedback+" | "+"Rating : "+this.rating+" | ";
  }
  public static CustomerFeedback getFeedback()throws IOException{
	  InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	  BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	  System.out.print("Enter your name : ");
	  String name = bufferedReader.readLine();
	  System.out.print("Enter your email : ");
	  String email = bufferedReader.readLine();
	  System.out.print("Enter your feedback : ");
	  String feedback = bufferedReader.readLine();
	  System.out.print("Enter the rating (0-5) : ");
	  int rating = Integer.parseInt(bufferedReader.readLine());
	  System.out.println();
	  
	  return new CustomerFeedback(name,email,feedback,rating);
  }
   
}

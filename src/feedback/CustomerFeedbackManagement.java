package feedback;
import java.io.IOException;

public class CustomerFeedbackManagement {
    static CustomerFeedback[] feedbacks = new CustomerFeedback[50];
	public static void main(String[] args)throws IOException {
		feedbacks[0]=CustomerFeedback.getFeedback();
		feedbacks[1]=CustomerFeedback.getFeedback();
		System.out.println();
		displayFeedbackInfo();
		System.out.println("Average feedback rating : "+calculateAverageRating());
		System.out.println("Feedback with highest rating : "+findHighestRating());
		System.out.println("Number of feedback with rating 5 : "+countRating5());
	}
	public static void displayFeedbackInfo() {
		for(int i=0;i<CustomerFeedback.feedbackCount;i++ ) {
			System.out.println(feedbacks[i].toString());
		}
	}
	public static int calculateAverageRating() {
		int total=0;
		for(int j=0;j<CustomerFeedback.feedbackCount;j++) {
			total+=feedbacks[j].rating;
		}
		return total/CustomerFeedback.feedbackCount;
	}
	public static String findHighestRating() {
		CustomerFeedback highest = feedbacks[0];
		for(int i=1;i<CustomerFeedback.feedbackCount;i++) {
			if(feedbacks[i].rating>highest.rating) {
				highest.rating=feedbacks[i].rating;
			}	
		}
		return highest.feedback;
	}
	public static int countRating5() {
	    int count = 0;
	    for (int j = 0; j < CustomerFeedback.feedbackCount; j++) {
	        if (feedbacks[j].rating == 5) {
	            count++;
	        }
	    }
	    return count;
	}

}

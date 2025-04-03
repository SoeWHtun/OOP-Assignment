package moviebooking;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Movie {
      String movieName;
      String genre;
      int availableSeats;
      double ticketPrice;
      static int movieCount;
      int bookedSeat;
      
      public Movie(String movieName,String genre,int availableSeats,double ticketPrice) {
    	  this.movieName=movieName;
    	  this.genre=genre;
    	  this.availableSeats=availableSeats;
    	  this.ticketPrice=ticketPrice;
    	  movieCount++;
      }
      @Override
      public String toString() {
    	  return "Movie Name : "+this.movieName+" | "+"Genre : "+this.genre+" | "+"Available seats : "+this.availableSeats+" | "+"Ticket Price : "+this.ticketPrice+" | ";
      }
      public void bookTicket(String movieName,int num) {
    	  if (this.movieName.equalsIgnoreCase(movieName)) {
              if (this.availableSeats >= num) {
                  this.availableSeats -= num;
                  this.bookedSeat+=num;
                  System.out.println("Booked Tickets : " + num);
              } else {
                  System.out.println("Not enough seats available");
              }
          }
      }
      public double totalEarning() {
    	 return this.bookedSeat*this.ticketPrice;
      }
      public static Movie getMovieInfo()throws IOException {
    	 InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       	 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       	 System.out.print("Enter the name of the movie : ");
       	 String movieName = bufferedReader.readLine();
       	 System.out.print("Enter the genre : ");
       	 String genre = bufferedReader.readLine();
       	 System.out.print("Enter available seats : ");
       	 int availableSeats = Integer.parseInt(bufferedReader.readLine());
       	 System.out.print("Enter the price of the tickets : "); 
         double ticketPrice = Double.parseDouble(bufferedReader.readLine());
       	 System.out.println();
       	 
       	 return new Movie(movieName,genre,availableSeats,ticketPrice);

      }
}

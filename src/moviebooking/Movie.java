package moviebooking;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Movie {
      private String movieName;
      private String genre;
      private int availableSeats;
      private double ticketPrice;
      private static int movieCount;
      private int bookedSeat;
      private static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      private static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      
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
      public String getMovieName() {
    	  return movieName;
      }
      public String getMovieGenre() {
    	  return genre;
      }
      public int getAvailabeSeats() {
    	  return availableSeats;
      }
      public double getTicketPrice() {
    	  return ticketPrice;
      }
      public static int getMovieCount() {
    	  return movieCount;
      }
      public int getBookedSeat() {
    	  return bookedSeat;
      }
}

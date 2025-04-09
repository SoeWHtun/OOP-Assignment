package moviebooking;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MovieBookingManagement {
    static Movie[] movies = new Movie[10];
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	public static void main(String[] args)throws IOException {
		String result;
		do {
			movies[Movie.getMovieCount()]=Movie.getMovieInfo();
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
		}while(result.equals("yes"));
		int choice =0;
		System.out.println();
		while(true) {
			System.out.println("Movie Booking Application");
			System.out.println("1. Display all movies");
			System.out.println("2. Book ticket for a movie");
			System.out.println("3. Display the movie with the highest earning");
			System.out.println("4. Display available seat for a movie");
			System.out.print("Enter your choice in number : ");
	       	choice = Integer.parseInt(bufferedReader.readLine());
			switch(choice) {
			case 1:
				System.out.println();
				displayMovieInfo();
				break;
			case 2:
				System.out.println();
				System.out.println("Enter the name of the movie : ");
				String movieName=bufferedReader.readLine();
				System.out.println("Enter the number of tickets: ");
				int num = Integer.parseInt(bufferedReader.readLine());
				bookTicket(movieName,num);
				break;
			case 3:
				System.out.println();
				System.out.println("The movie with highest earning :"+highestEarning());
				break;
			case 4:
				System.out.println();
				System.out.println("Enter the name of the movie : ");
				String name=bufferedReader.readLine();
				System.out.println("Available Seats : "+displayAvailableSeats(name));
				break;
			default : System.out.println("Invalid");
			}System.out.println();
		}
	}
	public static void displayMovieInfo() {
		for(int i=0;i<Movie.getMovieCount();i++) {
			System.out.println(movies[i].toString());
		}
	}
	public static void bookTicket(String movieName, int num) {
        for (int i = 0; i < Movie.getMovieCount(); i++) {
            if (movies[i].getMovieName().equalsIgnoreCase(movieName)) {
                movies[i].bookTicket(movieName, num);
            }
        }
    }
	public static String highestEarning() {
		Movie highest = movies[0];
		for(int i=1;i<Movie.getMovieCount();i++) {
			if(movies[i].totalEarning()>highest.totalEarning()) {
				highest=movies[i];
			}
		}return highest.getMovieName();	
	}
	public static int displayAvailableSeats(String movieName) {
		int avail = 0;
		for (int i = 0; i < Movie.getMovieCount(); i++) {
            if (movies[i].getMovieName().equalsIgnoreCase(movieName)) {
                avail=movies[i].getAvailabeSeats();
            }
        }return avail;
	}

}

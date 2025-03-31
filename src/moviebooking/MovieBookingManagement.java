package moviebooking;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MovieBookingManagement {
    static Movie[] movies = new Movie[10];
	public static void main(String[] args)throws IOException {
		movies[0]=Movie.getMovieInfo();
		movies[1]=Movie.getMovieInfo();
		int choice =0;
		System.out.println();
		while(true) {
			System.out.println("Movie Booking Application");
			System.out.println("1. Display all movies");
			System.out.println("2. Book ticket for a movie");
			System.out.println("3. Display the movie with the highest earning");
			System.out.println("4. Display available seat for a movie");
			System.out.print("Enter your choice in number : ");
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	       	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
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
		for(int i=0;i<Movie.movieCount;i++) {
			System.out.println(movies[i].toString());
		}
	}
	public static void bookTicket(String movieName, int num) {
        for (int i = 0; i < Movie.movieCount; i++) {
            if (movies[i].movieName.equalsIgnoreCase(movieName)) {
                movies[i].bookTicket(movieName, num);
            }
        }
    }
	public static String highestEarning() {
		Movie highest = movies[0];
		for(int i=1;i<Movie.movieCount;i++) {
			if(movies[i].totalEarning()>highest.totalEarning()) {
				highest=movies[i];
			}
		}return highest.movieName;	
	}
	public static int displayAvailableSeats(String movieName) {
		int avail = 0;
		for (int i = 0; i < Movie.movieCount; i++) {
            if (movies[i].movieName.equalsIgnoreCase(movieName)) {
                avail=movies[i].availableSeats;
            }
        }return avail;
	}

}

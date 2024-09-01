import java.util.Scanner;

public class GettingInputs {

	public static void main(String[] args) {
		int year;
		String genre;
		String album;
		String title;
		String artist;
		
		Scanner scanner = new Scanner(System.in);
		
		// year
		System.out.println("Enter the year: ");
		year = scanner.nextInt();
		scanner.nextLine();
		
		// genre
		System.out.println("Enter the genre: ");
		genre = scanner.nextLine();
		
		// album
		System.out.println("Enter the album: ");
		album = scanner.nextLine();
		
		// title
		System.out.println("Enter the title: ");
		title = scanner.nextLine();
		
		// artist
		System.out.println("Enter the artist: ");
		artist = scanner.nextLine();
		
		// output
		System.out.println("--------------------------");
		System.out.println("SONG DETAILS");
		System.out.println("--------------------------");
		System.out.println("Year Released: " +year);
		System.out.println("Genre: " +genre);
		System.out.println("Album: " +album);
		System.out.println("Title: " +title);
		System.out.println("Artist: " +artist);
	}

}

import java.util.Scanner;

public class GettingGreater {

	public static void main(String[] args) {
		char first;
		char second;
		char max;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Getting the Greater Value");
		System.out.println("Enter first character: ");
		first = scanner.next().charAt(0);
		System.out.println("Enter the second character: ");
		second = scanner.next().charAt(0);
		
		// comparing the 2 characters
		max = (char) Math.max(first, second);
		System.out.println("-------------------------------------------");
		System.out.println("The character with the greater value is: " +max);
		System.out.println("-------------------------------------------");
		System.out.println("Showing the ASCII Codes");
		System.out.println(first+ " : " + (int) first);
		System.out.println(second+ " : " + (int) second);
	}

}

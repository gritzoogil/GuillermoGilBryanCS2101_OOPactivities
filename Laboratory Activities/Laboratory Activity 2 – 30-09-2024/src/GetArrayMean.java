import java.util.Scanner;

public class GetArrayMean {
	public static double getArrayMean(int [] arr) {
		int n = arr.length; // number of integers
		int sum = 0;
		for(int i = 0; i < n; i++ ) {
			sum += arr[i];
		}
		double mean = (double) sum / n;
		return mean;
	}

	public static void main(String[] args) {		
		int n = 0; // number of integers
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		n = scanner.nextInt();
		scanner.nextLine();
		
		int [] arr; // array initialize
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			arr[i]= scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
		
		double mean = getArrayMean(arr); // call getArrayMean function
		System.out.printf("Mean of array is: %.2f%n", mean); // %.2f%n for 2 decimal places
	
	}

}

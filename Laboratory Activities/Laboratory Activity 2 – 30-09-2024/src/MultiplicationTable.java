import java.util.Scanner;

public class MultiplicationTable {
    public static void fillMultiplicationTable(int[][] table) {
        int size = table.length; // get the size of the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1); // fill the table with products
            }
        }
    }
    public static void printMultiplicationTable(int[][] table) {
        System.out.println("Multiplication Table:");
        int size = table.length; // get the size of the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println(); // move to the next line after each row
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();
        scanner.close();
        
        int[][] table; // table array initialize
        table = new int[size][size]; 
        
        fillMultiplicationTable(table); // fill
        printMultiplicationTable(table); // print

    }
}

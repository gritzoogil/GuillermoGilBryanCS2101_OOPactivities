import java.util.Scanner;

public class Tempconvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        Float celsius = scanner.nextFloat();
        Float farenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " Celsius is " + farenheit + " Farenheit");
        scanner.close();
        
    }

}

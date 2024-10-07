import encapsulation.Car;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("red", 19999.85, 'm');
		Car car2 = new Car("blue", 50000.00, 'L');
		
		System.out.println(car1);
		System.out.println(car2);

	}

}

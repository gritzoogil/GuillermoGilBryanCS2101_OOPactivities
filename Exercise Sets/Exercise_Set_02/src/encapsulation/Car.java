package encapsulation;

public class Car {
	
	// private properties
	private String color;
	private double price;
	private char size;
	
	// constructor
	public Car(String color, double price, char size) {
		this.color = color;
		this.price = price;
		this.size = Character.toUpperCase(size);

	}
	
	// getters
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public char getSize() {
		return size;
	}
	
	// setters
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public void setSize(char size) {
		this.size = Character.toUpperCase(size);
	}
	
	// toString()
	public String toString() {
		String sizeDecriptor;
		
		switch (size) {
		case 'S':
			sizeDecriptor = "small";
			break;
		case 'M':
			sizeDecriptor = "medium";
			break;
		case 'L':
			sizeDecriptor = "large";
			break;
		default:
			sizeDecriptor = "unknown";
			break;
		}
		
		return String.format("Car (%s) - P%.2f - %s", color, price, sizeDecriptor);
	}

}

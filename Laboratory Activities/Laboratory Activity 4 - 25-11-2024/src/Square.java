
public class Square implements Shape {
	private double size;
	
	// constructor
	public Square(double size) {
		this.size = size;
	}
	
	@Override
	public double getArea() {
		return size * size; // s^2
	}
	
	@Override
	public double getPerimeter() {
		return 4 * size; // 4s
	}
	
	@Override
	public void printShapeType() {
		System.out.println("Square");
	}
}

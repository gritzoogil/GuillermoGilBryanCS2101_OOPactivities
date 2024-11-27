
public class Rectangle implements Shape {
	private double length, width;
	
	// constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width; // l x w
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (length + width); // 2l x 2w
	}
	
	@Override
	public void printShapeType() {
		System.out.println("Rectangle");
	}
}

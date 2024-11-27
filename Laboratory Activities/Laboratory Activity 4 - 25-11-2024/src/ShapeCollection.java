
public class ShapeCollection {
	private Shape[] shapes;
	
	// constructor
	public ShapeCollection(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	// method to calculate and print area and perimeter
	public void getPropertyValues() {
		for (Shape shape : shapes) {
			shape.printShapeType();
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
			System.out.println();
		}
	}
}

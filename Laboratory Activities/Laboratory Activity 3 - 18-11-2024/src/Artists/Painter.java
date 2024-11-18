
public class Painter extends Artist{
	private Medium medium;
	
	// enum
	public enum Medium {
		OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
	}
	
	// constructor
	public Painter(String name, int age, String speciality, Medium medium) {
		super(name, age, speciality);
		this.medium = medium;
	}
	
	// getter
	public Medium getMedium() {
		return medium;
	}
	
	@Override
	public String toString() {
		return "Painter's Info:\n" +
				super.toString() + "\n" +
				"Medium: " + medium;
	}
}
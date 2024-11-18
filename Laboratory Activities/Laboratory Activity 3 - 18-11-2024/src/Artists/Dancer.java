
public class Dancer extends Artist{
	private DanceStyle danceStyle;
	
	// enum
	public enum DanceStyle {
		BALLET, HIPHOP, JAZZ, CONTEMPORA
	}
	
	// constructor
	public Dancer(String name, int age, String speciality, DanceStyle danceStyle) {
		super(name, age, speciality);
		this.danceStyle = danceStyle;
	}
	
	// getter
	public DanceStyle getDanceStyle() {
		return danceStyle;
	}
	
	@Override
	public String toString() {
		return "Dancer's Info:\n" +
				super.toString() + "\n" +
				"Dance Style: " + danceStyle;
	}
}
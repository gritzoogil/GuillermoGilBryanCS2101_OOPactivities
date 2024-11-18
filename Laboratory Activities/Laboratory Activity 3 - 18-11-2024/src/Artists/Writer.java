
public class Writer extends Artist{
	private WritingStyle writingStyle;
	
	// enum
	public enum WritingStyle {
		FICTION, NONFICTION, POETRY, DRAMA
	}
	
	// constructor
	public Writer(String name, int age, String speciality, WritingStyle writingStyle) {
		super(name, age, speciality);
		this.writingStyle = writingStyle;
	}
	
	// getter
	public WritingStyle getWritingStyle() {
		return writingStyle;
	}
	
	@Override
	public String toString() {
		return "Writer's Info:\n" +
				super.toString() + "\n" + 
				"Writing Style: " + writingStyle;
	}
}

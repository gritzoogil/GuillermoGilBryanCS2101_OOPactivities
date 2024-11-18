public class Artist {
	private String name;
	private int age;
	private String speciality;
	
	// constructor
	public Artist(String name, int age, String speciality) {
		this.name = name;
		this.age = age;
		this.speciality = speciality;
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	@Override
	public String toString() {
		return "Artist Name: " + name + "\n" +
				"Age: " + age + "\n" + 
				"Speciality: " + speciality;
	}
}
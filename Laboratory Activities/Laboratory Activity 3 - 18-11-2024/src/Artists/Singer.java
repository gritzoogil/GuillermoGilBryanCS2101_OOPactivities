
public class Singer extends Artist{
	private Genre genre;
	
	// enum
	public enum Genre {
		POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
	}
	
	// constructor
    public Singer(String name, int age, String specialty, Genre genre) {
        super(name, age, specialty);
        this.genre = genre;
    }
    
    // getter
    public Genre getGenre() {
    	return genre;
    }
    
    @Override
    public String toString() {
    	return "Singer's Info: \n"+
    			super.toString() + "\n" +
    			"Genre: " + genre;
    }
}

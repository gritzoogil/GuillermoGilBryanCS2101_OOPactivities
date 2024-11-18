
public class ArtistDemo {

    public static void main(String[] args) {
        // artist instance
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        // System.out.println(artist);

        // singer instance
        Singer singer = new Singer("Nayeon Im", 29, "Music", Singer.Genre.POP);
        // System.out.println(singer);

        // dancer instance
        Dancer dancer = new Dancer("Misty Copeland", 41, "Dance", Dancer.DanceStyle.BALLET);
        // System.out.println(dancer);

        // painter instance
        Painter painter = new Painter("Van Gogh", 37, "Painting", Painter.Medium.OIL);
        // System.out.println(painter);

        // writer instance
        Writer writer = new Writer("Shakespeare", 52, "Writing", Writer.WritingStyle.DRAMA);
        // System.out.println(writer);
    }

}
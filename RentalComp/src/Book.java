public class Book extends Equipment {
    private String genre;

    public Book(String name, double rentValue, String genre) {
        super(name, rentValue);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}


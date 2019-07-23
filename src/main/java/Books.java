public class Books {

    private String title;
    private String author;
    private String genre;


    public Books(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String findTitle() {
        return title;
    }

    public String findAuthor() {
        return author;

    }
    public String findGenre() {
        return genre;

    }




}

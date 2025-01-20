public class Book {
    private String title;
    private String author;
    private int ISBN;

    //Default constructor
    public Book() {
    }
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getISBN() {
        return ISBN;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}

import java.util.ArrayList;

public class Collection {
    private ArrayList<Book> collection;

    public Collection() {
        this.collection = new ArrayList<>();
    }
    public void addToCollection(Book bookTitle){
        this.collection.add(bookTitle);
    }
    public String getAllBooks(){
        StringBuilder books = new StringBuilder();
        if(collection.isEmpty()){
            return "There are no books in the collection";
        }
        for(Book book : collection){
            books.append(book.toString()).append("\n");
        };
        return books.toString();
    }
    public Book getBookByTitle(String title){
        Book book = new Book();
        for(Book books : collection){
            if(books.getTitle().equalsIgnoreCase(title)){
                book = books;
            }
        }
        return book;
    }
    public Book getBookByAuthor(String author){
        Book book = new Book();
        for(Book books : collection){
            if(books.getAuthor().equalsIgnoreCase(author)){
                book = books;
            }
        }
        return book;
    }
}

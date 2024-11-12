public class Book extends ReadingItem {
    private String isbn;
    private String edition;
    private String title;
    public Book(String name, String description, int price, int wordCount, String datePublished, String author, String isbn, String edition, String title) {
        super(name, description, price, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nWord Count: " + getWordCount() + "\nDate Published: " + getDatePublished() + "\nAuthor: " + getAuthor() + "\nISBN: " + isbn + "\nEdition: " + edition + "\nTitle: " + title;
    }
}

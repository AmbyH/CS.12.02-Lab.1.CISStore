public class ReadingItem extends CISItem {
    private int wordCount;
    private String datePublished;
    private String author;
    public ReadingItem(String name, String description, int price, int wordCount, String datePublished, String author) {
        super(name, description, price);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nWord Count: " + wordCount + "\nDate Published: " + datePublished + "\nAuthor: " + author;
    }

}

public class Magazine extends ReadingItem {
    private String coverStoryTitle;
    private String printDate;
    public Magazine(String name, String description, int price, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, description, price, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nWord Count: " + getWordCount() + "\nDate Published: " + getDatePublished() + "\nAuthor: " + getAuthor() + "\nCover Story Title: " + coverStoryTitle + "\nPrint Date: " + printDate;
    }
}

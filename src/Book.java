public class Book implements Comparable<Book>{
    private String bookName;
    private String author;
    private int pageNumber;
    private int publishDate;

    public Book(String bookName, String author, int pageNumber, int publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}

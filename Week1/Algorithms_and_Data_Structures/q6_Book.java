public class q6_Book implements Comparable<q6_Book> {
    private int bookId;
    private String title;
    private String author;

    public q6_Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(q6_Book other) {
        return this.title.compareTo(other.title);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q6_LibraryManagementSystem {
    private List<q6_Book> books;

    public q6_LibraryManagementSystem() {
        this.books = new ArrayList<>();
    }

    public void addBook(q6_Book book) {
        books.add(book);
    }

    public void sortBooksByTitle() {
        Collections.sort(books);
    }

    // Linear search by title
    public q6_Book linearSearchByTitle(String title) {
        for (q6_Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (assumes the list is sorted)
    public q6_Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparisonResult = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (comparisonResult == 0) {
                return books.get(mid);
            } else if (comparisonResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public List<q6_Book> getBooks() {
        return books;
    }
}
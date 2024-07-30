public class q6_LibraryManagementDemo {
    public static void main(String[] args) {
        q6_LibraryManagementSystem library = new q6_LibraryManagementSystem();

        // Adding books
        library.addBook(new q6_Book(1, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new q6_Book(2, "1984", "George Orwell"));
        library.addBook(new q6_Book(3, "Pride and Prejudice", "Jane Austen"));
        library.addBook(new q6_Book(4, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new q6_Book(5, "Moly-Dick", "Herman Melville"));

        // Linear search
        String searchTitle = "1984";
        long startTime = System.nanoTime();
        q6_Book foundBook = library.linearSearchByTitle(searchTitle);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Result: " + foundBook);
        System.out.println("Linear Search Time: " + (endTime - startTime) + " ns");

        // Sort books for binary search
        library.sortBooksByTitle();

        // Binary search
        startTime = System.nanoTime();
        foundBook = library.binarySearchByTitle(searchTitle);
        endTime = System.nanoTime();
        System.out.println("Binary Search Result: " + foundBook);
        System.out.println("Binary Search Time: " + (endTime - startTime) + " ns");

        // Search for a non-existent book
        searchTitle = "Nonexistent Book";
        System.out.println("\nSearching for: " + searchTitle);
        System.out.println("Linear Search Result: " + library.linearSearchByTitle(searchTitle));
        System.out.println("Binary Search Result: " + library.binarySearchByTitle(searchTitle));
    }
}
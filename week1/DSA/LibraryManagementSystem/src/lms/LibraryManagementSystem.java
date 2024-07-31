package lms;

import java.util.Arrays;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem(List<Book> books) {
        this.books = books;
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    // Binary search to find books by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);

            int comparison = midBook.getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return midBook; // Found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book(1, "Effective Java", "Joshua Bloch"),
            new Book(2, "The End Of Us", "Colleen Hover"),
            new Book(3, "Design Patterns", "Erich Gamma")
                );

        // Assuming the list is sorted by title
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        LibraryManagementSystem library = new LibraryManagementSystem(books);

        // Linear search
        String searchTitleLinear = "The End Of Us";
        Book foundBookLinear = library.linearSearchByTitle(searchTitleLinear);
        if (foundBookLinear != null) {
            System.out.println("Linear Search: Found book - " + foundBookLinear);
        } else {
            System.out.println("Linear Search: Book not found with title - " + searchTitleLinear);
        }

        // Binary search
        String searchTitleBinary = "Effective Java";
        Book foundBookBinary = library.binarySearchByTitle(searchTitleBinary);
        if (foundBookBinary != null) {
            System.out.println("Binary Search: Found book - " + foundBookBinary);
        } else {
            System.out.println("Binary Search: Book not found with title - " + searchTitleBinary);
        }
    }
}

package com.raks.BookstoreAPI.controller;

import com.raks.BookstoreAPI.dto.BookDTO;
import com.raks.BookstoreAPI.exception.BookNotFoundException;
import com.raks.BookstoreAPI.mapper.BookMapper;
import com.raks.BookstoreAPI.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // In-memory list to simulate a database
    private List<Book> books = new ArrayList<>();

    // GET method to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    // POST method to add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
        // PUT method to update an existing book by ID
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
            for (Book book : books) {
                if (book.getId().equals(id)) {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthor(updatedBook.getAuthor());
                    book.setPrice(updatedBook.getPrice());
                    book.setIsbn(updatedBook.getIsbn());
                    return book;
                }
            }
            return null; 
        }

    // DELETE method to delete a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
            books.removeIf(book -> book.getId().equals(id));    
    }     
        @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
            for (Book book : books) {
                if (book.getId().equals(id)) {
                    return book;  // Return the book if found
                }
            }
            throw new BookNotFoundException("Book not found with id: " + id);  // Or handle it with a custom exception

            }
        @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                      @RequestParam(required = false) String author) {
            List<Book> filteredBooks = new ArrayList<>();
            
            for (Book book : books) {
                boolean matches = true;
                if (title != null && !book.getTitle().equalsIgnoreCase(title)) {
                    matches = false;
                }
                if (author != null && !book.getAuthor().equalsIgnoreCase(author)) {
                    matches = false;
                }
                if (matches) {
                    filteredBooks.add(book);
                }
            }
            
            return filteredBooks;  // Return the filtered list (which may be empty)
        }
        @GetMapping("/{id}")
        public Book getBookById1(@PathVariable Long id) {
            return books.stream()
                        .filter(book -> book.getId().equals(id))
                        .findFirst()
                        .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
        }
        @GetMapping("/{id}")
        public BookDTO getBookById11(@PathVariable Long id) {
            Book book = books.stream()
                             .filter(b -> b.getId().equals(id))
                             .findFirst()
                             .orElseThrow(() -> new BookNotFoundException("Book not found with id: " + id));
            return BookMapper.INSTANCE.bookToBookDTO(book);
        }


    
    }
   

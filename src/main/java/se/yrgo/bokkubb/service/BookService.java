package se.yrgo.bokkubb.service;

import org.springframework.stereotype.Service;
import se.yrgo.bokkubb.domain.Book;

import java.util.List;

@Service
public class BookService {
    // Store the book list in the Service class.
    // The Controller can retrieve the books through Service methods,
    // keeping the code clean and responsibilities separated.
    private final List<Book> books = List.of(
            new Book("White Oleander", "Janet Fitch", "Fiction"),
            new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", "Crime"),
            new Book("The Midnight Library", "Matt Haig", "Fantasy"),
            new Book("Eleanor Oliphant Is Completely Fine", "Gail Honeyman", "Fiction"),
            new Book("Harry Potter", "J.K. Rowling", "Fantasy"),
            new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy")
    );

    public List<Book> getAllBooks() {
        return books;
    }

    // Implement the genre filtering logic in the Service class
    // instead of the Controller. This keeps the Controller focused
    // on handling requests and passing data to the View,
    // while the Service is responsible for business logic.
    public List<Book> getBooksByGenre(String type) {
        if (type == null || type.isBlank()) {
            return books;
        }

        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(type))
                .toList();
    }
}

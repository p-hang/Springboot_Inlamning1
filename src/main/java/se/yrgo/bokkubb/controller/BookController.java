package se.yrgo.bokkubb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.yrgo.bokkubb.domain.Book;
import se.yrgo.bokkubb.service.BookService;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/home")
    public String home(Model model) {

        LocalDate today = LocalDate.now();

        model.addAttribute("today", today);

        return "home";
    }

    @GetMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.getAllBooks();

        model.addAttribute("books", books);

        return "booklist";
    }

    @GetMapping("/genre")
    public String getBookByGenre(
            @RequestParam(required = false) String type,
            Model model) {

        List<Book>
                booksByGenre = bookService.getBooksByGenre(type);

        model.addAttribute("booklist", booksByGenre);
        model.addAttribute("type", type);

        return "genre";
    }
}

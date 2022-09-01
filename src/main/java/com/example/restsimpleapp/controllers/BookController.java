package com.example.restsimpleapp.controllers;

import com.example.restsimpleapp.models.Book;
import com.example.restsimpleapp.models.BookDTO;
import com.example.restsimpleapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/{id}")
    public Optional<BookDTO> bookById(@PathVariable Long id){
        Optional<Book> book = bookService.findById(id);
        return book.map(BookDTO::new);
    }

    @PostMapping("/save")
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
}

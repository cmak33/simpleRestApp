package com.example.restsimpleapp.services;

import com.example.restsimpleapp.models.Book;
import com.example.restsimpleapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void saveBook(Book book){
        bookRepository.save(book);
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}

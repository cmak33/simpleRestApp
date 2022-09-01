package com.example.restsimpleapp.models;

import lombok.Getter;

@Getter
public class BookDTO {
    private final String name;
    private final String author;
    private final Integer rating;

    public BookDTO(Book book){
        this.name = book.getName();
        this.author = book.getAuthor();
        this.rating = book.getRating();
    }
}

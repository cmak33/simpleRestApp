package com.example.restsimpleapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "ratings")
@Getter
@Setter
public class Rating {
    @GeneratedValue
    @Id
    private Long id;
    private String authorName;
    @Min(0)
    @Max(10)
    private int rating;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}

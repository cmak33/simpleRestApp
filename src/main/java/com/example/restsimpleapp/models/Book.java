package com.example.restsimpleapp.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String author;
    @Formula("(select avg(r.rating) from ratings r where r.book_id = id)")
    private Integer rating;
    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private Set<Rating> ratings;
}

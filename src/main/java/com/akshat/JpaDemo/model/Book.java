package com.akshat.JpaDemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;

//    @ManyToOne
//    @JoinColumn(name = "author_id")
    @ManyToMany(mappedBy = "books")
    private Set<Author> author;


    @Override
    public String toString() {
        return "Book{id=" + id + ", bookName='" + bookName + "'}";
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }
}
















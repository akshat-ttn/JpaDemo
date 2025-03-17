package com.akshat.JpaDemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Embedded
    private Address address;

//    @ElementCollection
//    private List<String> subjects;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "book_id", referencedColumnName = "id")
//    private Book book;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "author_id")

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)

    @ManyToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> books;

    public Author(String name, String email, Set<Book> books) {
        this.name = name;
        this.email = email;
//        this.address = address;
        this.books = books;
    }
    @Override
    public String toString() {
        return "Author{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }


}











package com.akshat.JpaDemo.service;

import com.akshat.JpaDemo.model.Author;
import com.akshat.JpaDemo.model.Book;
import com.akshat.JpaDemo.repository.AuthorRepository;
import com.akshat.JpaDemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Transactional

    public void saveAuthorsWithBooks() {
        Book book1 = new Book("Five Point Someone");
        Book book2 = new Book("2 States");
        //common
        Book book3 = new Book("The 3 Mistakes of My Life");

//        Book book4 = new Book("Murder on the Orient Express");
        Book book5 = new Book("And Then There Were None");
        Book book6 = new Book("The ABC Murders");

        Author author1 = new Author("Chetan Bhagat", "chetan@example.com", new HashSet<>(Arrays.asList(book1, book2, book3)));
        Author author2 = new Author("Agatha Christie", "agatha@example.com", new HashSet<>(Arrays.asList(book3, book5, book6)));

        authorRepository.save(author1);
        authorRepository.save(author2);

        System.out.println("Authors and books saved successfully!");
    }

//    @Transactional
    public void fetchAuthorsWithBooks() {
        authorRepository.findAll().forEach(author -> {
            System.out.println("Author: " + author.getName());
            author.getBooks().forEach(book ->
                    System.out.println("Book: " + book.getBookName())
            );
        });
    }

}

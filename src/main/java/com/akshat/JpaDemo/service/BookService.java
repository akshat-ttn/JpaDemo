package com.akshat.JpaDemo.service;

import com.akshat.JpaDemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void fetchBooksWithAuthor(){
        bookRepository.findAll().forEach(
                books -> {
                    System.out.println(books.getBookName());
                    books.getAuthor().forEach(author -> System.out.println(author.getName()));
                    System.out.println("_______________________________________________________________");
                }
        );
    }

}

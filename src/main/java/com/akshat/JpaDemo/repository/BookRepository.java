package com.akshat.JpaDemo.repository;

import com.akshat.JpaDemo.model.Author;
import com.akshat.JpaDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}

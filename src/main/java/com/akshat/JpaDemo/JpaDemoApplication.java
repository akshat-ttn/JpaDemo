package com.akshat.JpaDemo;

import com.akshat.JpaDemo.model.Employee;
import com.akshat.JpaDemo.service.AccountService;
import com.akshat.JpaDemo.service.AuthorService;
import com.akshat.JpaDemo.service.BookService;
import com.akshat.JpaDemo.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);

//        AccountService accountService = context.getBean(AccountService.class);
//        accountService.addAccounts();

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.deleteEmployeeWithMinimumSalary();
//        employeeService.addEmployee2();


//        AuthorService authorService = context.getBean(AuthorService.class);
//        authorService.saveAuthorsWithBooks();
//        authorService.fetchAuthorsWithBooks();



        BookService bookService = context.getBean(BookService.class);
        bookService.fetchBooksWithAuthor();
    }
}

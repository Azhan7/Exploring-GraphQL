package com.graphql.controller;

import com.graphql.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.graphql.service.BookService;

import java.util.List;

@Controller
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBook();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.getBook(bookId);
    }
}

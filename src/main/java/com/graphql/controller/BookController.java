package com.graphql.controller;

import com.graphql.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping()
    public List<Book> getAllBooks(){
        return this.bookService.getAllBook();
    }

    @GetMapping("/{bookId}")
    public Book get(@PathVariable int bookId){
        return this.bookService.getBook(bookId);
    }
}

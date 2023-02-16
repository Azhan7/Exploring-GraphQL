package com.graphql.service;

import com.graphql.entities.Book;
import java.util.List;

public interface BookService {

    Book create(Book book);

    List<Book> getAllBook();

    Book getBook(Integer bookId);
}

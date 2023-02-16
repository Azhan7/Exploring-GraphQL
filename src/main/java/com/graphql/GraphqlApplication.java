package com.graphql;

import com.graphql.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.graphql.service.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Title");
		b1.setAuthor("Azhan Ali");
		b1.setDesc("Description");
		b1.setPages(150);
		b1.setPrice(1500D);

		bookService.create(b1);
	}
}

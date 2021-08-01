package com.naveen.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1l,"The Power of Now 1.2","Eckart Tolle"));
	}
	
}

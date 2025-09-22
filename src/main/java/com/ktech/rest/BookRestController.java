package com.ktech.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ktech.entity.Book;
import com.ktech.service.BookService;

@RestController
@RequestMapping("/api")
public class BookRestController {
	@Autowired
	private BookService service;
	private String message;

	@PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		Optional<Book> checkBookExistOrNot = service.checkBookExistOrNot(book.getBookName());
		if (checkBookExistOrNot.isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT) // 409
					.body("Book Already Exists");
		}
		service.saveBook(book);
		message = "Successfully save book";
		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}

	@GetMapping(value = "/list")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> books = service.getBooks();
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

	@GetMapping(value = "/book/{id}")
	public ResponseEntity<Book> getBooks(@PathVariable Long id) {
		Book singleBookById = service.getSingleBookById(id);
		return new ResponseEntity<Book>(singleBookById, HttpStatus.OK);
	}

	@DeleteMapping(value = "/book/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id) {
		service.deleteBookById(id);
		return new ResponseEntity<String>("Delete book succssefully", HttpStatus.OK);
	}

	@PutMapping(value = "/book/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable Long id) {
		Book updateBook = service.updateBook(book, id);
		return new ResponseEntity<Book>(updateBook, HttpStatus.OK);
	}

}

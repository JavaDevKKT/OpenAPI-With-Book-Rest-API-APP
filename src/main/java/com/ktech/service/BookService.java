package com.ktech.service;

import java.util.List;
import java.util.Optional;
import com.ktech.entity.Book;

public interface BookService {

	Book saveBook(Book book);

	List<Book> getBooks();

	Book getSingleBookById(Long id);

	void deleteBookById(Long id);

	Book updateBook(Book book, Long id);

	Optional<Book> checkBookExistOrNot(String bookName);
}

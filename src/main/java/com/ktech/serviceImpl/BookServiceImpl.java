package com.ktech.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ktech.entity.Book;
import com.ktech.repository.BookRepository;
import com.ktech.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getSingleBookById(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book updateBook(Book book, Long id) {
		Book existingBook = bookRepository.findById(id).get(); 
		
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookName(book.getBookName());
		existingBook.setBookAutherName(book.getBookAutherName());
		
		return bookRepository.save(existingBook);
	}

	@Override
	public Optional<Book> checkBookExistOrNot(String bookName) {
		Optional<Book> byBookName = bookRepository.findByBookName(bookName);
		return byBookName;
	}
}

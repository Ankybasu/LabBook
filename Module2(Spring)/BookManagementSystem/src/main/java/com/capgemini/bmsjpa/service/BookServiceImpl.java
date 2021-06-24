package com.capgemini.bmsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.bmsjpa.entity.Book;
import com.capgemini.bmsjpa.exception.BookNotFoundException;
import com.capgemini.bmsjpa.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService{
	@Autowired
	private IBookRepository bookRepository;

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book, long bookId) {
		// TODO Auto-generated method stub
		Book existingBook=bookRepository.findById(bookId)
				.orElseThrow(() -> new BookNotFoundException("Book not found with id " + bookId));
		existingBook.setBookAvlQty(book.getBookAvlQty());
		existingBook.setBookCategory(book.getBookCategory());
		existingBook.setBookDescription(book.getBookDescription());
		existingBook.setBookName(book.getBookName());
		existingBook.setBookPrice(book.getBookPrice());
		bookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public ResponseEntity<Book> deleteBook(long id) {
		// TODO Auto-generated method stub
		Book existingBook=bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
		bookRepository.delete(existingBook);
		return ResponseEntity.ok().build();
	}

	@Override
	public List<Book> showBookByCategory(String category) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookCategory(category);
	}

	@Override
	public Book showBookByName(String name) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookName(name);
	}

	@Override
	public List<Book> showAllBooksByQty(int qty) {
		// TODO Auto-generated method stub
		return bookRepository.findAllByBookAvlQty(qty);
	}

	@Override
	public String showBookDescriptionById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.getById(id).getBookDescription()+" "+id;
	}

	@Override
	public String showBookQtyByName(String name) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookName(name).getBookAvlQty()+" "+name;
	}

	@Override
	public String showBookPriceByName(String name) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookName(name).getBookPrice()+" "+name;
	}

	@Override
	public String ShowBookPriceById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.getById(id).getBookPrice()+" "+id;
	}


}

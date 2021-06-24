package com.capgemini.bmsjpa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.bmsjpa.entity.Book;


@Service
public interface IBookService {
	public List<Book> getBooks();
	public Book getBook(long id);
	public Book addBook(Book book);
	public Book updateBook(Book book,long bookId);
	public ResponseEntity<Book>  deleteBook(long id);
	public List<Book> showBookByCategory(String category);
	public Book showBookByName(String name);
	public List<Book> showAllBooksByQty(int qty);
	public String showBookDescriptionById(long id);
	public String showBookQtyByName(String name);
	public String showBookPriceByName(String name);
	public String ShowBookPriceById(long id);
}

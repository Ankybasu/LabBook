package com.capgemini.bmsjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bmsjpa.entity.Book;
import com.capgemini.bmsjpa.service.BookServiceImpl;


@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookServiceImpl bookService;
	
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book b){
		return bookService.addBook(b);		
		
	}
	@GetMapping("/getallbooks")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}

	@GetMapping("/getbookbyid/{bookid}")
	public Book getBooks(@PathVariable("bookid")long vid){
		return bookService.getBook(vid);
	}
	
	
	@PutMapping("/updatebook/{bookid}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookid")long bookId){
		return bookService.updateBook(book, bookId);
	}
	
	@DeleteMapping("/deletebook/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id")long bid){
		return bookService.deleteBook(bid);
	}
	
	@GetMapping("/showbookbyname/{name}")
	public Book findByBookName(@PathVariable("name")String bookName){
		return bookService.showBookByName(bookName);
	}
	@GetMapping("/showbookbycategory/{category}")
	public List<Book> getBookByCategory(@PathVariable("category")String bookCategory){
		return bookService.showBookByCategory(bookCategory);
	}
	@GetMapping("/showallbooksbyqty/{qty}")
	public List<Book> showAllBooksByQty(@PathVariable("qty")int bookQty){
		return bookService.showAllBooksByQty(bookQty);
	}
	@GetMapping("/showbookdescriptionbyid/{id}")
	public String showBookDescriptionById(@PathVariable("id")long bookId){
		return bookService.showBookDescriptionById(bookId);
	}
	@GetMapping("/showbookqtybyname/{name}")
	public String showBookQtyByName(@PathVariable("name")String bookName){
		return bookService.showBookQtyByName(bookName);
	}
	@GetMapping("/showbookpricebyname/{name}")
	public String showBookDescriptionById(@PathVariable("name")String bookName){
		return bookService.showBookPriceByName(bookName);
	}
	@GetMapping("/showbookpricebyid/{id}")
	public String showBookQtyByName(@PathVariable("id")long bookId){
		return bookService.ShowBookPriceById(bookId);
	}
	

}

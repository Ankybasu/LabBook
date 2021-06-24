package com.capgemini.bmsjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.bmsjpa.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long>{
	@Query("select b from Book b where b.bookName Like %?1" )
	 Book findByBookName(String bookName);
	
	public List<Book> findAllByBookAvlQty(int bookAvlQty);
	public List<Book> findByBookCategory(String bookCategory);
}

package com.capgemini.bmsjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author ANKITA BASU
 *
 */
@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "bookorder_Sequence")
    @SequenceGenerator(name = "bookorder_Sequence", sequenceName = "ORDER_SEQ")
	@Column(name="bookid")
	private long bookId;
	
	@Column(name="bookname")
	private String bookName;

	@Column(name="bookprice")
	private double bookPrice;
	
	@Column(name="bookcategory")
	private String bookCategory;
	
	@Column(name="bookavlqty")
	private int bookAvlQty;
	
	@Column(name="bookdescription")
	private String BookDescription;
	public Book() {
		super();
	}

	public Book(String bookName, double bookPrice, String bookCategory, int bookAvlQty, String bookDescription) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookCategory = bookCategory;
		this.bookAvlQty = bookAvlQty;
		BookDescription = bookDescription;
	}
	
	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public int getBookAvlQty() {
		return bookAvlQty;
	}

	public void setBookAvlQty(int bookAvlQty) {
		this.bookAvlQty = bookAvlQty;
	}

	public String getBookDescription() {
		return BookDescription;
	}

	public void setBookDescription(String bookDescription) {
		BookDescription = bookDescription;
	}


}

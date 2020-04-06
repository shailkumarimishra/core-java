package com.onlinelibrary.dao;

import java.util.List;

import com.book.model.BookDetailsModel;

public abstract class BookServiceDao {
	public abstract boolean addBook(BookDetailsModel book);

	public abstract boolean verifyUser(String User, String password);

	public abstract int deleteBook(String bookId);

	public abstract int updateBook(BookDetailsModel book);

	public abstract List<BookDetailsModel> getBookByAuthor(String author);

	public abstract List<BookDetailsModel> getBookByName(String book);

	public abstract List<BookDetailsModel> getAllBook();
}

package com.onlinelibrary.dao;

import java.util.List;

import com.onlinelibrary.model.BookModel;

public interface BookDao {
	public abstract boolean addBook(BookModel book);

	public abstract boolean verifyUser(String User, String password);

	public abstract int deleteBook(String bookId);

	public abstract int updateBook(BookModel book);

	public abstract List<BookModel> getBookByAuthor(String author);

	public abstract List<BookModel> getBookByName(String book);

	public abstract List<BookModel> getAllBook();
}

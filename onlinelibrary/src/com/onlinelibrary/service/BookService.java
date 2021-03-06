package com.onlinelibrary.service;

import java.util.List;

import com.onlinelibrary.model.BookModel;

public interface BookService {
	public abstract boolean addBook(BookModel book);

	public abstract int deleteBook(String bookId);

	public abstract int updateBook(BookModel book);

	public abstract List<BookModel> getBookByAuthor(String author);

	public abstract List<BookModel> getBookByName(String book);

	public abstract List<BookModel> getAllBook();
}

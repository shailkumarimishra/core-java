package com.onlinelibrary.service.impl;

import java.util.List;

import com.book.model.BookDetailsModel;
import com.onlinelibrary.service.BookService;

public class BookServiceImpl extends BookService {

	@Override
	public boolean addBook(BookDetailsModel book) {
		return false;
	}

	@Override
	public boolean verifyUser(String User, String password) {
		return false;
	}

	@Override
	public int deleteBook(String bookId) {
		return 0;
	}

	@Override
	public int updateBook(BookDetailsModel book) {
		return 0;
	}

	@Override
	public List<BookDetailsModel> getBookByAuthor(String author) {
		return null;
	}

	@Override
	public List<BookDetailsModel> getBookByName(String book) {
		return null;
	}

	@Override
	public List<BookDetailsModel> getAllBook() {
		return null;
	}

}

package com.onlinelibrary.dao.impl;

import java.util.List;

import com.onlinelibrary.dao.BookDao;
import com.onlinelibrary.model.BookModel;

public class BookDaoImpl implements BookDao {

	@Override
	public boolean addBook(BookModel book) {
		
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
	public int updateBook(BookModel book) {
		return 0;
	}

	@Override
	public List<BookModel> getBookByAuthor(String author) {
		return null;
	}

	@Override
	public List<BookModel> getBookByName(String book) {
		return null;
	}

	@Override
	public List<BookModel> getAllBook() {
		return null;
	}

}

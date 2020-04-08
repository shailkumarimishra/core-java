package com.onlinelibrary.client;

import java.util.List;

import com.onlinelibrary.model.BookModel;
import com.onlinelibrary.service.impl.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookModel book= new BookModel("pm103", "Project Management","R.k sinha","Arya publication",8,550.65);
		BookServiceImpl bookImpl=new BookServiceImpl();
//		bookImpl.addBook(book);
//		bookImpl.deleteBook("db102");
//		book.setPublication("Abc publication");
//		book.setBookId("db102");
//		bookImpl.updateBook(book);
//		List<BookModel> bookByAuthor = bookImpl.getBookByAuthor("R.k sinha");
//		bookByAuthor.forEach(System.out::println);
//		List<BookModel> bookByName = bookImpl.getBookByName("Dbms");
//		bookByName.forEach(System.out::println);
		List<BookModel> allBook = bookImpl.getAllBook();
		allBook.forEach(System.out::println);

	}

}

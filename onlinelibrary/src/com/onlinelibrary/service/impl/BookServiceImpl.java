package com.onlinelibrary.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlinelibrary.model.BookModel;
import com.onlinelibrary.service.BookService;
import com.onlinelibrary.util.OnlineLibraryUtil;

public class BookServiceImpl implements BookService {

	@Override
	public boolean addBook(BookModel book) {
		boolean flag=false;
		try(Connection con=OnlineLibraryUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?,?,?)")){
			ps.setString(1,book.getBookId());
			ps.setString(2,book.getBookName());
			ps.setString(3,book.getAuthorName());
			ps.setString(4,book.getPublication());
			ps.setInt(5,book.getEdition());
			ps.setDouble(6,book.getCost());
			int insert = ps.executeUpdate();
			if(insert==1) {
				System.out.println("Book successfully added...");
				flag=true;
			}
			else {
				System.out.println("Book not added!!");
			}
			
		} catch (SQLException e) {
			System.out.println("This BookId already exist!!");
		}
		return flag;
	}

	@Override
	public int deleteBook(String bookId) {
		try(Connection con=OnlineLibraryUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from book where book_id=?")){
			ps.setString(1,bookId);
			int delete = ps.executeUpdate();
			if(delete==1) {
				System.out.println("BookId: "+bookId+" Successfully deleted...");
			}
			else {
				System.out.println("BookId: "+bookId+" doesn't exist!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateBook(BookModel book) {
		int update=0;
		try(Connection con=OnlineLibraryUtil.getConnection();
		    PreparedStatement ps=con.prepareStatement("update book set publication=? where book_id=?")){
			ps.setString(1,book.getPublication());
			ps.setString(2,book.getBookId());
			 update = ps.executeUpdate();
			if(update==1) {
				System.out.println("BookId: "+book.getBookId()+" Successfully updated...");
			}
			else {
				System.out.println("This book doesn't exist!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return update;
	}

	@Override
	public List<BookModel> getBookByAuthor(String author) {
		List<BookModel>list=new ArrayList<>();
		try(Connection con=OnlineLibraryUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from book where author_name=?")){
			ps.setString(1,author);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BookModel book=new BookModel();
				String bookId = rs.getString(1);
				String bookName = rs.getString(2);
				String authorName = rs.getString(3);
				String publication = rs.getString(4);
				int edition = rs.getInt(5);
				double cost = rs.getDouble(6);
				book.setBookId(bookId);
				book.setBookName(bookName);
				book.setAuthorName(authorName);
				book.setPublication(publication);
				book.setEdition(edition);
				book.setCost(cost);
				list.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<BookModel> getBookByName(String book) {
		List<BookModel>list=new ArrayList<>();
		try(Connection con=OnlineLibraryUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from book where book_name=?")){
			ps.setString(1,book);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BookModel books=new BookModel();
				String bookId = rs.getString(1);
				String bookName = rs.getString(2);
				String authorName = rs.getString(3);
				String publication = rs.getString(4);
				int edition = rs.getInt(5);
				double cost = rs.getDouble(6);
				books.setBookId(bookId);
				books.setBookName(bookName);
				books.setAuthorName(authorName);
				books.setPublication(publication);
				books.setEdition(edition);
				books.setCost(cost);
				list.add(books);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<BookModel> getAllBook() {
		List<BookModel>list=new ArrayList<>();
		try(Connection con=OnlineLibraryUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from book")){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				BookModel books=new BookModel();
				String bookId = rs.getString(1);
				String bookName = rs.getString(2);
				String authorName = rs.getString(3);
				String publication = rs.getString(4);
				int edition = rs.getInt(5);
				double cost = rs.getDouble(6);
				books.setBookId(bookId);
				books.setBookName(bookName);
				books.setAuthorName(authorName);
				books.setPublication(publication);
				books.setEdition(edition);
				books.setCost(cost);
				list.add(books);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}

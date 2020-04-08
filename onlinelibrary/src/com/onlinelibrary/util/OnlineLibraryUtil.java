package com.onlinelibrary.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.onlinelibrary.constant.OnlineLibraryConstant;

public class OnlineLibraryUtil {
	static {
		ResourceBundle rb=ResourceBundle.getBundle(OnlineLibraryConstant.COSTANTCLASS);
		try {
			Class.forName(rb.getString(OnlineLibraryConstant.DRIVER));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		ResourceBundle rb=ResourceBundle.getBundle(OnlineLibraryConstant.COSTANTCLASS);
		Connection con = DriverManager.getConnection(rb.getString(OnlineLibraryConstant.URL),
				                                     rb.getString(OnlineLibraryConstant.USERNAME),
				                                     rb.getString(OnlineLibraryConstant.PASSWORD));

		return con;
	}
}

package com.onlinelibrary.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.onlinelibrary.model.UserModel;
import com.onlinelibrary.service.UserService;
import com.onlinelibrary.util.OnlineLibraryUtil;

public class UserServiceImpl implements UserService {

	@Override
	public boolean verifyUser(UserModel user) {
		boolean flag= false;
		try (Connection con = OnlineLibraryUtil.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into user_info values(?,?)")) {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			int insert = ps.executeUpdate();
			if (insert==1) {
				System.out.println("Account Successfully created...");
				flag=true;
			} else {
				System.out.println("Account not created!!");
				flag=false;
			}

		} catch (SQLException e) {
			System.out.println("Username already taken!!");
		}
		return flag;
	}

}

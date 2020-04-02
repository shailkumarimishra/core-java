package com.qportal.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qportal.domain.RegistrationDomain;
import com.qportal.model.Registration;
import com.qportal.constant.JdbcUtil;

public class RegistrationDAOImpl implements RegistrationDAO {
	@Override
	public void insert(String username, String email, String password, String confirm_password) {
		try (Connection con = JdbcUtil.getMySQLConnection();
				PreparedStatement ps = con.prepareStatement("insert into registration(?,?,?,?)")) {

			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, confirm_password);
			int x = ps.executeUpdate();
			if (x == 1)
				System.out.println("Record inserted successfully");
			else
				System.out.println("Record not inserted");
//			JdbcUtil.cleanUp(ps, con);
		} catch (SQLException e) {
			System.out.println("Exception occur while inserting the record");
		}

	}

	@Override
	public boolean save(RegistrationDomain reg) {
		boolean flag = false;
		try (Connection con = JdbcUtil.getMySQLConnection();
				PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?)")) {
			ps.setString(1, reg.getUsername());
			ps.setString(2, reg.getEmail());
			ps.setString(3, reg.getPassword());
			ps.setString(4, reg.getConfirm_password());
			int x = ps.executeUpdate();

			if (x == 1) {
				System.out.println("Record inserted successfully");
				flag = true;
			} else {
				System.out.println("Record not inserted");
				flag = false;
			}
		} catch (SQLException e) {
			System.out.println("Exception occur while inserting the record");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<RegistrationDomain> findAll() {
		List<RegistrationDomain> list = new ArrayList<>();
		try (Connection con = JdbcUtil.getMySQLConnection();
				PreparedStatement ps = con.prepareStatement("select * from registration")) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
				RegistrationDomain reg = new RegistrationDomain();
				reg.setUsername(rs.getString(1));
				reg.setEmail(rs.getString(2));
				reg.setPassword(rs.getString(3));
				reg.setConfirm_password(rs.getString(4));
				list.add(reg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public RegistrationDomain findOneUser(String useremail, String password) {
		RegistrationDomain reg= new RegistrationDomain();
		try(Connection con = JdbcUtil.getMySQLConnection();
				PreparedStatement ps = con.prepareStatement("Select * from registration where email=?")) {
			ps.setString(1, "email");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				reg.setUsername(rs.getString(1));
				reg.setEmail(rs.getString(2));
				reg.setPassword(rs.getString(3));
				reg.setConfirm_password(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reg;
	}

	@Override
	public int deleteUser(String useremail) {
		try(Connection con=JdbcUtil.getMySQLConnection();
			PreparedStatement ps=con.prepareStatement("delete from registration where email=?")){
			ps.setString(1,useremail);
			int i = ps.executeUpdate();
			if(i==1) {
				System.out.println("Account Deleted Permanently...");
			}
			else {
				System.out.println("Invalid Account!! Please enter a valid username...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}

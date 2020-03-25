package com.qportal.service.impl;

import java.util.List;

import com.qportal.model.Registration;
public interface RegistrationService {
	public void insert(String username,String email,String password,String confirm_password);
	public boolean save(Registration reg);
	public List<Registration> getAllUser();
	public Registration getOneUser(String useremail,String password);
	public String deleteUser(String useremail);
}

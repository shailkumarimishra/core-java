package com.qportal.dao.impl;

import java.util.List;

import com.qportal.domain.RegistrationDomain;
import com.qportal.model.Registration;
public interface RegistrationDAO {
	public void insert(String username,String email,String password,String confirm_password);
	public boolean save(RegistrationDomain reg);
	public List<RegistrationDomain> findAll();
	public RegistrationDomain findOneUser(String useremail,String password);
	public int deleteUser(String useremail);
}

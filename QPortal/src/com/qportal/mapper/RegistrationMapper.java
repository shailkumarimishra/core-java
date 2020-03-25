package com.qportal.mapper;

import java.util.List;

import com.qportal.domain.RegistrationDomain;
import com.qportal.model.Registration;

public interface RegistrationMapper {
	public List<Registration> mapToUser(List<RegistrationDomain> domain);
	public List<RegistrationDomain> mapToUserDomain(List<Registration> users);
	public RegistrationDomain mapToUserDomain(Registration user);
	public Registration mapToUser(RegistrationDomain domain);
}

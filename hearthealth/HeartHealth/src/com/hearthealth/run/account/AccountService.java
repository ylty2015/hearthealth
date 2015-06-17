package com.hearthealth.run.account;

import java.util.List;

import com.hearthealth.run.bo.User;

public interface AccountService {
	//Query all doctors
	public List<User> queryAllDoctors();
	
	//Register a doctor in the system.
	public boolean registerUser(User user);
}

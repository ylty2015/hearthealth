package com.hearthealth.run.account;

import java.util.List;

import com.hearthealth.run.bo.User;

public interface AccountDao {
	/** Query all doctors in the system,which equal to common user,relatively to the administrator */
	public List<User> queryAllDoctors();
	
	public boolean registerUser(User user);

}

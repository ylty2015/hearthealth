package com.hearthealth.run.account;

import java.util.List;

import com.hearthealth.run.bo.User;

public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	
	

	@Override
	public List<User> queryAllDoctors() {
		return accountDao.queryAllDoctors();
	}



	public AccountDao getAccountDao() {
		return accountDao;
	}



	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	

}

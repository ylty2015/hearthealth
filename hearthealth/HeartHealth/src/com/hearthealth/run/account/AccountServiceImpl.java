package com.hearthealth.run.account;

public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	
	

	@Override
	public void queryAllDoctors() {
		
	}



	public AccountDao getAccountDao() {
		return accountDao;
	}



	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	

}

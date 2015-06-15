package com.hearthealth.run.account;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	//The action execution was successful,and the user is administrator.Dispatch to 
	// the admin homepage.
	private final static String ADMIN = "admin";
	
	private AccountService accountService;
	
	
	
	private String username;
	private String password;
	
	

	@Override
	public String execute() throws Exception {
		if(UserManager.isAdminValid(username, password)){
			
			return "admin";
		}
		if(UserManager.isValidUser(username, password)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}

	
	
	
	public AccountService getAccountService() {
		return accountService;
	}




	public void setAccountService(AccountService accountService) {
		System.out.println("------------------set account service---------------------------");
		this.accountService = accountService;
	}




	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



}

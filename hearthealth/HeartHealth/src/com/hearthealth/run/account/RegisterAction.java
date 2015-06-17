package com.hearthealth.run.account;

import org.apache.log4j.Logger;

import com.hearthealth.run.bo.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private final static Logger logger = Logger.getLogger(RegisterAction.class);
	
	private AccountService accountService;
	
	private String username;
	private String realName;
	private String password;
	
	@Override
	public String execute() throws Exception {
		logger.info("start of the RegisterAction.-----------------------------------------");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRealName(realName);
		if(accountService.registerUser(user)){
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
		this.accountService = accountService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}

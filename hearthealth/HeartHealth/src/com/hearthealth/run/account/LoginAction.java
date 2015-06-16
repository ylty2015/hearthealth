package com.hearthealth.run.account;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.hearthealth.run.bo.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private final static Logger logger = Logger.getLogger(LoginAction.class);
	private static final long serialVersionUID = -4024140820452517346L;

	//The action execution was successful,and the user is administrator.Dispatch to 
	// the admin homepage.
	private final static String ADMIN = "admin";
	
	private AccountService accountService;
	
	
	
	private String username;
	private String password;
	
	private List<User> userList;
	private String userList_json;
	
	

	@Override
	public String execute() throws Exception {
		if(UserManager.isAdminValid(username, password)){
			if(accountService==null){
				logger.info("accountService is null");
				return ERROR;
			}
			userList = accountService.queryAllDoctors();
			userList_json = JSONArray.fromObject(userList).toString();
			logger.info("the json string of userlist:"+userList_json);
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




	public List<User> getUserList() {
		return userList;
	}




	public void setUserList(List<User> userList) {
		this.userList = userList;
	}




	public String getUserList_json() {
		return userList_json;
	}




	public void setUserList_json(String userList_json) {
		this.userList_json = userList_json;
	}



}

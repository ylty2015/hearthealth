package com.hearthealth.run.account;
/**
 * Manager everything user-related,such as add a user,update a user ,delete a user
 * ,check user is a valid user,check the role of user
 * @author Administrator
 *
 */
public class UserManager {
	/**
	 * check a user is administrator or not
	 */
	public static  boolean isAdmin(String username){
		return "admin".equals(username);
	}
	
	/**
	 * check the admin is valid
	 */
	public static boolean isAdminValid(String username,String password){
		return "admin".equals(username)&&"admin".equals(password);
	}
	
	/**
	 * Check wether a  user is valid  or not
	 */
	public static boolean isValidUser(String username,String password){
		return "zhangsan".equals(username)&&"000000".equals(password);
	}

}

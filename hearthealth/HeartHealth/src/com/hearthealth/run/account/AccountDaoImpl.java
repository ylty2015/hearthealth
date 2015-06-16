package com.hearthealth.run.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hearthealth.run.bo.User;

public class AccountDaoImpl implements AccountDao{
	private final static Logger logger = Logger.getLogger(AccountDaoImpl.class);

	@Override
	public List<User> queryAllDoctors() {
		List<User> list = new ArrayList<User>();
		Connection conn = createDBConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("select * from user");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			while(rs.next()){
				User user = new User();
				String username = rs.getString("username");
				String realName = rs.getString("real_name");
				user.setUsername(username);
				user.setRealName(realName);
				logger.info("username:"+username+"|realName:"+realName);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * craete the database connection.
	 */
	private Connection createDBConnection(){
		Connection conn = null;
		//Register the mysql driver.
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.error("Can not find mysql jdbc driver.");
		}
		
		String url = "jdbc:mysql://localhost:3306/heart_health";
		String user = "user1";
		String password = "000000";
		
		//Create the database connection
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}

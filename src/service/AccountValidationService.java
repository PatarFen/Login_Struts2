package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AccountValidationService {
	
	private ResultSet ps;
	private boolean result;
	
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/assignment", "root", "1234567890");
	}
	
	public boolean vildateAccount(String user, String password) {
		try {
	    	ps = conn().createStatement().executeQuery("SELECT user, password FROM accounts WHERE user='" + user+ "' \r\n" + 
	    			"AND password= '"+password+"'");
	        result = ps.next();
	    	}catch(Exception e){
	    		e.printStackTrace();
	    }
		return result;
	}
}

package action;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import service.AccountValidationService;

public class LoginAction {
	
	private String user;
	private String password;
	//private ResultSet ps;
	//private boolean result;
	private String message;
	
	//public static Connection conn() throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		//return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/assignment", "root", "1234567890");
		
	//}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
    public String execute() {
    	
    	//try {
    	//ps = conn().createStatement().executeQuery("SELECT user, password FROM accounts WHERE user='" + user+ "' \r\n" + 
    			//"AND password= '"+password+"'");
        //result = ps.next();
    	//System.out.println("pass the DB" + ps.next());
    	//}catch(Exception e){
    		//e.printStackTrace();
    //}
    	AccountValidationService accountValidationService = new AccountValidationService();
    	if (accountValidationService.vildateAccount(getUser(), getPassword())) {
    		return "success";
    	}else {
    		setMessage("Login Fail, please try again");
    		return "login";
    	}
    	//if (getUser().equals("user") && getPassword().equals("password")) {
    		//return "success";
    	//}else {
    		//return "login";
    	//}
    }




}

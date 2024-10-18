package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Entity.User;


public class UserService {
	private static Connection conn;
	
	private Statement stmnt;
	
	public void Connection() {	 
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root","Iru@1234");	
		}catch(Exception e) {
			System.out.println("database not connected properly!!!!");
			e.printStackTrace();
		}
	}
	
	public boolean register(User user) {
		try {
			stmnt=conn.createStatement();
			stmnt.executeUpdate("insert into register values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"')");
			return true;
			
		}catch(Exception e) {
			System.out.println("user is not Registered!!!!,Try Again");
			e.printStackTrace();
			return false;
		}	
	}	
	
	
	public boolean login(String email, String password) {
	    String query = "SELECT * FROM register WHERE email = ? AND password = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(query)) {
	        pstmt.setString(1, email);
	        pstmt.setString(2, password);
	        ResultSet resultSet = pstmt.executeQuery();
	        if (resultSet.next()) {
	            return true;
	        } else {
	            return false;
	        }
	    } catch (Exception e) {
	        System.out.println("Error during login: " + e.getMessage());
	        return false;
	    } finally {
	        closeConnection(); 
	    }
	}

	
	
	private static void closeConnection() {
		try {
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	

}

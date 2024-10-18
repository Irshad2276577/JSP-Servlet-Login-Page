package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import Entity.User;
import Model.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String password = request.getParameter("password");
         
         User user=new User(name,email,password);
         UserService service=new UserService();
         
         service.Connection();
         
         boolean register = service.register(user);
         if(register) {
        	 System.out.println("Successfully Registered");
         }else {
        	 System.out.println("Not Registred");
         }
         
         
        
	}

}

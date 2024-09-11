package mypack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class StudentSrevelet
 */
public class StudentSrevelet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    String name=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    String contact=request.getParameter("contact");
    String gender=request.getParameter("gender");
    String address=request.getParameter("address");
    System.out.println("First name: "+name);
    System.out.println("Last name  :"+lname);
    System.out.println(" password: "+password);
    System.out.println(" contact: "+contact);
    System.out.println("Gender : "+gender);
    System.out.println("Address: "+address);
    
    

	}

}

package servletJdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;

	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingdb", "root", "root");
			System.out.println("Conection Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("uid");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		System.out.println("uid"+uid+":");
		System.out.println("pass"+pass+":");
		System.out.println("fname"+fname+":");
		System.out.println("mname"+mname+":");
		System.out.println("lname"+lname+":");
		System.out.println("email"+email+":");
		System.out.println("con"+contact+":");
		PreparedStatement ps = null;
		//ResultSet rs = null;
		try {
			
           ps=connection.prepareStatement("insert into users values(?,?,?,?,?,?,?) ");
           ps.setString(1, uid);
           ps.setString(2, pass);
           ps.setString(3, fname);
           ps.setString(4, mname);
           ps.setString(5, lname);
           ps.setString(6, email);
           ps.setString(7, contact);
           System.out.println(uid+":"+pass);
          int  result=ps.executeUpdate();
          System.out.println(result);
          if(result==1) {
        	  response.sendRedirect("/ServletJDBC/Login.html");
          }
          else {
                response.sendRedirect("/ServletJDBC/RegisterForm.html");
		}
          System.out.println(result+"Rows Updated ");
		} catch (Exception e) {
			System.out.println("reg not done");
            out.print("Failed to register");
			e.printStackTrace();
		}
	}

}

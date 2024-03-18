package servletJdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("/loginJdbc")
public class ServletJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shoppingdb";
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Done");

		} catch (Exception e) {
			e.getStackTrace();
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
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement("select * from users where u_id=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			boolean flag = false;
			while (rs.next()) {
				if (rs.getString(1).equals(uid) && rs.getString(2).equals(pass)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				//out.print("<h1>Login Success</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("/home");
				rd.forward(request, response);
			} else {
				//out.print("<h1>Invalid Credentials</h1>");
				response.sendRedirect("/ServletJDBC/Login.html");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

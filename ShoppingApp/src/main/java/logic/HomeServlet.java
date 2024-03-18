package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		connection = (Connection) config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/header");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		ResultSet resultSet = null;
		Statement statement = null;

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from category");
			while (resultSet.next()) {
				out.print("<a href='getProducts?catid=" + resultSet.getInt(1) + "'>");
				out.print(resultSet.getString(2));
				out.print("</a>");
				out.print("<br/>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

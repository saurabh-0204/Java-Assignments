package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		connection = (Connection) config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if (session != null) {
			Timestamp date = new Timestamp(new java.util.Date().getTime());
			// jdbc
			PreparedStatement ps = null;

			try {
				ps = connection.prepareStatement("UPDATE logdetails SET logOut = ? WHERE logOut is null");
				ps.setTimestamp(1, date);
				ps.executeUpdate();

				out.print("<br/> You are logged out successfully ");
				out.print("<br/> <a href='Login.jsp'> Login again? </a> ");
				session.invalidate();


			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// rs.close();
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

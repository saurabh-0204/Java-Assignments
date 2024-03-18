package logic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/loginCheck")
public class LoginServlet extends HttpServlet {
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
		//PrintWriter out = response.getWriter();
		String uid = request.getParameter("uid");
		String pass = request.getParameter("pass");
		Timestamp date=new Timestamp(new java.util.Date().getTime());
		ResultSet rs = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;

		try {
			ps = connection.prepareStatement("select *  from users where u_id=? and password=?");
			ps1=connection.prepareStatement("insert into logdetails (u_id,logIn) values(?,?)");
			ps.setString(1, uid);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			ps1.setString(1, uid);
			ps1.setTimestamp(2, date);
			boolean flag = false;
			User user=null;
			while (rs.next()) {
				if (rs.getString(1).equals(uid) && rs.getString(2).equals(pass)) {
					 user=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
					flag = true;
					break;
				}
			}
			if (flag) {
				// out.print("<h1> Welcome" + uid + " </h1>");
             ps1.executeUpdate();
				Cookie[] cookie = request.getCookies();
				if (cookie != null) {
					for (Cookie c : cookie) {
						if (c.getName().equals("loginError")) {
							c.setMaxAge(0);
							response.addCookie(c);
						}
					}
				}
                HttpSession session=request.getSession();
                session.setAttribute("loggedinuser", user);
				RequestDispatcher rd = request.getRequestDispatcher("/home");
				
				rd.forward(request, response);

			} else {
				// out.print("<h1> Invalid Credintials </h1>");
				Cookie c = new Cookie("loginError", "Wrong_UID/pwd");
				response.addCookie(c);
				response.sendRedirect("/ShoppingApp/Login.jsp");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/confirmcart")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection) config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String uid = ((User) session.getAttribute("loggedinuser")).getUid();
		Timestamp cdate = new Timestamp(new Date().getTime());
		float total = (Float) session.getAttribute("tprice");

		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("insert into shopping(user_id,shoppingDate,totalprice) values(?,?,?)");
			ps.setString(1, uid);
			ps.setTimestamp(2, cdate);
			ps.setString(3,total+"");
			int n = ps.executeUpdate();
			if (n == 1) {
				out.print("<br/> Order is confirmed");
				out.print("<br/> Bill will be mailed at " + ((User) session.getAttribute("loggedinuser")).getEmail());
				out.print("<br/> You will receive the message on "
						+ ((User) session.getAttribute("loggedinuser")).getContact() + " before delivery ");
				out.print("<br/> <a href='logout'> Logout </a>");

				// remove cart attribute from session //}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

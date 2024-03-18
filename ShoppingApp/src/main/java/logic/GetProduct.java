package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getProducts")
public class GetProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		connection=(Connection)config.getServletContext().getAttribute("jdbccon");
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
		PreparedStatement ps = null;
		try {
			int cid = Integer.parseInt(request.getParameter("catid"));
			ps = connection.prepareStatement("select * from product where cat_id=?");
			ps.setInt(1, cid);
			resultSet=ps.executeQuery();
			out.print("<form action='addtocart'>");
			out.print("Select Product: ");
			out.print("<select name='product'>");
			while(resultSet.next()) {
				out.print("<option value='"+resultSet.getInt(1)+"'>");
				out.print(resultSet.getString(2));
				out.print("</option>");
			}
			out.print("</select><br/>");
			out.print("<input type='submit' value='Add To Cart'/>");
			out.print("</form>");
			out.print("<a href='home'>Go Back to Categories</a>");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
